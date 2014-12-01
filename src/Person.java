import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Define a reusable class Person. One object of class Person contains the
 * person's email, phone number, first name, last name, notes, & their
 * StreetAddress object.
 * 
 * @author Kelly Lam
 */

@SuppressWarnings("serial")
public class Person implements Serializable {
	private String email;
	private String phoneNumber;
	private String firstName;
	private String lastName;
	private String notes;
	private StreetAddress address = new StreetAddress();

	/**
	 * Constructor for class Person. Creates a new object of class
	 * StreetAddress, and fills all fields with blank strings when a new object
	 * of class Person is created.
	 * 
	 * @author Noah
	 */
	public Person() {
		this.setFirstName("New Person");
		this.setLastName("");
	}

	/**
	 * Sets the value of email to the value of the parameter newEmail.
	 * 
	 * @param newEmail
	 * @author Kelly
	 */
	public void setEmail(String newEmail) {
		email = newEmail;
	}

	/**
	 * Sets the value of phoneNumber to the value of the parameter
	 * newPhoneNumber.
	 * 
	 * @param newPhoneNumber
	 * @author Kelly
	 */
	public void setPhoneNumber(String newPhoneNumber) {
		phoneNumber = newPhoneNumber;
	}

	/**
	 * Sets the value of firstName to the value parameter newFirstName.
	 * 
	 * @param newFirstName
	 * @author Irma
	 */
	public void setFirstName(String newFirstName) {
		firstName = newFirstName;
	}

	/**
	 * Sets the value of lastName to the value of the parameter newLastName.
	 * 
	 * @param newLastName
	 * @author Irma
	 */
	public void setLastName(String newLastName) {
		lastName = newLastName;
	}

	/**
	 * Sets the value of house number in class StreetAddress to the value of the
	 * parameter newHouseNumber.
	 * 
	 * @param newHouseNumber
	 * @author noahgoldsmith
	 */
	public void setHouseNumber(String newHouseNumber) {
		address.setHouseNumber(newHouseNumber);
	}

	/**
	 * Sets the value of street in class StreetAddress to the value of the
	 * parameter newStreet.
	 * 
	 * @param newStreet
	 * @author noahgoldsmith
	 */
	public void setStreet(String newStreet) {
		address.setStreet(newStreet);
	}

	/**
	 * Sets the value of zip in class StreetAddress to the value of the
	 * parameter newZip.
	 * 
	 * @param newZip
	 * @author noahgoldsmith
	 */
	public void setZip(String newZip) {
		address.setZip(newZip);
	}

	/**
	 * Sets the value of city in class StreetAddress to the value of the
	 * parameter newCity.
	 * 
	 * @param newCity
	 * @author noahgoldsmith
	 */
	public void setCity(String newCity) {
		address.setCity(newCity);
	}

	/**
	 * Sets the value of state in class StreetAddress to the value of the
	 * parameter newState.
	 * 
	 * @param newState
	 * @author noahgoldsmith
	 */
	public void setState(String newState) {
		address.setState(newState);
	}

	/**
	 * Sets the value of country in class StreetAddress to the value of the
	 * parameter newCountry.
	 * 
	 * @param newCountry
	 * @author noahgoldsmith
	 */
	public void setCountry(String newCountry) {
		address.setCountry(newCountry);
	}

	/**
	 * Sets the value of notes to the value of the parameter newNotes.
	 * 
	 * @param newNotes
	 * @author Kelly
	 */
	public void setNotes(String newNotes) {
		notes = newNotes;
	}

	/**
	 * Returns the value of email.
	 * 
	 * @return
	 * @author Kelly
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Returns the value of phoneNumber.
	 * 
	 * @return
	 * @author Kelly
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * Returns the value of firstName.
	 * 
	 * @return
	 * @author Irma
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Returns the value of lastName.
	 * 
	 * @return
	 * @author Irma
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Returns a string containing a persons house number.
	 * 
	 * @return
	 * @author noahgoldsmith
	 */
	public String getHouseNumber() {
		return address.getHouseNumber();
	}

	/**
	 * Returns a string containing a persons street.
	 * 
	 * @return
	 * @author noahgoldsmith
	 */
	public String getStreet() {
		return address.getStreet();
	}

	/**
	 * Returns a string containing a persons zipcode.
	 * 
	 * @return
	 * @author noahgoldsmith
	 */
	public String getZip() {
		return address.getZip();
	}

	/**
	 * Returns a string containing a persons city.
	 * 
	 * @return
	 * @author noahgoldsmith
	 */
	public String getCity() {
		return address.getCity();
	}

	/**
	 * Returns a string containing a persons state.
	 * 
	 * @return
	 * @author noahgoldsmith
	 */
	public String getState() {
		return address.getState();
	}

	/**
	 * Returns a string containing a persons country.
	 * 
	 * @return
	 * @author noahgoldsmith
	 */
	public String getCountry() {
		return address.getCountry();
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
		String verifyPhoneNumber = testPhoneNumber;

		Pattern pattern = Pattern.compile("\\d{3}-\\d{3}-\\d{4}");
		Matcher matcher = pattern.matcher(verifyPhoneNumber);

		if (matcher.matches()) {
			return true;
		} else {
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
		String verifyEmail = testEmail;

		Pattern pattern = Pattern
				.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
		Matcher matcher = pattern.matcher(verifyEmail);

		if (matcher.matches()) {
			return true;
		} else {
			return false;
			// Pop out "Email must be in the form ______@_____.____" in GUI.
		}
	}

	/**
	 * This method compares the person object person1 to another person object
	 * person2. returns -1 if person1 < person2m returns 0 if person1 ==
	 * person2, returns 1 if person1 > person2.
	 * 
	 * @param person2
	 * @author noahgoldsmith
	 */
	public int compareTo(Person person2) {
		int comparisonValue = 0;
		return comparisonValue;
	}

	/**
	 * Returns a string containing a persons first name & last name.
	 * 
	 * @return
	 * @author Kelly
	 */
	@Override
	public String toString() {
		return (this.getFirstName() + " " + this.getLastName());
	}

}
