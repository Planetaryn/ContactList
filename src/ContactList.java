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
		// System.out.println("An object of class ContactList has been constructed");
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
	public void addPerson(Person person) {
		contactList.add(person);
		this.sortByField("Name");
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
	 * AUthor: Shmuel
	 * Returns the objects in the contact list that match the search in a new 
	 * ContactList object.
	 * 
	 * @param searchField, searchValue
	 * @return matchingContacts Object
	 */
	public ContactList searchForField(String searchField, String searchValue) {
		// Extract field value and compare to searchValue
		// Store array of objects that match the search
		// Return that array
		String searchedField="";
		
		ContactList matchingContacts = new ContactList();
			for (int i = 0; i < contactList.size(); i++) {
				boolean match=false;
				if (searchField == "Last Name") { // search by last name
					searchedField = contactList.get(i).getLastName().toLowerCase();
					//System.out.println("i="+i+"   Searching on last name:" +searchedField +"  search Value=" +searchValue.toLowerCase());
					if(searchedField.toLowerCase().equals(searchValue.toLowerCase())){
						//System.out.println("Strings match");
						match=true;
					}			
				}
				else if(searchField == "zip code") {
					searchedField = contactList.get(i).getZip().toLowerCase();
					if(searchedField.toLowerCase().equals(searchValue.toLowerCase())){
						match=true;
					}
				}
				else if(searchField == "email") {

					searchedField = contactList.get(i).getEmail().toLowerCase();
					if(searchedField.toLowerCase().equals(searchValue.toLowerCase())){
						match=true;
					}
				}
				else{
					System.out.println("coding error: check your searchField");
					
				}
				if(match){
					matchingContacts.addPerson(contactList.get(i));
				}
		}
		return matchingContacts;
	}
	
	/**
     * This method sorts the ContactList by the field specified by the parameter sortField.
	 * Version1: Skeleton done by Kelly
	 * Version2: Shmuel added the sorting code 
	 * @param sortField //Shmuel: Changed SortField to sortField
	 * @return
	 */
	public void sortByField(String sortField) {
		String sortFieldI;
		String sortFieldIIPlusOne;
		Person tempPerson = new Person();
		if (sortField == "Name") {
			for (int sortIndex = 0; sortIndex < 2; sortIndex++) {
				for (int i = 0; i < contactList.size() - 1; i++) {
					for (int j = 0; j < contactList.size() - 1 - i; j++) {

						if (sortIndex == 0) { // first sort on first name
							sortFieldI = contactList.get(j).getFirstName();
							sortFieldIIPlusOne = contactList.get(j + 1)
									.getFirstName();
						} else { // Sort on second name after the sort on first
									// name
									// is complete
							sortFieldI = contactList.get(j).getLastName();
							sortFieldIIPlusOne = contactList.get(j + 1)
									.getLastName();
						}
						sortFieldI = sortFieldI.toLowerCase();
						sortFieldIIPlusOne = sortFieldIIPlusOne.toLowerCase();
						if (sortFieldI.compareTo(sortFieldIIPlusOne) > 0) {
							// need to swap Person Objects
							tempPerson = contactList.get(j);
							contactList.remove(j);
							contactList.add(j + 1, tempPerson);

						}

					}
				}

			}
		}
	}

	/**
	 * Author: Shmuel 
	 * The method gets a Contact:List object containing
	 * the matching Person objects found by the searchForField method. 
	 * Method returns a string containing the matched Person objects.
	 * @param matchedList
	 */
	public String matchedListToString(ContactList matchedList) {
		String matchedListString;
		if (matchedList.getSize() == 0) {
			matchedListString = "There are no matching contacts in the directory";
		} else {
			matchedListString = "Matching contacts in your directory:" + "\n";

			for (int i = 0; i < matchedList.getSize(); i++) {
				matchedListString += matchedList.getPerson(i) + "\n";
			}
		}
		return (matchedListString);
	}
	
	/** 
	 * Shmuel added toString method
	 * Method returns a string containing the whole directory list
	 */
	public String toString() { 
		String directoryListString;
		if(contactList.size()==0){
			directoryListString = "There are no contacts in the directory";
		}
		else{
			directoryListString = "Contacts in your directory:"+"\n";
		}
			for (int i = 0; i < contactList.size(); i++) {
			directoryListString+=this.getPerson(i)+"\n";
		}
		return (directoryListString);
	}

}