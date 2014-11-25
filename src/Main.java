import java.awt.EventQueue;
import java.util.ArrayList;

/**
 * This class controls the operation of the contact list program. It has methods
 * which initialize the GUI and creates a new contact list or opens an existing
 * contact list.
 * 
 * @author noahgoldsmith
 */
public class Main {

	private static ContactList list;
	private static Person person;
	private static GUI window;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {

			/**
			 * This method creates and opens a new GUI
			 */
			public void run() {
				try {
					window = new GUI();
					window.frame.setVisible(true);
					System.out.println("Program has compiled and is running");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

		});

	}

	/**
	 * This method creates a new contact list, and populates it with the data
	 * stored on the disk. If there is no list stored on the disk it leaves the
	 * new list empty.
	 */
	private static void openList() {
		list = new ContactList();
		// Will pass list to disk as a parameter
		// Disk will then populate list with the array stored on disk
		// A new list opens up with a blank person object already created
		// An existing list opens up with the first person in that list
		// displayed
	}

	/**
	 * This method writes the list to disk when the program is closed.
	 */
	private void saveList() {

	}

	/**
	 * This method returns the ArrayList list. It has logic to determine if it
	 * the user wants a sorted list or search results
	 */
	public static ArrayList getContactList() {
		openList(); // required for compilation
		// addPerson();
		return (list.getList());
	}

	/**
	 * This method searches the list for the values specified by the GUI, then
	 * returns a new ContactList containing the results. If no match is found, 
	 * it will notify the user through the GUI.
	 * 
	 * @param searchField
	 *            , searchValue
	 */
	public static ContactList searchList(String searchField, String searchValue) {
		ContactList matches = new ContactList();
		return matches;
	}

	/**
	 * This method sorts the list by the field specified in the GUI.
	 */
	@SuppressWarnings("unused")
	private void sortList(String sortField) {

	}

	/**
	 * This method sets up a new person and adds it to the list.
	 */
	public static void addPerson() {
		person = new Person();
		list.addPerson(person);
	}

	/**
	 * This method updates all fields in the specified Person object and it's
	 * StreetAddress object.
	 * 
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
	 */
	public static void updatePerson(Person person, String firstName,
			String lastName, String email, String phoneNumber, String notes,
			String houseNumber, String street, String zip, String city,
			String state, String country) {

	}

	/**
	 * This method acts as a relay for Person.getEmail
	 * 
	 * @param relayedEmail
	 */
	public String relayGEmail(String relayedEmail) {
		return relayedEmail;
	}

	/**
	 * This method acts as a relay for Person.getPhoneNumber
	 * 
	 * @param relayedPhoneNumber
	 */
	public String relayGPhoneNumber(String relayedPhoneNumber) {
		return relayedPhoneNumber;
	}

	/**
	 * This method acts as a relay for Person.getFirstName
	 * 
	 * @param relayedFirstName
	 */
	public String relayGFirstName(String relayedFirstName) {
		return relayedFirstName;
	}

	/**
	 * This method acts as a relay for Person.getLastName
	 * 
	 * @param relayedLastName
	 */
	public String relayGLastName(String relayedLastName) {
		return relayedLastName;
	}

	/**
	 * This method acts as a relay for Person.getNotes
	 * 
	 * @param relayedNotes
	 */
	public String relayGNotes(String relayedNotes) {
		return relayedNotes;
	}

	/**
	 * This method acts as a relay for StreetAddress.getHouseNumber
	 * 
	 * @param relayedHouseNumber
	 */
	public String relayGHouseNumber(String relayedHouseNumber) {
		return relayedHouseNumber;
	}

	/**
	 * This method acts as a relay for StreetAddress.getStreet
	 * 
	 * @param relayedStreet
	 */
	public String relayGStreet(String relayedStreet) {
		return relayedStreet;
	}

	/**
	 * This method acts as a relay for StreetAddress.getZip
	 * 
	 * @param relayedZip
	 */
	public String relayGZip(String relayedZip) {
		return relayedZip;
	}

	/**
	 * This method acts as a relay for StreetAddress.getCity
	 * 
	 * @param relayedCity
	 */
	public String relayGCity(String relayedCity) {
		return relayedCity;
	}

	/**
	 * This method acts as a relay for StreetAddress.getState
	 * 
	 * @param relayedState
	 */
	public String relayGState(String relayedState) {
		return relayedState;
	}

	/**
	 * This method acts as a relay for StreetAddress.getCountry
	 * 
	 * @param relayedCountry
	 */
	public String relayGCountry(String relayedCountry) {
		return relayedCountry;
	}

}


/* -------Paste of run from console-------
An object of class ContactList has been constructed
Program has compiled and is running
*/