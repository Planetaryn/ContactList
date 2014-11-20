import java.util.*;

/**
 * Define a reusable class List. It allows the user to select the view they want
 * to do search/sort and returns these results in array list
 */
public class ContactList {
	private final int LIST_MAX_LENGTH = 100;
	private ArrayList<Person> contactList;

	/**
	 * Constructs a new object of class ContactList of length contactListLength
	 * 
	 * @param contactListLength
	 */
	public ContactList(int contactListLength) {
		contactList = new ArrayList<Person>(contactListLength);
		System.out
				.println("An object of class ContactList has been constructed");
	}

	/**
	 * Adds a Person to the contactList
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
	 * Sets the value of searchField to the value of the parameter
	 * newSearchField, and returns objects in the contact list that match the
	 * search. Has logic that will tell the main there is not search match, if there is not search match.
	 * 
	 * @param newSearchField
	 * @return
	 */
	public ContactList searchForField(String newSearchField,
			String newSearchValue) {
		String searchField;
		String searchValue;
		int numberMatches = 0;
		System.out.println("Method ContactList.searchByField called");
		// Call to method to extract field value and compare to searchValue
		// Store array of objects that match the search
		// Return that array
		ContactList matches = new ContactList(numberMatches);
		return matches;
	}

	/**
	 * Sets the value of sortField to the value of the parameter newSortField,
	 * and sorts the ContactList by sortField
	 * 
	 * @param newSortField
	 * @return
	 */
	public void sortByField(String newSortField) {
		String sortField;
		System.out.println("Method ContactList.sortByField called");

	}
}
