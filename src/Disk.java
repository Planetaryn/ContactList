/**
 * This Class provides interface to the hard disk for the OO Java project. The
 * class has methods for saving and retrieving the  whole directory list to/from a disk.
 * The class saves the whole directory (override the existing file). The class can read
 * the directory from the disk and return the directory to the invoking class.  
 * 
 * @author Shmuel Shaffer
 * This is a version 2 which includes modifications based on feedback we received.
 */
import java.io.*;
import java.util.*;
import java.util.logging.*;

public class Disk {

/**
 * Constructor for the Disk Class finds if the DirectoryProject.txt file
 * exists. If it does not exists, the constructor created the file and
 * closes it
 */
	private final String CONTACT_LIST_FILE_NAME = "Contact_List.ser";
	Disk() {

	}


/**
 * The writeToDisk method gets the ArrayList directory with contact objects as
 * an input and overrides the existing directory file with a new directory file. 
 * The method returns true if successful, and false if an error occurs.
 */
	public boolean writeToDisk(ContactList directoryOfContacts) { 
		boolean successfulyWrittenToDisk = true;
		System.out.println("Method writeToDisk called");
		return successfulyWrittenToDisk;
	}



	/**
	 * The readFromDisk method reads the directory file from the disk and
	 * returns a List object containing the whole directory as an ArrayList 
	 * of the Person objects.
	 */
	public ContactList readFromDisk(int LIST_MAX_LENGTH) { 
		ContactList directoryOfContacts = new ContactList();
		System.out.println("Method readFromDisk called");
		return directoryOfContacts;
	}



}

