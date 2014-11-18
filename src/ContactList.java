import java.util.*;

/**
 * Define a reusable class List. It allows the user to select the view they want
 * to do search/sort and returns these results in array list
 * File History:
 * Author: Kelly Lam version 1
 * Version 2: Noah
 */
public class ContactList {
	private final int LIST_MAX_LENGTH = 100;

	/**
	 * Constructs a new object of class ContactList of length contactListLength
	 * 
	 * @param contactListLength
	 */
	public ContactList(int contactListLength) {

	}

	/**
	 * Sets the value of searchField to the value of the parameter newSearchField, and returns the array indices of the person objects which match the search
	 * @param newSearchField
	 * @return
	 */
	public int[] searchByField(String newSearchField) {
		String searchField;
		System.out.println("Method ContactList.searchByField called");
		int[] placeHolder = {1,2,3};
		return placeHolder;
	}

	/**
	 * Sets the value of sortField to the value of the parameter newSortField, and sorts the ContactList by sortField
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
	
	/**
	 * Call the programme to create a new Person
	 */
	public void newPerson() {
		System.out.println("Using method newPerson");	
	}
	
	/**
	 * Return the information of the Contact List
	 */
	public String toString() {
		System.out.println("Using method toString");
		return ("");
	}
}
