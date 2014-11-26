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
     * Constructor for class StreetAddress. Creates a new object of class StreetAddress
     * and fills houseNumber, street, zip, city, state, & country to be blanks strings when a new
     * object of class StreetAddress is created.
     */
    public StreetAddress() {
        setHouseNumber("");
        setStreet("");
        setZip("");
        setCity("");
        setState("");
        setCountry("");
    }

    /**
     * Parametrized constructor for class StreetAddress. Creates a new object of class StreetAddress
     * and fills houseNumber, street, zip, city, state, & country with the values passed as parameters
     *
     */
    public StreetAddress(String newHouse, String newStreet, String newZip, String newCity, String newState, String newCountry) {
        System.out.println("Using parametrized  constructor");
        houseNumber = newHouse;
        street = newStreet;
        zip = newZip;
        city = newCity;
        state = newState;
        country = newCountry;
    }


    /**
     * Sets the value of houseNumber to the value of the parameter
     * newHouseNumber
     * @param newHouseNumber
     */
    public void setHouseNumber(String newHouseNumber) {
        System.out.println("Method StreetAddress.setHouseNumber called");
        houseNumber = newHouseNumber;
    }

    /**
     * Sets the value of street to the value of the parameter newStreet
     * @param newStreet
     */
    public void setStreet(String newStreet) {
        System.out.println("Method StreetAddress.setStreet called");
        street = newStreet;
    }

    /**
     * Sets the value of zip to the value of the parameter newZip
     * @param newZip
     */
    public void setZip(String newZip) {
        System.out.println("Method StreetAddress.setZip called");
        zip = newZip;
    }

    /**
     * Sets the value of city to the value of the parameter newCity
     * @param newCity
     */
    public void setCity(String newCity) {
        System.out.println("Method StreetAddress.setCity called");
        city = newCity;
    }

    /**
     * Sets the value of state to the value of the parameter newState
     * @param newState
     */
    public void setState(String newState) {
        System.out.println("Method StreetAddress.setState called");
        state = newState;
    }

    /**
     * Sets the value of country to the value of the parameter newCountry
     * @param newCountry
     */
    public void setCountry(String newCountry) {
        System.out.println("Method StreetAddress.setCountry called");
        country = newCountry;
    }

    /**
     * Returns the value of houseNumber
     * @return
     */
    public String getHouseNumber() {
        System.out.println("Method StreetAddress.getHouseNumber called");
        return houseNumber;
    }

    /**
     * Returns the value of street
     * @return
     */
    public String getStreet() {
        System.out.println("Method StreetAddress.getStreet called");
        return street;
    }

    /**
     * Returns the value of zip
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
        return "houseNumber = " + houseNumber + "\n" +
                "street = " + street + "\n" +
                "zip = " + zip + "\n" +
                "city = " + city + "\n" +
                "state = " + state + "\n" +
                "country =" + country;

    }

}