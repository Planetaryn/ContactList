/**
 * This Class provides interface to the hard disk for the OO Java project. The
 * class has methods for saving and retrieving the  whole directory list to/from a disk.
 * The class saves the whole directory (override the existing file). The class can read
 * the directory from the disk and return the directory (ContactList object) to the invoking class.  
 * 
 * @author Shmuel Shaffer
 * This is a version 2 which includes modifications based on feedback we received in the class.
 * Version 3: changed the functionality of the contractor to modify the private fileExists flag
 */
import java.io.*;
import java.util.*;

public class Disk {
	private final String CONTACT_LIST_FILE_NAME = "Contact_List.ser";
	private boolean fileExists;

	/**
	 * Constructor for the Disk Class finds if the DirectoryProject.txt file
	 * exists. If it does not exists, the constructor sets the value of the
	 * fileExists variable to true.
	 */
	Disk() {

	}

	/**
	 * The writeToDisk method gets the ContactList Object as an input parameter 
	 * and overrides the existing directory file with a new directory file. The
	 * method returns true if successful, and false if an error occurs.
	 */
	public boolean writeToDisk(ContactList directoryOfContacts) {
		boolean successfulyWrittenToDisk = true;
		System.out.println("Method writeToDisk called");
		return successfulyWrittenToDisk;
	}

	/**
	 * The writeToDisk method gets the ContactList Object as an input parameter.
	 * The method attempts to open a directory file on the disk. If the file
	 * does not exist the method returns false. If the file exists, the method
	 * returns true and populates the ContactList object with the directory
	 * object from the disk file.
	 */
	public boolean readFromDisk(ContactList directoryOfContacts) {
		boolean successfulyreadFromDisk = true;
		System.out.println("Method readFromDisk called");
		return successfulyreadFromDisk;
	}

}
