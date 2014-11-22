/**
 * This Class provides interface to the hard disk for the OO Java project. The
 * class has methods for saving and retrieving the  whole directory list to/from a disk.
 * The class saves the whole directory (override the existing file). The class can read
 * the directory from the disk and return the directory (ContactList object) to the invoking class.  
 * 
 * @author Shmuel Shaffer
 * This is a version 2 which includes modifications based on feedback we received in the class.
 * Version 3: changed the functionality of the contractor to modify the private fileExists flag
 * formated V4: Added a getDiskFileObject method
 */
import java.io.*;
import java.util.*;

public class Disk {
	private final String CONTACT_LIST_FILE_NAME = "Contact_List.ser";
	private boolean fileExists;
	private ContactList directoryOfContactsFromDisk;

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
	 * The readFromDisk method attempts to read an object from the disk. If the read
	 * operation fails, the method returns false. If the read operation succeeds
	 * the method returns true and populates the private class variable ContactList 
	 * object with the directory object from the disk file.
	 */

	public boolean readFromDisk() {
		boolean successfulyreadFromDisk = true;
		System.out.println("Method readFromDisk called");
		return successfulyreadFromDisk;
	}
	
	/**
	 * The method getObjectFromDiskFile returns the object which was read 
	 * from the disk by the readFromDisk method.
	 * If the readFromDisk method was not successful, the method returns 
	 * null (rather than the address of a valid ContactList object).
	 */
	public ContactList  getDiskFileObject(){
		System.out.println("Method getDiskFileObject called");
		return directoryOfContactsFromDisk;
}

}
