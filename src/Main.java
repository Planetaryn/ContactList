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

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {

			/**
			 * This method creates and opens a new GUI
			 */
			public void run() {
				try {
					GUI window = new GUI();
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
		list = new ContactList(10);
		// Will pass list to disk as a parameter
		// Disk will then populate list with the array stored on disk
		// A new list opens up with a blank person object already created
		// An existing list opens up with the first person in that list displayed
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
		openList(); //required for compilation
	   // addPerson();
		return (list.getList());
	}

	/**
	 * This method searches the list for the values specified in the GUI, then
	 * returns a new ContactList containing the results. If no match is found,
	 * this method will call noSearchMatch.
	 * 
	 * @param searchField, searchValue
	 */
	public ContactList searchList(String searchField, String searchValue) {
		int numMatches = 0;
		ContactList matches = new ContactList(numMatches);
		return matches;
	}

	/**
	 * This method sorts the list by the field specified in the GUI.
	 */
	public void sortList(String sortField) {

	}

	/**
	 * This method instructs the UI to tell the user that there is no search
	 * match.
	 */
	private void noSearchMatch() {

	}


	/**
	 * This method sets up a new person and adds it to the list
	 */
	private static void addPerson() {
		person = new Person();
		person.setFirstName("paul");
		list.addPerson(person);
	}

	/**
	 * This method acts as a relay for Person.setEmail
	 * @param relayedEmail
	 */
	public void relaySEmail(String relayedEmail) {
		person.setEmail(relayedEmail);
	}

	/**
	 * This method acts as a relay for Person.setPhoneNumber
	 * @param relayedPhoneNumber
	 */
	public void relaySPhoneNumber(String relayedPhoneNumber) {

	}

	/**
	 * This method acts as a relay for Person.setFirstName
	 * @param relayedFirstName
	 */
	public void relaySFirstName(String relayedFirstName) {

	}

	/**
	 * This method acts as a relay for Person.setLastName
	 * @param relayedLastName
	 */
	public void relaySLastName(String relayedLastName) {

	}

	/**
	 * This method acts as a relay for Person.setNotes
	 * @param relayedNotes
	 */
	public void relaySNotes(String relayedNotes) {

	}

	/**
	 * This method acts as a relay for Person.getEmail
	 * @param relayedEmail
	 */
	public String relayGEmail(String relayedEmail) {
		return relayedEmail;
	}

	/**
	 * This method acts as a relay for Person.getPhoneNumber
	 * @param relayedPhoneNumber
	 */
	public String relayGPhoneNumber(String relayedPhoneNumber) {
		return relayedPhoneNumber;
	}

	/**
	 * This method acts as a relay for Person.getFirstName
	 * @param relayedFirstName
	 */
	public String relayGFirstName(String relayedFirstName) {
		return relayedFirstName;
	}

	/**
	 * This method acts as a relay for Person.getLastName
	 * @param relayedLastName
	 */
	public String relayLastName(String relayedLastName) {
		return relayedLastName;
	}

	/**
	 * This method acts as a relay for Person.getNotes
	 * @param relayedNotes
	 */
	public String relayNotes(String relayedNotes) {
		return relayedNotes;
	}

	/**
	 * This method acts as a relay for StreetAddress.setHouseNumber
	 * @param relayedHouseNumber
	 */
	public void relaySHouseNumber(String relayedHouseNumber) {

	}

	/**
	 * This method acts as a relay for StreetAddress.setStreet
	 * @param relayedStreet
	 */
	public void relaySStreet(String relayedStreet) {

	}

	/**
	 * This method acts as a relay for StreetAddress.setZip
	 * @param relayedZip
	 */
	public void relaySZip(String relayedZip) {

	}

	/**
	 * This method acts as a relay for StreetAddress.setCity
	 * @param relayedCity
	 */
	public void relaySCity(String relayedCity) {

	}

	/**
	 * This method acts as a relay for StreetAddress.setState
	 * @param relayedState
	 */
	public void relaySState(String relayedState) {

	}

	/**
	 * This method acts as a relay for StreetAddress.setCountry
	 * @param relayedCountry
	 */
	public void relaySCountry(String relayedCountry) {

	}

	/**
	 * This method acts as a relay for StreetAddress.getHouseNumber
	 * @param relayedHouseNumber
	 */
	public String relayGHouseNumber(String relayedHouseNumber) {
		return relayedHouseNumber;
	}

	/**
	 * This method acts as a relay for StreetAddress.getStreet
	 * @param relayedStreet
	 */
	public String relayGStreet(String relayedStreet) {
		return relayedStreet;
	}

	/**
	 * This method acts as a relay for StreetAddress.getZip
	 * @param relayedZip
	 */
	public String relayGZip(String relayedZip) {
		return relayedZip;
	}

	/**
	 * This method acts as a relay for StreetAddress.getCity
	 * @param relayedCity
	 */
	public String relayGCity(String relayedCity) {
		return relayedCity;
	}

	/**
	 * This method acts as a relay for StreetAddress.getState
	 * @param relayedState
	 */
	public String relayGState(String relayedState) {
		return relayedState;
	}

	/**
	 * This method acts as a relay for StreetAddress.getCountry
	 * @param relayedCountry
	 */
	public String relayGCountry(String relayedCountry) {
		return relayedCountry;
	}

}
