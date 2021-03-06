import java.util.*;

/**
 * Define a reusable class ContactList. One object of class ContactList contains
 * up to 100 Person objects.
 */
public class ContactList {
	private final int LIST_MAX_LENGTH = 100;
	private ArrayList<Person> contactList;

	/**
	 * Constructs a new object of class ContactList.
	 * 
	 * @param contactListLength
	 */
	public ContactList() {
		contactList = new ArrayList<Person>();
		System.out
				.println("An object of class ContactList has been constructed");
	}

	/**
	 * Adds a Person to the contactList
	 * 
	 * @param newPerson
	 */
	public void addPerson(Person newPerson) {
		contactList.add(newPerson);
	}

	/**
	 * Returns the ArrayList contactList
	 * 
	 * @return
	 */
	public ArrayList<Person> getList() {
		return contactList;
	}

	/**
	 * Returns the objects in the contact list that match the search in a new
	 * ContactList object.
	 * 
	 * @param searchField
	 *            , searchValue
	 * @return
	 */
	public ContactList searchForField(String searchField, String searchValue) {
		System.out.println("Method ContactList.searchByField called");
		// Extract field value and compare to searchValue
		// Store array of objects that match the search
		// Return that array
		ContactList matches = new ContactList();
		return matches;
	}

	/**
	 * This method sorts the ContactList by the field specified by the parameter
	 * sortField.
	 * 
	 * @param SortField
	 * @return
	 */
	public void sortByField(String SortField) {
		System.out.println("Method ContactList.sortByField called");

	}
}