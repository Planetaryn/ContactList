/**
 * This Class provides interface to the hard disk for the OO Java project. The
 * class has methods for saving and retrieving the  whole directory list to/from a disk.
 * The class saves the whole directory (override the existing file). The class can read
 * the directory from the disk and return the directory (ContactList object) to the invoking class.  
 * 
 * @author Shmuel Shaffer
 * This is a version 2 which includes modifications based on feedback we received in the class.
 * Version 3: changed the functionality of the contractor to modify the private fileExists flag
 * formated 
 * V4: Added a getDiskFileObject method
 * V5: Added @param to the java doc description
 * V6: Corrected  typos per input from Kelly: “SuccessfulyWrittenToDisk” and “SuccessfulyReadFromDisk”  
 *     changed to “SuccessfullyWrittenToDisk” and “SuccessfullyReadFromDisk”
 * v7: Made the constructor public per input from Noah.    
 * 
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
	 * 
	 * @param
	 */
	public Disk() {

	}

	/**
	 * The writeToDisk method gets the ContactList Object as an input parameter
	 * and overrides the existing directory file with a new directory file. The
	 * method returns true if successful, and false if an error occurs.
	 * 
	 * @param - directoryOfContacts: ContactList object containing the directory
	 *        object
	 * @return - Returns true if write operation was successful and false if it
	 *         failed.
	 */
	public boolean writeToDisk(ContactList directoryOfContacts) {
		boolean successfullyWrittenToDisk = true;
		System.out.println("Method writeToDisk called");
		return successfullyWrittenToDisk;
	}

	/**
	 * The readFromDisk method attempts to read an object from the disk. If the
	 * read operation fails, the method returns false. If the read operation
	 * succeeds the method returns true and populates the private class variable
	 * ContactList object with the directory object from the disk file.
	 * 
	 * @return - Returns true if read is successful and false if operation
	 *         failed.
	 */

	public boolean readFromDisk() {
		boolean successfullyreadFromDisk = true;
		System.out.println("Method readFromDisk called");
		return successfullyreadFromDisk;
	}

	/**
	 * The method getObjectFromDiskFile returns the object which was read from
	 * the disk by the readFromDisk method. If the readFromDisk method was not
	 * successful, the method returns null (rather than the address of a valid
	 * ContactList object).
	 * 
	 * @return - Returns ContactList object containing the directory object
	 *         which was read from the disk.
	 */
	public ContactList getDiskFileObject() {
		System.out.println("Method getDiskFileObject called");
		return directoryOfContactsFromDisk;
	}

}