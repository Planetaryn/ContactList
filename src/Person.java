/**
 * Define a reusable class Person. One object of class Person contains the
 * person’s email, phone number, first name, last name, notes, & their StreetAddress object.
 * 
 * @author kellylam
 */
public class Person {
	private String email;
	private String phoneNumber;
	private String firstName;
	private String lastName;
	private String notes;
	private StreetAddress address;

	/**
	 * This method creates a new object of class StreetAddress when a new object
	 * of class Person is constructed
	 */
	public Person() {
		setFirstName("");
		setLastName("");
		setNotes("");
		setEmail("");
		setPhoneNumber("");
		System.out.println("New object of class Person constructed");
	}

	/**
	 * Sets the value of email to the value of the parameter newEmail
	 * 
	 * @param newEmail
	 */
	public void setEmail(String newEmail) {
		System.out.println("Method Person.setEmail called");
	}

	/**
	 * Sets the value of phoneNumber to the value of the parameter
	 * newPhoneNumber
	 * 
	 * @param newPhoneNumber
	 */
	public void setPhoneNumber(String newPhoneNumber) {
		System.out.println("Method Person.setPhoneNumber called");
	}

	/**
	 * Sets the value of firstName to the value parameter newFirstName
	 * 
	 * @param newFirstName
	 */
	public void setFirstName(String newFirstName) {
		System.out.println("Method Person.setFirstName called");
	}

	/**
	 * Sets the value of lastName to the value of the parameter newLastName
	 * 
	 * @param newLastName
	 */
	public void setLastName(String newLastName) {
		System.out.println("Method Person.setLastName called");
	}

	/**
	 * Sets the value of notes to the value of the parameter newNotes
	 * 
	 * @param newNotes
	 */
	public void setNotes(String newNotes) {
		System.out.println("Method Person.setNotes called");
	}

	/**
	 * Returns the value of email
	 * 
	 * @return
	 */
	public String getEmail() {
		System.out.println("Method Person.getEmail called");
		return email;
	}

	/**
	 * Returns the value of phoneNumber
	 * 
	 * @return
	 */
	public String getPhoneNumber() {
		System.out.println("Method Person.getPhoneNumber called");
		return phoneNumber;
	}

	/**
	 * Returns the value of firstName
	 * 
	 * @return
	 */
	public String getFirstName() {
		System.out.println("Method Person.getFirstName called");
		return firstName;
	}

	/**
	 * Returns the value of lastName
	 * 
	 * @return
	 */
	public String getLastName() {
		System.out.println("Method Person.getLastName called");
		return lastName;
	}

	/**
	 * Returns the value of Notes
	 * 
	 * @return
	 */
	public String getNotes() {
		System.out.println("Method Person.getNotes called");
		return notes;
	}

	/**
	 * Verify the phone number format to make sure the phone number is valid.
	 * Returns true if the phone number is correct.
	 * 
	 * @param testPhoneNumber
	 * @return
	 */
	public boolean verifyPhoneFormat(String testPhoneNumber) {
		System.out.println("Method Person.verifyPhoneFormat called");
		return true;
	}

	/**
	 * Verify the email format to make sure the email is valid. Returns true if
	 * the email format is correct.
	 * 
	 * @param testEmail
	 * @return
	 */
	public boolean verifyEmailFormat(String testEmail) {
		System.out.println("Method Person.verifyEmailFormat called");
		return true;
	}

	/**
	 * Returns a string containing a persons first name, last name, email
	 * address, phone number, address, & notes.
	 */
	public String toString() {
		System.out.println("Method Person.toString called");
		return ("");
	}

}
