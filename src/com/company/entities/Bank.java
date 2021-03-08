package com.company.entities;

public class Bank {
    private int bank_id;
    private String bank_name;
    private String bank_country;
    private String bank_city;
    private String bank_address;

    /**
     * Default constructor
     */
    public Bank() {

    }

    /**
     * Parameterized constructor
     * @param bank_name
     * @param bank_country
     * @param bank_city
     * @param bank_address
     */
    public Bank(String bank_name, String bank_country, String bank_city, String  bank_address) {
        setName(bank_name);
        setAddress(bank_address);
        setCity(bank_city);
        setBankCountry(bank_country);
    }

    /**
     * Overloaded constructor with 5 default parameter values
     * @param bank_id
     * @param bank_name
     * @param bank_country
     * @param bank_city
     * @param bank_address
     */
    public Bank(int bank_id, String bank_name, String bank_country,  String bank_city, String  bank_address) {
        setBank_id(bank_id);
        setName(bank_name);
        setAddress(bank_address);
        setCity(bank_city);
        setBankCountry(bank_country);
    }

    /**
     * Method, which returns bank id
     * @return integer value
     */
    public int getBank_id() {
        return bank_id;
    }

    /**
     * Method, which changes bank id
     * @param bank_id
     */
    public void setBank_id(int bank_id) {
        this.bank_id = bank_id;
    }

    /**
     * Method, which returns bank name
     * @return String value
     */
    public String getName() {
        return bank_name;
    }

    /**
     * Method, which changes bank name
     * @param bank_name
     */
    public void setName(String bank_name) {
        this.bank_name = bank_name;
    }

    /**
     * Method, which returns bank country
     * @return String value
     */
    public String getBankCountry() {
        return bank_country;
    }

    /**
     * Method, which changes bank country
     * @param bank_country
     */
    public void setBankCountry(String bank_country) {
        this.bank_country = bank_country;
    }

    /**
     * Method, which returns bank address
     * @return String value
     */
    public String getAddress() {
        return bank_address;
    }

    /**
     * Method, which changes bank address
     * @param bank_address
     */
    public void setAddress(String bank_address) {
        this.bank_address = bank_address;
    }

    /**
     * Method, which returns bank city
     * @return String value
     */
    public String getCity() {
        return bank_city;
    }

    /**
     * Method, which changes bank city
     * @param bank_city
     */
    public void setCity(String bank_city) {
        this.bank_city = bank_city;
    }

    /**
     * Overridden toString method
     * @return String value
     */
    @Override
    public String toString() {
        return "Bank {" +
                " bank_id= " + bank_id + '\'' +
                ", name= " + bank_name + '\'' +
                ", bank_country= " + bank_country + '\'' +
                ", address= " + bank_address + '\'' +
                ", city= " + bank_city + "}\n";
    }
}