package com.company.entities;

public class Customer {
    private int customer_id;
    private int branch_id;
    private String customer_name;
    private String surname;
    private String gender;
    private String telephone;
    private String address;

    /**
     * Parameterized constructor
     * @param branch_id
     * @param customer_name
     * @param surname
     * @param gender
     * @param telephone
     * @param address
     */
    public Customer(int branch_id, String customer_name, String surname, String gender, String telephone, String address) {
        setBranch_id(branch_id);
        setName(customer_name);
        setSurname(surname);
        setGender(gender);
        setTelephone(telephone);
        setAddress(address);
    }

    /**
     * Parameterized constructor
     * @param customer_id
     * @param branch_id
     * @param customer_name
     * @param surname
     * @param gender
     * @param telephone
     * @param address
     */
    public Customer(int customer_id, int branch_id, String customer_name, String surname, String gender, String telephone, String address) {
        setCustomer_id(customer_id);
        setBranch_id(branch_id);
        setName(customer_name);
        setSurname(surname);
        setGender(gender);
        setTelephone(telephone);
        setAddress(address);
    }

    /**
     * Method, which returns customer id
     * @return integer value
     */
    public int getCustomer_id() {
        return customer_id;
    }

    /**
     * Method, which changes customer id
     * @param customer_id
     */
    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    /**
     * Method, which returns branch id
     * @return integer value
     */
    public int getBranch_id() {
        return branch_id;
    }

    /**
     * Method, which changes branch id
     * @param branch_id
     */
    public void setBranch_id(int branch_id) {
        this.branch_id = branch_id;
    }

    /**
     * Method, which returns customer's name
     * @return String value
     */
    public String getName() {
        return customer_name;
    }

    /**
     * Method, which changes customer's name
     * @param customer_name
     */
    public void setName(String customer_name) {
        this.customer_name = customer_name;
    }

    /**
     * Method, which returns customer's surname
     * @return String value
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Method, which changes customer's surname
     * @param surname
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * Method, which returns customer's gender
     * @return boolean value
     */
    public String getGender() {
        return gender;
    }

    /**
     * Method, which changes customer's gender
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * Method, which returns customer's telephone number
     * @return integer value
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * Method, which changes customer's telephone number
     * @param telephone
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /**
     * Method, which returns customer's address
     * @return String value
     */
    public String getAddress() {
        return address;
    }

    /**
     * Method, which changes customer's address
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }
    /**
     * Overridden toString method
     * @return String value
     */
    @Override
    public String toString() {
        return "Bank customer{" +
                " customer_id=" + customer_id +
                ", branch_id=" + branch_id +
                ", name='" + customer_name + '\'' +
                ", surname='" + surname + '\'' +
                ", gender=" + gender + '\'' +
                ", telephone=" + telephone +
                ", address=" + address + "}\n";
    }
}