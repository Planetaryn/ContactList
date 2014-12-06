import java.io.Serializable;
import java.util.*;

/**
 * Define a reusable class ContactList. One object of class ContactList contains
 * Person objects.
 * 
 * @author noahgoldsmith
 */
@SuppressWarnings("serial")
public class ContactList implements Serializable {
	private ArrayList<Person> contactList;

	/**
	 * Constructs a new object of class ContactList.
	 * 
	 * @author noahgoldsmith
	 */
	public ContactList() {
		contactList = new ArrayList<Person>();
	}

	/**
	 * This method returns the size of the contactList.
	 * 
	 * @return
	 * @author noahgoldsmith
	 */
	public int getSize() {
		return contactList.size();
	}

	/**
	 * Adds a Person object to the contactList.
	 * 
	 * @param newPerson
	 * @author noahgoldsmith
	 */
	public void addPerson(Person person) {
		contactList.add(person);
		this.sortByField(Main.relayGSortField());
	}

	/**
	 * Returns the ArrayList contactList.
	 * 
	 * @return
	 * @author noahgoldsmith
	 */
	public ArrayList<Person> getList() {
		return contactList;
	}

	/**
	 * Returns the specified person object.
	 * 
	 * @return
	 * @author noahgoldsmith
	 */
	public Person getPerson(int index) {
		return contactList.get(index);
	}

	/**
	 * Returns the objects in the contact list that match the search in a new
	 * ContactList object.
	 * 
	 * @param searchField
	 *            , searchValue
	 * @return
	 * @author shmuelshaffer (modified by noahgoldsmith)
	 */
	public ContactList searchForField(String searchField, String searchValue) {
		String searchedField = "";
		ContactList matchingContacts = new ContactList();
		for (int i = 0; i < contactList.size(); i++) {
			switch (searchField) {
			case "Last Name":
				searchedField = contactList.get(i).getLastName().toLowerCase();
				if (searchedField.toLowerCase().equals(
						searchValue.toLowerCase())) {
					matchingContacts.addPerson(contactList.get(i));
				}
				break;

			case "ZIP code":
				searchedField = contactList.get(i).getZip().toLowerCase();
				if (searchedField.toLowerCase().equals(
						searchValue.toLowerCase())) {
					matchingContacts.addPerson(contactList.get(i));
				}
				break;

			case "Email":
				searchedField = contactList.get(i).getEmail().toLowerCase();
				if (searchedField.toLowerCase().equals(
						searchValue.toLowerCase())) {
					matchingContacts.addPerson(contactList.get(i));
				}
				break;
			}
		}
		return matchingContacts;
	}

	/**
	 * This method sorts the ContactList by the field specified by the parameter
	 * sortField.
	 * 
	 * @param SortField
	 * @return
	 * @author noahgoldsmith
	 */
	public void sortByField(String sortField) {
		String sortFieldI;
		String sortFieldIIPlusOne;
		Person tempPerson = new Person();
		if (sortField == "Name") {
			for (int sortIndex = 0; sortIndex < 2; sortIndex++) {
				for (int i = 0; i < contactList.size() - 1; i++) {
					for (int j = 0; j < contactList.size() - 1 - i; j++) {

						if (sortIndex == 0) { // first sort on first name
							sortFieldI = contactList.get(j).getFirstName();
							sortFieldIIPlusOne = contactList.get(j + 1)
									.getFirstName();
						} else { // Sort on second name after the sort on first
									// name
									// is complete
							sortFieldI = contactList.get(j).getLastName();
							sortFieldIIPlusOne = contactList.get(j + 1)
									.getLastName();
						}
						sortFieldI = sortFieldI.toLowerCase();
						sortFieldIIPlusOne = sortFieldIIPlusOne.toLowerCase();
						if (sortFieldI.compareTo(sortFieldIIPlusOne) > 0) {
							// need to swap Person Objects
							tempPerson = contactList.get(j);
							contactList.remove(j);
							contactList.add(j + 1, tempPerson);

						}

					}
				}

			}
		}
	}
}