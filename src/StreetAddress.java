import java.io.Serializable;

/**
 * Defines a reusable class StreetAddress. One object of class StreetAddress
 * contains a house number, street, zip, city, state, & country.
 *
 * @author irmarodarte
 */
@SuppressWarnings("serial")
public class StreetAddress implements Serializable {
	private String houseNumber;
	private String street;
	private String zip;
	private String city;
	private String state;
	private String country;

	/**
	 * Constructor for class StreetAddress. Creates a new object of class
	 * StreetAddress and fills houseNumber, street, zip, city, state, & country
	 * to be blanks strings when a new object of class StreetAddress is created.
	 * 
	 * @author irmarodarte
	 */
	public StreetAddress() {
		setHouseNumber("House #");
		setStreet("Street");
		setZip("ZIP code");
		setCity("City");
		setState("State");
		setCountry("Country");
	}

	/**
	 * Parametrized constructor for class StreetAddress. Creates a new object of
	 * class StreetAddress and fills houseNumber, street, zip, city, state, &
	 * country with the values passed as parameters.
	 *
	 * @author irmarodarte
	 */
	public StreetAddress(String newHouse, String newStreet, String newZip,
			String newCity, String newState, String newCountry) {
		houseNumber = newHouse;
		street = newStreet;
		zip = newZip;
		city = newCity;
		state = newState;
		country = newCountry;
	}

	/**
	 * Sets the value of houseNumber to the value of the parameter
	 * newHouseNumber.
	 * 
	 * @param newHouseNumber
	 * @author irmarodarte
	 */
	public void setHouseNumber(String newHouseNumber) {
		houseNumber = newHouseNumber;
	}

	/**
	 * Sets the value of street to the value of the parameter newStreet.
	 * 
	 * @param newStreet
	 * @author irmarodarte
	 */
	public void setStreet(String newStreet) {
		street = newStreet;
	}

	/**
	 * Sets the value of zip to the value of the parameter newZip.
	 * 
	 * @param newZip
	 * @author irmarodarte
	 */
	public void setZip(String newZip) {
		zip = newZip;
	}

	/**
	 * Sets the value of city to the value of the parameter newCity.
	 * 
	 * @param newCity
	 * @author irmarodarte
	 */
	public void setCity(String newCity) {
		city = newCity;
	}

	/**
	 * Sets the value of state to the value of the parameter newState.
	 * 
	 * @param newState
	 * @author irmarodarte
	 */
	public void setState(String newState) {
		state = newState;
	}

	/**
	 * Sets the value of country to the value of the parameter newCountry.
	 * 
	 * @param newCountry
	 * @author irmarodarte
	 */
	public void setCountry(String newCountry) {
		country = newCountry;
	}

	/**
	 * Returns the value of houseNumber.
	 * 
	 * @return
	 * @author irmarodarte
	 */
	public String getHouseNumber() {
		return houseNumber;
	}

	/**
	 * Returns the value of street.
	 * 
	 * @return
	 * @author irmarodarte
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * Returns the value of zip.
	 * 
	 * @return
	 * @author irmarodarte
	 */
	public String getZip() {
		return zip;
	}

	/**
	 * Returns the value of city.
	 *
	 * @return
	 * @author irmarodarte
	 */
	public String getCity() {
		return city;
	}

	/**
	 * Returns the value of state.
	 *
	 * @return
	 * @author irmarodarte
	 */
	public String getState() {
		return state;
	}

	/**
	 * Returns the value of country.
	 *
	 * @return
	 * @author irmarodarte
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * Returns a string containing the values of house number, street, city,
	 * zip, state, & country.
	 * 
	 * @return
	 * @author irmarodarte
	 */
	@Override
	public String toString() {
		return "houseNumber = " + houseNumber + "\n" + "street = " + street
				+ "\n" + "zip = " + zip + "\n" + "city = " + city + "\n"
				+ "state = " + state + "\n" + "country =" + country;

	}

}