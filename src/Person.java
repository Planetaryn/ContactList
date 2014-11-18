/*
 * Define a reusable class Person. One object of class Person includes email, 
 * phone number, notes.
 * File History:
 * Author Kelly Lam Version 1
 * Version 2: Irma added variables and methods to handle first and last name
 */
public class Person {
	private String vizEmail;
	private int vizPhoneNumber;
	private String vizNotes;
	private String normalizedEmail;
	private int normalizedPhoneNumber;
	private String normalizedNotes;
	private String firstName;
	private String lastName;
	
	/**
	 * It is a parameterized constructor that runs Name, StreetAddress and Notes.
	 */
	public void Constructor() {
		
	}
	
	/**
	 * Set the value for visible email
	 */
	public void setVizEmail (String newVizEmail) {
		System.out.println("Using method setVizEmail");
	}
	
	/**
	 * Set the value for visible phone number
	 */
	public void setVizPhoneNumber(int newVizPhoneNumber) {
		System.out.println("Using method setVizPhoneNumber");
	}

	/**
	 * Set the value for visible notes
	 */
	public void setVizNotes(String newVizNotes) {
		System.out.println("Using method setVizNotes");	
	}
	
	/**
	 * Return the value of visible email
	 */
	public String getVizEmail() {
		System.out.println("Using method getVizEmail");
		return vizEmail;
	}
	
	/**
	 * Return the value of visible phone number
	 */
	public int getVizPhoneNumber() {
		System.out.println("Using method getVizPhoneNumber");
		return vizPhoneNumber;
	}
	
	/**
	 * Return the value of visible notes
	 */
	public String getVizNotes() {
		System.out.println("Using method getVizNotes");
		return vizNotes;
	}
	
	/**
	 * Set the value for normalized email
	 */
	public void setNormalizedEmail (String newNormailizedEmail) {
		System.out.println("Using method setNormalizedEmail");
	}
	
	/**
	 * Set the value for normalized phone number
	 */
	public void setNormalizedPhoneNumber(int newNormalizedPhoneNumber) {
		System.out.println("Using method setNormalizedPhoneNumber");
	}

	/**
	 * Set the value for normalized notes to
	 */
	public void setNormalizedNotes(String newNormailzedNotes) {
		System.out.println("Using method setNormalizedNotes");
	}
	
	/**
	 * Return the result of normalized email
	 */
	public String getNormalizedEmail() {
		System.out.println("Using method getNormalizedEmail");
		return normalizedEmail;
	}
	
	/**
	 * Return the result of normalized phone number
	 */
	public int getNormalizedPhoneNumber() {
		System.out.println("Using method getNormalizedPhoneNumber");
		return normalizedPhoneNumber;
	}
	
	/**
	 * Return the result normalized notes
	 */
	public String getNormlizedNotes() {
		System.out.println("Using method getNormalizedNotes");
		return normalizedNotes;
	}

	/**
	 * Return all the information of the contact list
	 */
	public String toString() {
		System.out.println("Using method toSring");
		return vizEmail + vizPhoneNumber + vizNotes;
	}
	
    /**
     * Sets the value for firstName to "first"
     * @param first
     */
    public void setFirstName(String first) {
        System.out.println("Using method setFirstName ");
    }

    /**
     * Sets the value for firstName to "last"
     * @param last
     */

    public void setLastName(String last) {
        System.out.println("Using method setLastName ");
    }

    /**
     * Returns the value in firstName
     * @return
     */
    public String getFirsName() {
        System.out.println("Using method getFirstName ");
        return firstName;
    }

    /**
     * Returns the value in lastName
     * @return
     */
    public String getLastName() {
        System.out.println("Using method getLastName ");
        return lastName;
    }

    /**
     * Prints the values for lastNmae and firstName fo the Name that calls this method.
     */
    public void printName() {
        System.out.println("Using method printName ");
    }
	
	//The below two methods is in response to case 1A
	/**
	 * Verify the phone number format to make sure the phone number is valid
	 * It does no return to user
	 */
	public boolean verifyPhoneFormat(String newVizPhoneNumber) {
		System.out.println("Using method verifyPhoneFormat");
		return true;
	}

	/**
	 * Verify the email format to make sure the email is valid
	 * It will prompt users to correct it if the email is invalid
	 */
	public boolean verifyEmailFormat(String newVizEmail) {
		System.out.println("Using method verifyEmailFormat");
		return true;
	}

}
