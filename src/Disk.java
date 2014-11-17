/**
 * This Class provides interface to the hard disk for the OO Java project The
 * class has methods for saving and retrieving a directory list to/from a disk.
 * The class can save a single object (augment it to the end of the disk file)
 * or save the whole directory (override the existing file). The class can read
 * the directory from the disk and return the directory to the invoking class.
 * 
 * @author Shmuel Shaffer
 */
public class Disk {

	/**
	 * Constructor for the Disk Class finds if the DirectoryProject.txt file
	 * exists. If it does not exists, the constructor created the file and
	 * closes it
	 */
	Disk() {
        System.out.println("Using Disk Constructor");

	}
	

	/**
	 * The toStorableString method gets a Person object which represents a single contact
	 * and converts it into a printable string. The string uses the "|"
	 * character as a separator between the various elements in the Person
	 * object string and inserts a "\n" at the end of the string to marks the
	 * end of the contact object string.
	 */
	String toStorableString(Person contact) { // This compilation error should
												// be resolved once we have the
												// Person class
		String personAsString = "";
        System.out.println("Using method toStorableString");

		return personAsString;
	}



	/**
	 * The writeToDisk method gets the List directory as an input and   
	 * overrides the existing directory file with a new directory file.
	 * The method returns true if successful, and false if an error occurs.
	 */
	public boolean writeToDisk(ContactList manyContacts) { // This compilation error should
												// be resolved once we have the
		Person oneContact = new Person("joe","smith");									// Person class
		boolean successfulyWrittenToDisk = true;
	
		successfulyWrittenToDisk= writeToDisk(oneContact);
        System.out.println("Using method writeToDisk - List as a parameter");
		return successfulyWrittenToDisk;


	}

	/**
	 * The writeToDisk method gets a Person object (a sub object of the List
	 * object) as an input and augments the existing directory file on the disk with a new
	 *  with a new person data.
	 * The method returns true if successful, and false if an error occurs.

	 */
	public boolean writeToDisk(Person contact) { // This compilation error
													// should be resolved once
													// we have the Person class
		boolean successfulyWrittenToDisk = true;
        System.out.println("Using method writeToDisk - Person as a parameter");

		return successfulyWrittenToDisk;
	}

	/*
	 * The readFromDisk method reads the directory file from the disk and returns a
	 * List object containing the whole directory.
	 */
	public ContactList readFromDisk() { // This compilation error should be resolved
									// once we have the List class
		ContactList directoryOfContacts=new ContactList();
		String lineFromDisk="";
		Person contact;
		contact=this.fromString(lineFromDisk);
        System.out.println("Using method readFromDisk");
		return directoryOfContacts;
	}

	/**
	 * The fromString method gets a string of characters with | markets and returns a
	 * a Person object containing the information from the disk about that
	 * person. Elements of a Person which were not entered into the directory
	 * remain an empty string "".
	 * 
	 */
	public Person fromString(String contact) { 
		Person directoryOfContacts  = new Person("joe","smith");
        System.out.println("Using method fromString");

		return directoryOfContacts;
	}
}
