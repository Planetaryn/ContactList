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
	 * Sets the value of searchField to the value of the parameter
	 * newSearchField, and returns objects in the contact list that match the
	 * search
	 * 
	 * @param newSearchField
	 * @return
	 */
	public ArrayList<Person> searchByField(String newSearchField,
			String newSearchValue) {
		String searchField;
		String searchValue;
		System.out.println("Method ContactList.searchByField called");
		// Call to method to extract field value and compare to searchValue
		// Store array of objects that match the search
		// Return that array
		ArrayList<Person> matches = new ArrayList<Person>();
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

	/**
	 * Returns true if the search has no matches.
	 */
	public boolean noSearchMatch() {
		return true;
	}

}
