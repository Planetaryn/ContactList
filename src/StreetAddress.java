

import java.io.Serializable;  // Shmuel Added serialization to facilitate storage on disk 


/**
 * Defines a reusable class StreetAddress. One object of class StreetAddress
 * contains a house number, street, zip, city, state, & country.
 *
 * @author irmarodarte
 */
public class StreetAddress implements Serializable{ // Shmuel Added serialization to facilitate storage on disk 
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
        houseNumber = newHouseNumber;
    }

    /**
     * Sets the value of street to the value of the parameter newStreet
     * @param newStreet
     */
    public void setStreet(String newStreet) {
        street = newStreet;
    }

    /**
     * Sets the value of zip to the value of the parameter newZip
     * @param newZip
     */
    public void setZip(String newZip) {
        zip = newZip;
    }

    /**
     * Sets the value of city to the value of the parameter newCity
     * @param newCity
     */
    public void setCity(String newCity) {
        city = newCity;
    }

    /**
     * Sets the value of state to the value of the parameter newState
     * @param newState
     */
    public void setState(String newState) {
        state = newState;
    }

    /**
     * Sets the value of country to the value of the parameter newCountry
     * @param newCountry
     */
    public void setCountry(String newCountry) {
        country = newCountry;
    }

    /**
     * Returns the value of houseNumber
     * @return
     */
    public String getHouseNumber() {
        return houseNumber;
    }

    /**
     * Returns the value of street
     * @return
     */
    public String getStreet() {
        return street;
    }

    /**
     * Returns the value of zip
     * @return
     */
    public String getZip() {
        return zip;
    }

    /**
     * Returns the value of city
     *
     * @return
     */
    public String getCity() {
        return city;
    }

    /**
     * Returns the value of state
     *
     * @return
     */
    public String getState() {
        return state;
    }

    /**
     * Returns the value of country
     *
     * @return
     */
    public String getCountry() {
        return country;
    }

    /**
     * Returns a string containing the values of house number, street, city,
     * zip, state, & country
     */
    public String toString() {
    	String address = "Address:"+"\n";
    	address += (this.getHouseNumber() +" " +this.getStreet() +"\n");
    	address += (this.getCity() +" " +this.getState() +", " +this.getZip() +"\n");
    	address += (this.getCountry() +"\n");
        return address;

    }

}