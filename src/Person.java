/**
 * Define a reusable class Person. One object of class Person includes email, 
 * phone number, notes.
 */
public class Person {
	private String vizEmail;
	private String vizPhoneNumber;
	private String vizNotes;
	private String normalizedEmail;
	private String normalizedPhoneNumber;
	private String normalizedNotes;
    private String firstName;
    private String lastName;


    /**
	 * It is a parameterized constructor that runs Name and StreetAddress.
	 */
	public void Constructor() {
		
	}
	
	/**
	 * Set the value for visible email
	 */
	public void setVizEmail (String newVizEmail) {
		
	}
	
	/**
	 * Set the value for visible phone number
	 */
	public void setVizPhoneNumber(String newVizPhoneNumber) {
		
	}

	/**
	 * Set the value for visible notes
	 */
	public void setVizNotes(String newVizNotes) {
		
	}
	
	/**
	 * Return the value of visible email
	 */
	public String getVizEmail() {
		return vizEmail;
	}
	
	/**
	 * Return the value of visible phone number
	 */
	public String getVizPhoneNumber() {
		return vizPhoneNumber;
	}
	
	/**
	 * Return the value of visible notes
	 */
	public String getVizNotes() {
		return vizNotes;
	}
	
	/**
	 * Set the value for search/sort email
	 */
	public void setNormalizedEmail (String newSSEmail) {
		
	}
	
	/**
	 * Set the value for search/sort phone number
	 */
	public void setNormalizedPhoneNumber(String newSSPhoneNumber) {
		
	}

	/**
	 * Set the value for search/sort notes to
	 */
	public void setNormalizedNotes(String newSSNotes) {
		
	}
	
	/**
	 * Return the result that search/sort by email
	 */
	public String getSSEmail() {
		return normalizedEmail;
	}
	
	/**
	 * Return the result that search/sort by phone number
	 */
	public String getNormalizedPhoneNumber() {
		return normalizedPhoneNumber;
	}
	
	/**
	 * Return the result that search/sort by notes
	 */
	public String getNormalizedNotes() {
		return normalizedNotes;
	}

	/**
	 * Return all the data of the people
	 */
	public String toString() {
		return ("");
	}
	
	//The below two methods is in response to case 1A
	/**
	 * Verify the phone number format to make sure the phone number is valid
	 * Returns true if the phone number is correct
	 */
	public boolean verifyPhoneFormat(String newVizPhoneNumber) {
		return true;
	}

	/**
	 * Verify the email format to make sure the email is valid
	 * Returns true if the email format is correct
	 */
	public boolean verifyEmailFormat(String newVizEmail) {
		return true;
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
    public void printName(){
        System.out.println("Using method printName ");
    }


}
