/**
 * Defines a reusable class StreetAddress. One object of class StreetAddress
 * contains a house number, street, zip, city, state, & country.
 * 
 * @author irmarodarte
 */
public class StreetAddress {
	private String houseNumber;
	private String street;
	private String zip;
	private String city;
	private String state;
	private String country;

	/**
	 * Sets the value of houseNumber, street, zip, city, state, & country when a
	 * new object of class StreetAddress is created
	 */
	public StreetAddress() {
		System.out.println("New object of class StreetAddress constructed");
	}

	/**
	 * Sets the value of houseNumber to the value of the parameter
	 * newHouseNumber
	 * 
	 * @param houseNumber
	 */
	public void setHouseNumber(String newHouseNumber) {
		System.out.println("Method StreetAddress.setHouseNumber called");
	}

	/**
	 * Sets the value of street to the value of the parameter newStreet
	 * 
	 * @param newStreet
	 */
	public void setStreet(String newStreet) {
		System.out.println("Method StreetAddress.setStreet called");
	}

	/**
	 * Sets the value of zip to the value of the parameter newZip
	 * 
	 * @param newZip
	 */
	public void setZip(String newZip) {
		System.out.println("Method StreetAddress.setZip called");
	}

	/**
	 * Sets the value of city to the value of the parameter newCity
	 * 
	 * @param newCity
	 */
	public void setCity(String newCity) {
		System.out.println("Method StreetAddress.setCity called");
	}

	/**
	 * Sets the value of state to the value of the parameter newState
	 * 
	 * @param newState
	 */
	public void setState(String newState) {
		System.out.println("Method StreetAddress.setState called");
	}

	/**
	 * Sets the value of country to the value of the parameter newCountry
	 * 
	 * @param newCountry
	 */
	public void setCountry(String newCountry) {
		System.out.println("Method StreetAddress.setCountry called");
	}

	/**
	 * Returns the value of houseNumber
	 * 
	 * @return
	 */
	public String getHouseNumber() {
		System.out.println("Method StreetAddress.getHouseNumber called");
		return houseNumber;
	}

	/**
	 * Returns the value of street
	 * 
	 * @return
	 */
	public String getStreet() {
		System.out.println("Method StreetAddress.getStreet called");
		return street;
	}

	/**
	 * Returns the value of zip
	 * 
	 * @return
	 */
	public String getZip() {
		System.out.println("Method StreetAddress.getZip called");
		return zip;
	}

	/**
	 * Returns the value of city
	 * 
	 * @return
	 */
	public String getCity() {
		System.out.println("Method StreetAddress.getCity called");
		return city;
	}

	/**
	 * Returns the value of state
	 * 
	 * @return
	 */
	public String getState() {
		System.out.println("Method StreetAddress.getState called");
		return state;
	}

	/**
	 * Returns the value of country
	 * 
	 * @return
	 */
	public String getCountry() {
		System.out.println("Method StreetAddress.getCountry called");
		return country;
	}

	/**
	 * Returns a string containing the values of house number, street, city,
	 * zip, state, & country
	 */
	public String toString() {
		System.out.println("Method StreetAddress.toString called");
		return ("");
	}

}