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
 * v8: Added the actual code for the class.
 * v9: This version is fully tested with the non-GUI main program.
 * 
 */
import java.io.*;

public class Disk {
	private final String CONTACT_LIST_FILE_NAME = "Contact_List.ser";
	private boolean fileExists=false;

	private File contactListFile = new File(CONTACT_LIST_FILE_NAME);
	private ContactList contactListFromDisk = null;

	/**
	 * Constructor for the Disk Class finds if the DirectoryProject.txt file
	 * exists. If it does not exists, the constructor sets the value of the
	 * fileExists variable to true.
	 * 
	 * @param
	 */


	/**
	 * Constructor for the DiskToFromDisk
	 */
	Disk() {
		System.out.println("In constructor");
		if (contactListFile.exists()) {
			fileExists = true;			
			System.out.println("file exists");

		} else {
			System.out.println("file does not exist");
		}
		System.out.println("file exists flag ="+ fileExists);
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
	public boolean writeToDisk(ContactList contactListObject) {
		FileOutputStream fileOutput = null;
		ObjectOutputStream objectOutput = null;
		fileExists = true;
		try {
			fileOutput = new FileOutputStream(contactListFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			fileExists = false;
		}
		try {
			objectOutput = new ObjectOutputStream(fileOutput);
		} catch (IOException e) {
			e.printStackTrace();
			fileExists = false;

		}
		try {
			objectOutput.writeObject(contactListObject);

		} catch (IOException e) {
			e.printStackTrace();
			fileExists = false;

		}
		return fileExists;
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
		// boolean successfullyreadFromDisk = true;
		ObjectInputStream objectInputStream = null;
		FileInputStream fileInput = null;
		if (fileExists) {
			try {
				fileInput = new FileInputStream(contactListFile);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
				fileExists = false;
			}
			try {
				objectInputStream = new ObjectInputStream(fileInput);
			} catch (IOException e) {

				e.printStackTrace();
				fileExists = false;

			}
			try {
				contactListFromDisk = (ContactList) objectInputStream
						.readObject();
			} catch (IOException e) {

				e.printStackTrace();
				fileExists = false;

			} catch (ClassNotFoundException e) {

				e.printStackTrace();
				fileExists = false;

			}
		}
		return fileExists;
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
		if (!fileExists) {
			contactListFromDisk = null;

		}
		return contactListFromDisk;
	}

}
