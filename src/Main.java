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
 * @author noahgoldsmith
 */
public class Main {

	static Scanner console = new Scanner(System.in);
	static BufferedReader br = new BufferedReader(new InputStreamReader(
			System.in));
	private static ContactList list = new ContactList();

	/**
	 * This method sets up a new person and adds it to the list.
	 * 
	 * @author noahgoldsmith
	 * @return
	 * @throws IOException
	 */
	private static void addPerson() throws IOException {
		Person person = new Person();

		System.out.print("Please enter the contacts first name: ");
		person.setFirstName(br.readLine());

		System.out.print("Please enter the contacts last name: ");
		String lastName = "";
		lastName = br.readLine();
		if (lastName.isEmpty()) {
			for (int i = 0; i <= 2; i++) {
				System.out
						.println("You did not enter a last name, please try again");
				System.out.print("Please enter the contacts last name: ");
				lastName = br.readLine();
			}
			System.out.println("No last name entered, returning to the menu");
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

	public static void main(String[] args) {
		menu();
	}

	/**
	 * This method displays and reads the user menu
	 * 
	 * @author noahgoldsmith
	 */
	public static void menu() {
		System.out.println("Enter 1 to add a new contact to the contact list");
		System.out.println("Enter 2 to print out the contact list");
		System.out.println("Enter 0 to exit the application");

		int selection = console.nextInt();
		switch (selection) {
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
		case 3:
			exit();
			break;
		}
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

	private static void printList() {
		for (int i = 0; i < list.getSize(); i++) {
			System.out.println(list.getPerson(i));
		}
		menu();
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
	 * This method writes the list to disk when the program is closed.
	 */
	private void saveList() {

	}

	/**
	 * This method returns the list by the sorted by last name.
	 * 
	 * @author noahgoldsmith
	 */
	@SuppressWarnings("unused")
	private void sortList(String sortField) {

	}

}
