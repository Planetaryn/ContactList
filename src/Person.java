/**
 * Define a reusable class Person. One object of class Person contains the
 * persons visible email, normalized email, visible phone number, normalized
 * phone number, first name, last name, & notes.
 * 
 * @author kellylam
 */
public class Person {
	private String vizEmail;
	private String normalizedEmail;
	private String vizPhoneNumber;
	private String normalizedPhoneNumber;
	private String firstName;
	private String lastName;
	private String notes;

	/**
	 * This method creates a new object of class StreetAddress when a new object
	 * of class Person is constructed
	 */
	public Person() {
		System.out.println("New object of class Person constructed");
	}

	/**
	 * Sets the value of vizEmail
	 * 
	 * @param newVizEmail
	 */
	public void setVizEmail(String newVizEmail) {
		System.out.println("Method Person.setVizEmail called");
	}

	/**
	 * Sets the value of normalizedEmail
	 * 
	 * @param newNormalizedEmail
	 */
	public void setNormalizedEmail(String newNormalizedEmail) {
		System.out.println("Method Person.setNormalizedEmail called");
	}

	/**
	 * Sets the value of vizPhoneNumber
	 * 
	 * @param newVizPhoneNumber
	 */
	public void setVizPhoneNumber(String newVizPhoneNumber) {
		System.out.println("Method Person.setPhoneNumber called");
	}

	/**
	 * Sets the value of normalizedPhoneNumber
	 * 
	 * @param newSSPhoneNumber
	 */
	public void setNormalizedPhoneNumber(String newNormalizedPhoneNumber) {
		System.out.println("Method Person.setNormalizedPhoneNumber called");
	}

	/**
	 * Sets the value of firstName to the parameter newFirstName
	 * 
	 * @param first
	 */
	public void setFirstName(String newFirstName) {
		System.out.println("Method Person.setFirstName called");
	}

	/**
	 * Sets the value of lastName to the parameter newLastName
	 * 
	 * @param last
	 */
	public void setLastName(String newLastName) {
		System.out.println("Method Person.setLastName called");
	}

	/**
	 * Sets the value of notes to the parameter newNotes
	 * 
	 * @param newNotes
	 */
	public void setNotes(String newNotes) {
		System.out.println("Method Person.setNotes called");
	}

	/**
	 * Returns the value of vizEmail
	 * 
	 * @return
	 */
	public String getVizEmail() {
		System.out.println("Method Person.getVizEmail called");
		return vizEmail;
	}

	/**
	 * Returns the value of normalizedEmail
	 * 
	 * @return
	 */
	public String getNormalizedEmail() {
		System.out.println("Method Person.getNormalizedEmail called");
		return normalizedEmail;
	}

	/**
	 * Returns the value of vizPhoneNumber
	 * 
	 * @return
	 */
	public String getVizPhoneNumber() {
		System.out.println("Method Person.getVizPhoneNumber called");
		return vizPhoneNumber;
	}

	/**
	 * Returns the value of normalizedPhoneNumber
	 * 
	 * @return
	 */
	public String getNormalizedPhoneNumber() {
		System.out.println("Method Person.getNormalizedPhoneNumber called");
		return normalizedPhoneNumber;
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
