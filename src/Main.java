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

	public static void main(String[] args) {
		//Switch statement menu here
		System.out.println("Program has compiled and is running");
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

	/**
	 * This method returns the person at the selected index
	 */
	public static Person getPersonAtIndex(int index) {
		return list.getPerson(index);
	}

	/**
	 * This method returns the size of the array
	 */
	public static int getSize() {
		return list.getSize();
	}

	/**
	 * This method searches the list for the values specified by the user, then
	 * returns a new ContactList containing the results. If no match is found,
	 * it will notify the user through the console.
	 * 
	 * @param searchField
	 *            , searchValue
	 */
	public static ContactList searchList(String searchField, String searchValue) {
		ContactList matches = new ContactList();
		return matches;
	}

	/**
	 * This method returns the list by the sorted by last name.
	 */
	@SuppressWarnings("unused")
	private void sortList(String sortField) {

	}

	/**
	 * This method sets up a new person and adds it to the list.
	 * 
	 * @return
	 */
	public static void addPerson() {
		Person person = new Person();
		//New person prompts & Scanner here
		person.setEmail(newEmail);
		person.setFirstName(newFirstName);
		person.setLastName(newLastName);
		person.setPhoneNumber(newPhoneNumber);
		person.setNotes(newNotes);
		person.setStreetAddress(houseNumber, street, etc, etc, etc);
		list.addPerson(person);
		
	}

}
