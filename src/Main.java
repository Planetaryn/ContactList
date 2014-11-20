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
	 * This method opens the contact list. If it does not find an existing
	 * contact list, it creates a new ContactList.
	 */
	@SuppressWarnings("unused")
	private static void openList() {
		list = new ContactList(10);
		if (true) { // if true then 
			// Will pass list to disk as a parameter
			// Disk will then populate list with the array stored on disk
		}
	}

	/**
	 * This method returns the arrayList list. It has logic to determine if it
	 * should return the arrayList from ContactList.sortByField,
	 * ContactList.searchByField, or the original arrayList from ContactList. It
	 * also has logic to call noSearchMatch if a no search match condition.
	 * 
	 * -NoahNote: It may be better/easier to split each one of these conditions into methods which are
	 * then called by this method.
	 */
	public static ArrayList<Person> getContactList() {
		openList();
		addPerson();
		return (list.getList());
	}
	
	/**
	 * SearchForRelay
	 */

	/**
	 * SortByRelay
	 */
	
	
	/**
	 * This method instructs the UI to tell the user that there is no search
	 * match.
	 */
	private void noSearchMatch() {
		
	}
	
	/**
	 * This method instructs class Disk to save to the disk.
	 */
	private void save(){
		
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
	 */
	public void relaySEmail(String relayedEmail){
		person.setEmail(relayedEmail);
	}
	
	/**
	 * This method acts as a relay for Person.setPhoneNumber
	 */
	public void relaySPhoneNumber(String relayedPhoneNumber){
		
	}
	
	/**
	 * This method acts as a relay for Person.setFirstName
	 */
	public void relaySFirstName(String relayedFirstName){
		
	}
	
	/**
	 * This method acts as a relay for Person.setLastName
	 */
	public void relaySLastName(String relayedLastName){
		
	}
	
	/**
	 * This method acts as a relay for Person.setNotes
	 */
	public void relaySNotes(String relayedNotes){
		
	}
	
	/**
	 * This method acts as a relay for Person.getEmail
	 */
	public String relayGEmail(String relayedEmail){
		return relayedEmail;
	}
	
	/**
	 * This method acts as a relay for Person.getPhoneNumber
	 */
	public String relayGPhoneNumber(String relayedPhoneNumber){
		return relayedPhoneNumber;
	}
	
	/**
	 * This method acts as a relay for Person.getFirstName
	 */
	public String relayGFirstName(String relayedFirstName){
		return relayedFirstName;
	}
	
	/**
	 * This method acts as a relay for Person.getLastName
	 */
	public String relayLastName(String relayedLastName){
		return relayedLastName;
	}
	
	/**
	 * This method acts as a relay for Person.getNotes
	 */
	public String relayNotes(String relayedNotes){
		return relayedNotes;
	}
	
	/**
	 * This method acts as a relay for StreetAddress.setHouseNumber
	 */
	public void relaySHouseNumber(String relayedHouseNumber){
		
	}
	
	/**
	 * This method acts as a relay for StreetAddress.setStreet
	 */
	public void relaySStreet(String relayedStreet){
		
	}
	
	/**
	 * This method acts as a relay for StreetAddress.setZip
	 */
	public void relaySZip(String relayedZip){
		
	}
	
	/**
	 * This method acts as a relay for StreetAddress.setCity
	 */
	public void relaySCity(String relayedCity){
		
	}
	
	/**
	 * This method acts as a relay for StreetAddress.setState
	 */
	public void relaySState(String relayedState){
		
	}
	
	/**
	 * This method acts as a relay for StreetAddress.setCountry
	 */
	public void relaySCountry(String relayedCountry){
		
	}
	
	/**
	 * This method acts as a relay for StreetAddress.getHouseNumber
	 */
	public String relayGHouseNumber(String relayedHouseNumber){
		return relayedHouseNumber;
	}
	
	/**
	 * This method acts as a relay for StreetAddress.getStreet
	 */
	public String relayGStreet(String relayedStreet){
		return relayedStreet;
	}
	
	/**
	 * This method acts as a relay for StreetAddress.getZip
	 */
	public String relayGZip(String relayedZip){
		return relayedZip;
	}
	
	/**
	 * This method acts as a relay for StreetAddress.getCity
	 */
	public String relayGCity(String relayedCity){
		return relayedCity;
	}
	
	/**
	 * This method acts as a relay for StreetAddress.getState
	 */
	public String relayGState(String relayedState){
		return relayedState;
	}
	
	/**
	 * This method acts as a relay for StreetAddress.getCountry
	 */
	public String relayGCountry(String relayedCountry){
		return relayedCountry;
	}
	

}
