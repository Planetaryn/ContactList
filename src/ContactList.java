import java.io.Serializable;
import java.util.*;


/**
 * Define a reusable class ContactList. One object of class ContactList contains Person objects.
 */
public class ContactList implements Serializable{
	private ArrayList<Person> contactList;

	/**
	 * Constructs a new object of class ContactList.
	 * 
	 */
	public ContactList() {
		contactList = new ArrayList<Person>();
		System.out
				.println("An object of class ContactList has been constructed");
	}

	/**
	 * This method returns the size of the contactList
	 */
	public int getSize(){
		return contactList.size();
	}
	/**
	 * Adds a Person to the contactList
	 * 
	 * @param newPerson
	 */
	public void addPerson() {
		Person person = new Person();
		contactList.add(person);
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
	 * Returns the specified person object
	 * @return 
	 */
	public Person getPerson (int index){
		return contactList.get(index);
	}
	/**
	 * Returns the objects in the contact list that match the search in a new 
	 * ContactList object.
	 * 
	 * @param searchField, searchValue
	 * @return
	 */
	public ContactList searchForField(String searchField,
			String searchValue) {
		System.out.println("Method ContactList.searchByField called");
		// Extract field value and compare to searchValue
		// Store array of objects that match the search
		// Return that array
		ContactList matches = new ContactList();
		return matches;
	}
	
	/**
     * This method sorts the ContactList by the field specified by the parameter sortField.
	 * 
	 * @param SortField
	 * @return
	 */
	public void sortByField(String SortField) {
		System.out.println("Method ContactList.sortByField called");

	}
}