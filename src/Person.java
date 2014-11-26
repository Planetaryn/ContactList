import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Define a reusable class Person. One object of class Person contains the
 * person's email, phone number, first name, last name, notes, & their
 * StreetAddress object.
 * 
 * @author Kelly Lam
 */
public class Person {
	private String email;
	private String phoneNumber;
	private String firstName;
	private String lastName;
	private String notes;
	private StreetAddress address;

	/**
	 * Constructor for class Person. Creates a new object of class
	 * StreetAddress, and fills all fields with blank strings when a new object
	 * of class Person is created.
	 * 
	 * @author Noah
	 */
	public Person() { // ShS. Commented out code that is not needed.
	/**	Person person;
		person = new Person(); */
		firstName ="";
		//person.setFirstName(""); // ShS. Commented out code that is not needed; there is no need to use the set function within the Person class
		lastName ="";
		// person.setLastName("");// ShS. Commented out code that is not needed; there is no need to use the set function within the Person class
		email="";
		//person.setEmail("");// ShS. Commented out code that is not needed; there is no need to use the set function within the Person class
		phoneNumber="";
		//person.setPhoneNumber("");// ShS. Commented out code that is not needed; there is no need to use the set function within the Person class
		notes="";
		// person.setNotes(""); // ShS. Commented out code that is not needed; there is no need to use the set function within the Person class
	}

	/**
	 * Sets the value of email to the value of the parameter newEmail
	 * 
	 * @param newEmail
	 * @author Kelly
	 */
	public void setEmail(String newEmail) {
		email = newEmail;
	}

	/**
	 * Sets the value of phoneNumber to the value of the parameter
	 * newPhoneNumber
	 * 
	 * @param newPhoneNumber
	 * @author Kelly
	 */
	public void setPhoneNumber(String newPhoneNumber) {
		phoneNumber = newPhoneNumber;
	}

	/**
	 * Sets the value of firstName to the value parameter newFirstName
	 * 
	 * @param newFirstName
	 * @author Irma
	 */
	public void setFirstName(String newFirstName) {
		firstName = newFirstName;
	}

	/**
	 * Sets the value of lastName to the value of the parameter newLastName
	 * 
	 * @param newLastName
	 * @author Irma
	 */
	public void setLastName(String newLastName) {
		lastName = newLastName;
	}

	/**
	 * Sets the value of notes to the value of the parameter newNotes
	 * 
	 * @param newNotes
	 * @author Kelly
	 */
	public void setNotes(String newNotes) {
		notes = newNotes;
	}

	/**
	 * Returns the value of email
	 * 
	 * @return
	 * @author Kelly
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Returns the value of phoneNumber
	 * 
	 * @return
	 * @author Kelly
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * Returns the value of firstName
	 * 
	 * @return
	 * @author Irma
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Returns the value of lastName
	 * 
	 * @return
	 * @author Irma
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Returns the value of Notes
	 * 
	 * @return
	 * @author Kelly
	 */
	public String getNotes() {
		return notes;
	}

	/**
	 * Verify the phone number format to make sure the phone number is valid.
	 * Returns true if the phone number is correct.
	 * 
	 * @param testPhoneNumber
	 * @return
	 * @author Kelly
	 */
	public boolean verifyPhoneFormat(String testPhoneNumber) {
//		String verifyPhoneNumber = testPhoneNumber; // ShS. No need to copy strings. Use input parameter in the matcher directly
		
		Pattern pattern = Pattern.compile("\\d{3}-\\d{3}-\\d{4}");
//		Matcher matcher = pattern.matcher(verifyPhoneNumber); // ShS. No need to copy strings. Use input parameter in the matcher directly
		Matcher matcher = pattern.matcher(testPhoneNumber);

		if (matcher.matches()) {
			return true;
		}
		else {
			return false;
			// Pop out "Phone Number must be in the form XXX-XXX-XXXX" in GUI.
		}
	}

	/**
	 * Verify the email format to make sure the email is valid. Returns true if
	 * the email format is correct.
	 * 
	 * @param testEmail
	 * @return
	 * @author Kelly
	 */
	public boolean verifyEmailFormat(String testEmail) {
	//	String verifyEmail = testEmail; // ShS. No need to copy strings. Use input parameter in the matcher directly
		
		Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
//		Matcher matcher = pattern.matcher(verifyEmail); // ShS. No need to copy strings. Use input parameter in the matcher directly
		Matcher matcher = pattern.matcher(testEmail);

		if (matcher.matches()) {
			return true;
		}
		else {
			return false;
			// Pop out "Email must be in the form ______@_____.____" in GUI.
		}
	}

	/**
	 * Returns a string containing a persons first name, last name, email
	 * address, phone number, address, & notes.
	 * 
	 * @return
	 * @author Kelly
	 */
	public String toString() {
		System.out.println("ToString method is called");
		return ("");
	}

}