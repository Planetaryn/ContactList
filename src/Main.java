import java.awt.EventQueue;

/**
 * This class controls the operation of the contact list program. It has methods
 * which initialize the GUI and creates a new contact list or opens an existing
 * contact list.
 * 
 * @author noahgoldsmith
 */
public class Main {

	private static ContactList list;
	private static ContactList matchingContacts;
	private static GUI window;
	@SuppressWarnings("unused")
	private static GUINotification dialog;
	private static Disk disk = new Disk();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {

			/**
			 * This method creates and opens a new GUI.
			 */
			@Override
			public void run() {
				try {
					openList();
					window = new GUI();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

		});

	}

	/**
	 * This method notifies the user that no match was found for their search.
	 * 
	 * @author noahgoldsmith
	 */
	public static void notifyNoSearchMatch() {
		try {
			dialog = new GUINotification("No Match Found", "Please try again.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method creates a new contact list, and populates it with the data
	 * stored on the disk. If there is no list stored on the disk it leaves the
	 * new list empty.
	 * 
	 * @author noahgoldsmith
	 */
	private static void openList() {
		if (disk.readFromDisk() == true) {
			list = disk.getDiskFileObject();
		} else {
			list = new ContactList();
		}
	}

	/**
	 * This method writes the list to disk when the program is closed.
	 * 
	 * @author noahgoldsmith
	 */
	public static void saveList() {
		disk.writeToDisk(list);
	}

	/**
	 * This method returns the person in the list at the index specified by the
	 * parameter.
	 * 
	 * @param index
	 *            , selectedList
	 * @return
	 * @author noahgoldsmith
	 */
	public static Person getPersonAtIndex(int index, String selectedList) {
		Person personAtIndex = new Person();
		switch (selectedList) {
		case "Contact List":
			personAtIndex = list.getPerson(index);
			break;
		case "Search Results":
			if (matchingContacts != null) {
				personAtIndex = matchingContacts.getPerson(index);
			}
			break;
		default:
			personAtIndex = list.getPerson(index);
		}

		return personAtIndex;
	}

	/**
	 * This method returns the size of the array.
	 * 
	 * @param selectedList
	 * @return
	 * @author noahgoldsmith
	 */
	public static int getSize(String selectedList) {
		int size = 0;
		switch (selectedList) {
		case "Contact List":
			size = list.getSize();
			break;
		case "Search Results":
			if (matchingContacts != null) {
				size = matchingContacts.getSize();
			}
			break;
		default:
			size = 0;
		}
		return size;
	}

	/**
	 * This method searches the list for the values specified by the GUI, then
	 * returns a new ContactList containing the results. If no match is found,
	 * it will notify the user through the GUI.
	 * 
	 * @param searchField
	 *            , searchValue
	 * @return
	 * @author noahgoldsmith
	 */
	public static void searchList(String searchField, String searchValue) {
		matchingContacts = new ContactList();
		matchingContacts = list.searchForField(searchField, searchValue);
		if (matchingContacts.getSize() <= 0) {
			notifyNoSearchMatch();
		}
	}

	/**
	 * This method sorts the list by the field specified in the GUI. (For this
	 * version of the program, sortField is always lastName).
	 * 
	 * @param sortField
	 * @author noahgoldsmith
	 */
	public static void sortList(String sortField) {
		list.sortByField(sortField);
	}

	/**
	 * This method sets up a new person and adds it to the list.
	 * 
	 * @author noahgoldsmith
	 */
	public static void addPerson() {
		Person person = new Person();
		if (list.getSize() == 0) {
			list.addPerson(person);
		} else {
			if (checkLastName() == true && checkFirstName() == true) {
				list.addPerson(person);
			}
		}
	}

	/**
	 * This method removes the selected person from the list
	 * 
	 * @author noahgoldsmith
	 */
	public static void removePerson() {
		list.removePerson(list.getPerson(window.getPersonIndex()));
	}

	/**
	 * This method checks to see if all person objects in the list have a last
	 * name. If they do not, it notifies the user.
	 * 
	 * @return
	 * @author noahgoldsmith
	 */
	public static boolean checkLastName() {
		boolean hasLastName = true;
		for (int i = 0; i < list.getSize(); i++) {
			if (list.getPerson(i).getLastName().isEmpty()) {
				hasLastName = false;
				try {
					dialog = new GUINotification(
							("Error: A person has no last name!"),
							"You must enter a last name for "
									+ list.getPerson(i).getFirstName() + "!");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		return hasLastName;
	}

	/**
	 * This method checks to see if all person objects in the list have a last
	 * name. If they do not, it notifies the user.
	 * 
	 * @return
	 * @author noahgoldsmith
	 */
	public static boolean checkFirstName() {
		boolean hasFirstName = true;
		for (int i = 0; i < list.getSize(); i++) {
			if (list.getPerson(i).getFirstName().isEmpty()) {
				hasFirstName = false;
				try {
					dialog = new GUINotification(
							("Error: A person has no first name!"),
							"You must enter a first name for "
									+ list.getPerson(i).getLastName() + "!");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		return hasFirstName;
	}

	/**
	 * This method finds a person by the specified UUID. It then returns that
	 * persons index in the list.
	 * 
	 * @param uuid
	 * @return
	 * @author noahgoldsmith
	 */
	public static int findUUID(String uuid) {
		int index = -1;
		boolean found = false;
		do {
			index++;
			if (list.getPerson(index).getUUID() == uuid) {
				;
				found = true;
			}
		} while (index < list.getSize() && found == false);
		return (index);
	}

	/**
	 * This method updates all fields in the specified Person object and it's
	 * StreetAddress object. If there is no person currently selected in the
	 * GUI, the method will not run.
	 * 
	 * @param shownList
	 * @param firstName
	 * @param lastName
	 * @param email
	 * @param phoneNumber
	 * @param notes
	 * @param houseNumber
	 * @param street
	 * @param zip
	 * @param city
	 * @param state
	 * @param country
	 * @author noahgoldsmith
	 */
	public static void updatePerson(String shownList, String firstName,
			String lastName, String email, String phoneNumber, String notes,
			String houseNumber, String street, String zip, String city,
			String state, String country) {

		if (window.getPersonIndex() != -1) {
			if (lastName.isEmpty()
					|| (firstName.isEmpty() || firstName == "New Person")) {
				try {
					dialog = new GUINotification("Error: Incomplete Name",
							"You must enter a first & last name for this person.");
				} catch (Exception e) {
					e.printStackTrace();
				}
			} else {
				if (list.getPerson(window.getPersonIndex()).verifyEmailFormat(
						email) == true
						&& list.getPerson(window.getPersonIndex())
								.verifyPhoneFormat(phoneNumber) == true
						&& shownList == "Contact List") {
					list.getPerson(window.getPersonIndex()).setFirstName(
							firstName);
					list.getPerson(window.getPersonIndex()).setLastName(
							lastName);
					list.getPerson(window.getPersonIndex()).setEmail(email);
					list.getPerson(window.getPersonIndex()).setPhoneNumber(
							phoneNumber);
					list.getPerson(window.getPersonIndex()).setNotes(notes);
					list.getPerson(window.getPersonIndex()).setHouseNumber(
							houseNumber);
					list.getPerson(window.getPersonIndex()).setStreet(street);
					list.getPerson(window.getPersonIndex()).setZip(zip);
					list.getPerson(window.getPersonIndex()).setCity(city);
					list.getPerson(window.getPersonIndex()).setState(state);
					list.getPerson(window.getPersonIndex()).setCountry(country);

				}
			}
		}

	}

	/**
	 * This method acts as a relay for GUI.getSortField(). It passes the value
	 * from class GUI to any other class.
	 * 
	 * @return
	 * @author noahgoldsmith
	 */
	public static String relayGSortField() {
		String sortField = "";
		if (window != null) {
			if (window.getSortField() != null) {
				sortField = window.getSortField();
			}
		} else {
			sortField = "Name";
		}
		return sortField;
	}

	/**
	 * This method acts as a relay for Person.getEmail It passes the value from
	 * class Person to class GUI, without the GUI ever touching class Person. It
	 * will return an empty string if no person is currently selected.
	 * 
	 * @param shownList
	 * @return
	 * @author noahgoldsmith
	 */
	public static String relayGEmail(String shownList) {
		String email = "";
		switch (shownList) {
		case "Contact List":
			if (window.getPersonIndex() != -1) {
				email = list.getPerson(window.getPersonIndex()).getEmail();
			}
			break;
		case "Search Results":
			if (window.getPersonIndex() != -1) {
				email = matchingContacts.getPerson(window.getPersonIndex())
						.getEmail();
			}
			break;
		}
		return email;
	}

	/**
	 * This method acts as a relay for Person.getPhoneNumber It passes the value
	 * from class Person to class GUI, without the GUI ever touching class
	 * Person.
	 * 
	 * @param shownList
	 * @return
	 * @author noahgoldsmith
	 */
	public static String relayGPhoneNumber(String shownList) {
		String phoneNumber = "";
		switch (shownList) {
		case "Contact List":
			if (window.getPersonIndex() != -1) {
				phoneNumber = list.getPerson(window.getPersonIndex())
						.getPhoneNumber();
			}
			break;
		case "Search Results":
			if (window.getPersonIndex() != -1) {
				phoneNumber = matchingContacts.getPerson(
						window.getPersonIndex()).getPhoneNumber();
			}
			break;
		}
		return phoneNumber;
	}

	/**
	 * This method acts as a relay for Person.getFirstName It passes the value
	 * from class Person to class GUI, without the GUI ever touching class
	 * Person. It will return an empty string if no person is currently
	 * selected.
	 * 
	 * @param shownList
	 * @return
	 * @author noahgoldsmith
	 */
	public static String relayGFirstName(String shownList) {
		String firstName = "";
		switch (shownList) {
		case "Contact List":
			if (window.getPersonIndex() != -1) {
				firstName = list.getPerson(window.getPersonIndex())
						.getFirstName();
			}
			break;
		case "Search Results":
			if (window.getPersonIndex() != -1) {
				firstName = matchingContacts.getPerson(window.getPersonIndex())
						.getFirstName();
			}
			break;
		}
		return firstName;
	}

	/**
	 * This method acts as a relay for Person.getLastName It passes the value
	 * from class Person to class GUI, without the GUI ever touching class
	 * Person. It will return an empty string if no person is currently
	 * selected.
	 * 
	 * @param shownList
	 * @return
	 * @author noahgoldsmith
	 */
	public static String relayGLastName(String shownList) {
		String lastName = "";
		switch (shownList) {
		case "Contact List":
			if (window.getPersonIndex() != -1) {
				lastName = list.getPerson(window.getPersonIndex())
						.getLastName();
			}
			break;
		case "Search Results":
			if (window.getPersonIndex() != -1) {
				lastName = matchingContacts.getPerson(window.getPersonIndex())
						.getLastName();
			}
			break;
		}
		return lastName;
	}

	/**
	 * This method acts as a relay for Person.getNotes It passes the value from
	 * class Person to class GUI, without the GUI ever touching class Person. It
	 * will return an empty string if no person is currently selected.
	 * 
	 * @param shownList
	 * @return
	 * @author noahgoldsmith
	 */
	public static String relayGNotes(String shownList) {
		String notes = "";
		switch (shownList) {
		case "Contact List":
			if (window.getPersonIndex() != -1) {
				notes = list.getPerson(window.getPersonIndex()).getNotes();
			}
			break;
		case "Search Results":
			if (window.getPersonIndex() != -1) {
				notes = matchingContacts.getPerson(window.getPersonIndex())
						.getNotes();
			}
			break;
		}
		return notes;
	}

	/**
	 * This method acts as a relay for StreetAddress.getHouseNumber It passes
	 * the value from class StreetAddress to class GUI, without the GUI ever
	 * touching class StreetAddress. It will return an empty string if no person
	 * is currently selected.
	 * 
	 * @param shownList
	 * @return
	 * @author noahgoldsmith
	 * 
	 */
	public static String relayGHouseNumber(String shownList) {
		String houseNumber = "";
		switch (shownList) {
		case "Contact List":
			if (window.getPersonIndex() != -1) {
				houseNumber = list.getPerson(window.getPersonIndex())
						.getHouseNumber();
			}
			break;
		case "Search Results":
			if (window.getPersonIndex() != -1) {
				houseNumber = matchingContacts.getPerson(
						window.getPersonIndex()).getHouseNumber();
			}
			break;
		}
		return houseNumber;
	}

	/**
	 * This method acts as a relay for StreetAddress.getStreet It passes the
	 * value from class StreetAddress to class GUI, without the GUI ever
	 * touching class StreetAddress. It will return an empty string if no person
	 * is currently selected.
	 * 
	 * @param shownList
	 * @return
	 * @author noahgoldsmith
	 * 
	 */
	public static String relayGStreet(String shownList) {
		String street = "";
		switch (shownList) {
		case "Contact List":
			if (window.getPersonIndex() != -1) {
				street = list.getPerson(window.getPersonIndex()).getStreet();
			}
			break;
		case "Search Results":
			if (window.getPersonIndex() != -1) {
				street = matchingContacts.getPerson(window.getPersonIndex())
						.getStreet();
			}
			break;
		}
		return street;
	}

	/**
	 * This method acts as a relay for StreetAddress.getZip It passes the value
	 * from class StreetAddress to class GUI, without the GUI ever touching
	 * class StreetAddress. It will return an empty string if no person is
	 * currently selected.
	 * 
	 * @param shownList
	 * @return
	 * @author noahgoldsmith
	 * 
	 */
	public static String relayGZip(String shownList) {
		String zip = "";
		switch (shownList) {
		case "Contact List":
			if (window.getPersonIndex() != -1) {
				zip = list.getPerson(window.getPersonIndex()).getZip();
			}
			break;
		case "Search Results":
			if (window.getPersonIndex() != -1) {
				zip = matchingContacts.getPerson(window.getPersonIndex())
						.getZip();
			}
			break;
		}
		return zip;
	}

	/**
	 * This method acts as a relay for StreetAddress.getCity It passes the value
	 * from class StreetAddress to class GUI, without the GUI ever touching
	 * class StreetAddress. It will return an empty string if no person is
	 * currently selected.
	 * 
	 * @param shownList
	 * @return
	 * @author noahgoldsmith
	 * 
	 */
	public static String relayGCity(String shownList) {
		String city = "";
		switch (shownList) {
		case "Contact List":
			if (window.getPersonIndex() != -1) {
				city = list.getPerson(window.getPersonIndex()).getCity();
			}
			break;
		case "Search Results":
			if (window.getPersonIndex() != -1) {
				city = matchingContacts.getPerson(window.getPersonIndex())
						.getCity();
			}
			break;
		}
		return city;
	}

	/**
	 * This method acts as a relay for StreetAddress.getState It passes the
	 * value from class StreetAddress to class GUI, without the GUI ever
	 * touching class StreetAddress. It will return an empty string if no person
	 * is currently selected.
	 * 
	 * @param shownList
	 * @return
	 * @author noahgoldsmith
	 * 
	 */
	public static String relayGState(String shownList) {
		String state = "";
		switch (shownList) {
		case "Contact List":
			if (window.getPersonIndex() != -1) {
				state = list.getPerson(window.getPersonIndex()).getState();
			}
			break;
		case "Search Results":
			if (window.getPersonIndex() != -1) {
				state = matchingContacts.getPerson(window.getPersonIndex())
						.getState();
			}
			break;
		}
		return state;
	}

	/**
	 * This method acts as a relay for StreetAddress.getCountry. It passes the
	 * value from class StreetAddress to class GUI, without the GUI ever
	 * touching class StreetAddress. It will return an empty string if no person
	 * is currently selected.
	 * 
	 * @param shownList
	 * @return
	 * @author noahgoldsmith
	 * 
	 */
	public static String relayGCountry(String shownList) {
		String country = "";
		switch (shownList) {
		case "Contact List":
			if (window.getPersonIndex() != -1) {
				country = list.getPerson(window.getPersonIndex()).getCountry();
			}
			break;
		case "Search Results":
			if (window.getPersonIndex() != -1) {
				country = matchingContacts.getPerson(window.getPersonIndex())
						.getCountry();
			}
			break;
		}
		return country;
	}

	/**
	 * This method returns the UUID of the person object currently selected in
	 * the JList.
	 * 
	 * @param shownList
	 * @return
	 * @author noahgoldsmith
	 */
	public static String relayGUUID(String shownList) {
		String uuid = "";
		switch (shownList) {
		case "Contact List":
			if (window.getPersonIndex() != -1) {
				uuid = list.getPerson(window.getPersonIndex()).getUUID();
			}
			break;
		case "Search Results":
			if (window.getPersonIndex() != -1) {
				uuid = matchingContacts.getPerson(window.getPersonIndex())
						.getUUID();
			}
			break;
		}
		return uuid;
	}

}
