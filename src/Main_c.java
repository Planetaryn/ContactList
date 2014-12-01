import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * This class controls the operation of the contact list program. It has methods
 * which initialize the GUI and creates a new contact list or opens an existing
 * contact list.
 * 
 * Version 1: noahgoldsmith
 * Version 2: Shmuel - 	Added the Disk object function.
 * 						Modified the switch in the menu
 * 						Added the sort function and verified that it is integrated with the print function.
 * 						Removed the sortByField method from the main; this is a ContactList method.
 * 						removed the getSize() method; it is a Java method that does not need to be redone.
 */
public class Main_c {

	static Scanner console = new Scanner(System.in); // is there a need to make this static?
	static BufferedReader br = new BufferedReader(new InputStreamReader( // is there a need to make this static?
			System.in));
	private static ContactList list = new ContactList(); //ShS is there a need to declare this private or static
	private static ContactList searchedListObject = new ContactList();		// Shmuel: Added searchedList object
	private static Disk diskHandler = new Disk();
	private static final int ATTEMPT_COUNT_LIMIT=3;
	
	public static void main(String[] args) { // moved main to the top to make it more readable
        ContactList directoryList;
        directoryList = new ContactList();

		boolean successfulDiskRead=false; 
		Disk diskHandler = new Disk();
		successfulDiskRead=diskHandler.readFromDisk();
		System.out.println("successfulDiskRead ="+ successfulDiskRead);
		   if(successfulDiskRead){
			   directoryList = diskHandler.getDiskFileObject();
               //System.out.println("Directory file exists on disk");
               list=directoryList;
               // printList();

           }
		   else{
               //System.out.println("Directory file does not exist on disk");

			   
		   }
		menu();
	}
	

	/**
	 * This method displays and reads the user menu
	 * 
	 * @author Version 0: basic MEnue noahgoldsmith
	 * Version1: Shmuel	added options o, 3, 4, & 5
	 */
	public static void menu() { // moved menu after main to make it more readable
		String searchString;
		String searchField="";
		int attemptCounter;
		
		System.out.println("Enter 1 to add a new contact to the contact list");
		System.out.println("Enter 2 to print out the contact list");
		System.out.println("Enter 3 to retrieve contact(s) by last name");
		System.out.println("Enter 4 to retrieve contact(s) by email address");
		System.out.println("Enter 5 to retrieve contact(s) by zip code");

		System.out.println("Enter 0 to exit the application");
		int selection = console.nextInt();

		switch (selection) {
		case 0: //Shmuel: added case 0
			System.out.println("Saving Contact List to disk"); //  debug statement: Option 3 is not exercised
			diskHandler.writeToDisk(list);
			exit();
			break;
		case 1:
			try {
				addPerson();
			} catch (IOException e) {
				e.printStackTrace();
			}
			break;	
		case 2:
			printList();
			break;
		case 3: //Shmuel: added retrieve contact(s) by last name
		case 4: //Shmuel: added retrieve contact(s) by email address
		case 5: //Shmuel: added retrieve contact(s) by zip code
			attemptCounter=0;
			searchString = "";
			if(selection==3){
				System.out.print("Please enter the searched contact's last name: ");
				searchField="Last Name";
			}
			else if(selection==4){
				System.out.print("Please enter the searched contact's email address: ");
				searchField="email";
			}
			else if(selection==5){
				System.out.print("Please enter the searched contact's zip code: ");
				searchField="zip code";
			}
			try {
			searchString = br.readLine();
			if (searchString.isEmpty() && attemptCounter<ATTEMPT_COUNT_LIMIT) {
				attemptCounter+=1;
				System.out.println("You did not enter a last name, please try again");
				searchString = br.readLine();
			}
			if(searchString.isEmpty() ){
							
				System.out.println("No last name entered, returning to the main menu");
				System.out.println("");
			}
			} catch (IOException e) {
				e.printStackTrace();
			}
			//
			System.out.println();
			searchedListObject= list.searchForField(searchField, searchString);
			System.out.println(list.matchedListToString(searchedListObject));

			menu();
			break;
/*		case 4:   //Shmuel: added retrieve contact(s) by email address
			printList();
			break;
		case 5://Shmuel: added retrieve contact(s) by zip code
			printList();
			break;
*/
		default: //  debug statement: default option is exercised when you enter 0
			System.out.println("default was exercised; Contact List not saved to disk");
		}
	}
	/**
	 * This method sets up a new person and adds it to the list.
	 * 
	 * @author noahgoldsmith
	 * @return
	 * @throws IOException
	 */
	private static void addPerson() throws IOException {
		String searchString;
		Person person = new Person();

		System.out.print("Please enter the contacts first name: ");
		person.setFirstName(br.readLine());

		System.out.print("Please enter the contacts last name: ");
		String lastName = "";
		lastName = br.readLine();
		if (lastName.isEmpty()) {
			for (int i = 0; i < ATTEMPT_COUNT_LIMIT; i++) {
				System.out
						.println("You did not enter a last name, please try again");
				System.out.print("Please enter the contacts last name: ");
				lastName = br.readLine();
			}
			System.out.println("No last name entered, returning to the main menu");
			System.out.println("");
			menu();
		}
		person.setLastName(lastName);

		System.out.print("Please enter the contacts phone number: ");
		person.setPhoneNumber(br.readLine());

		System.out.print("Please enter the contacts email address: ");
		person.setEmail(br.readLine());

		System.out.print("Please enter the contacts house number: ");
		String houseNumber = br.readLine();

		System.out.print("Please enter the contacts street: ");
		String street = br.readLine();

		System.out.print("Please enter the contacts city: ");
		String city = br.readLine();

		System.out.print("Please enter the contacts zip code: ");
		String zip = br.readLine();

		System.out.print("Please enter the contacts state: ");
		String state = br.readLine();

		System.out.print("Please enter the contacts country: ");
		String country = br.readLine();

		System.out.print("Please enter any notes about the contact: ");
		person.setNotes(br.readLine());
		System.out.println("");

		person.setStreetAddress(houseNumber, street, zip, city, state, country);
		list.addPerson(person);
		menu();

	}

	private static void exit() {
		System.exit(0);

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




	private static void printList() {
		list.sortByField("Name");
			System.out.print(list);
		menu();
	}
/**	private static ContactList searchForField(String fieldName, String fieldValue){
		ContactList matches = new ContactList();
		matches=list.searchForField(fieldName, fieldValue);
		return matches;	
	}
	*/


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



}