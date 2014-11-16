import java.util.ArrayList;
import java.util.*;

/**
 * Define a reusable class List.
 * It allows the user to select the view they want to do search/sort
 * and returns these results in array list
 */
public class List {
	private final int LIST_MAX_LENGTH = 100;			//its value can be changed

	/**
	 * It is a constructor that creates an array list
	 */
	public void construct() {
		
	}
	
	/**
	 * Set the value of the field being searched
	 */
	public void searchByField(String newSearchField) {
		String searchField;
	}
	
	/**
	 * Set the value of the field being sorted
	 */
	public void sortByField(String newSortField) {
		String sortField;
	}
	
	/**
	 * Returns true if no search is matched
	 */
	public boolean noSearchMatch() {
		 return true;
	}
	
}
