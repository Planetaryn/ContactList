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
	private static GUI window;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {

			/**
			 * This method creates and opens a new GUI
			 */
			public void run() {
				try {
					openList();
					addPerson();
					window = new GUI();
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
		return (list.getList());
	}
	
//	/**
//	 * This method sets the person currently being edited
//	 * @return 
//	 */
//	public static void setPerson(int index){
//			person = list.getPerson(index);
//	}
	
//	/**
//	 * This method returns the person currently being edited
//	 */
//	public static Person getPerson(){
//		return person;
//	}
	
	/**
	 * This method returns the person at the selected index
	 */
	public static Person getPersonAtIndex(int index){
		return list.getPerson(index);
	}
	
	/**
	 * This method returns the size of the array
	 */
	public static int getSize(){
		return list.getSize();
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
	 * @return 
	 */
	public static void addPerson() {
		list.addPerson();
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
	public static void updatePerson(String firstName,
			String lastName, String email, String phoneNumber, String notes,
			String houseNumber, String street, String zip, String city,
			String state, String country) {
		
		try {
			list.getPerson(window.getPersonIndex()).setFirstName(firstName);
			list.getPerson(window.getPersonIndex()).setLastName(lastName);
			list.getPerson(window.getPersonIndex()).setEmail(email);
			list.getPerson(window.getPersonIndex()).setPhoneNumber(phoneNumber);
			list.getPerson(window.getPersonIndex()).setNotes(notes);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * This method acts as a relay for Person.getEmail
	 * It passes the value from class Person to class GUI, without the GUI ever
	 * touching class Person.
	 *  
	 * @param relayedEmail
	 */
	public static String relayGEmail() {
		String email = "";
		try {
			email = list.getPerson(window.getPersonIndex()).getEmail();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return email;
	}

	/**
	 * This method acts as a relay for Person.getPhoneNumber
	 * It passes the value from class Person to class GUI, without the GUI ever
	 * touching class Person.
	 *  
	 * @param relayedPhoneNumber
	 */
	public static String relayGPhoneNumber() {
		String phoneNumber = "";
		try {
			phoneNumber = list.getPerson(window.getPersonIndex()).getPhoneNumber();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return phoneNumber;
	}

	/**
	 * This method acts as a relay for Person.getFirstName
	 * It passes the value from class Person to class GUI, without the GUI ever
	 * touching class Person.
	 * 
	 * @param relayedFirstName
	 */
	public static String relayGFirstName() {
		String firstName = "";
		try {
			firstName = list.getPerson(window.getPersonIndex()).getFirstName();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return firstName;
	}

	/**
	 * This method acts as a relay for Person.getLastName
	 * It passes the value from class Person to class GUI, without the GUI ever
	 * touching class Person.
	 *  
	 * @param relayedLastName
	 */
	public static String relayGLastName() {
		String lastName = "";
		try {
			lastName = list.getPerson(window.getPersonIndex()).getLastName();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lastName;
	}

	/**
	 * This method acts as a relay for Person.getNotes
	 * It passes the value from class Person to class GUI, without the GUI ever
	 * touching class Person.
	 * 
	 */
	public static String relayGNotes() {
		String notes = "";
		try {
			notes = list.getPerson(window.getPersonIndex()).getNotes();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return notes;
	}

	/**
	 * This method acts as a relay for StreetAddress.getHouseNumber
	 * It passes the value from class StreetAddress to class GUI, without the GUI ever
	 * touching class StreetAddress.
	 * 
	 */
	public static String relayGHouseNumber() {
		return "14";
	}

	/**
	 * This method acts as a relay for StreetAddress.getStreet
	 * It passes the value from class StreetAddress to class GUI, without the GUI ever
	 * touching class StreetAddress.
	 * 
	 */
	public static String relayGStreet() {
		return "Street";
	}

	/**
	 * This method acts as a relay for StreetAddress.getZip
	 * It passes the value from class StreetAddress to class GUI, without the GUI ever
	 * touching class StreetAddress.
	 * 
	 */
	public static String relayGZip() {
		return "Zip";
	}

	/**
	 * This method acts as a relay for StreetAddress.getCity
	 * It passes the value from class StreetAddress to class GUI, without the GUI ever
	 * touching class StreetAddress.
	 * 
	 */
	public static String relayGCity() {
		return "City";
	}

	/**
	 * This method acts as a relay for StreetAddress.getState
	 * It passes the value from class StreetAddress to class GUI, without the GUI ever
	 * touching class StreetAddress.
	 * 
	 */
	public static String relayGState() {
		return "State";
	}

	/**
	 * This method acts as a relay for StreetAddress.getCountry.
	 * It passes the value from class StreetAddress to class GUI, without the GUI ever
	 * touching class StreetAddress.
	 * 
	 */
	public static String relayGCountry() {
		return "Country";
	}

}


/* -------Paste of run from console-------
An object of class ContactList has been constructed
Program has compiled and is running
*/