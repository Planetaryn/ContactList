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
	 * This method returns the size of the contactList
	 * 
	 * @return
	 * @author noahgoldsmith
	 */
	public int getSize() {
		return contactList.size();
	}

	/**
	 * Adds a Person to the contactList
	 * 
	 * @param newPerson
	 * @author noahgoldsmith
	 */
	public void addPerson() {
		Person person = new Person();
		contactList.add(person);
	}

	/**
	 * Returns the ArrayList contactList
	 * 
	 * @return
	 * @author noahgoldsmith
	 */
	public ArrayList<Person> getList() {
		return contactList;
	}

	/**
	 * Returns the specified person object
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
	 * @author noahgoldsmith
	 */
	public ContactList searchForField(String searchField, String searchValue) {
		System.out.println("Method ContactList.searchForField called");
		// TODO
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
	 * @author noahgoldsmith
	 */
	public void sortByField(String SortField) {
		System.out.println("Method ContactList.sortByField called");
		// TODO

	}
}