package com.company.entities;

public class Branch {
    private int branch_id;
    private String branch_name;
    private String branch_city;
    private String branch_address;
    private int bank_id;

    /**
     * Default constructor
     */
    public Branch() {

    }

    /**
     * Parameterized constructor
     * @param branch_name
     * @param branch_city
     * @param branch_address
     * @param bank_id
     */
    public Branch(String branch_name, String branch_city, String branch_address, int bank_id) {
        setBranch_name(branch_name);
        setBranch_city(branch_city);
        setBranch_address(branch_address);
        setBank_Id(bank_id);
    }

    /**
     * Overloaded constructor with 5 default parameter values
     * @param branch_id
     * @param branch_name
     * @param branch_city
     * @param branch_address
     * @param bank_id
     */
    public Branch(int branch_id, String branch_name, String branch_city, String branch_address, int bank_id) {
        setBranch_id(branch_id);
        setBranch_name(branch_name);
        setBranch_city(branch_city);
        setBranch_address(branch_address);
        setBank_Id(bank_id);
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
     * Method, which returns branch name
     * @return integer value
     */
    public String getBranchName() {
        return branch_name;
    }

    /**
     * Method, which changes branch name
     * @param branch_name
     */
    public void setBranch_name(String branch_name) {
        this.branch_name = branch_name;
    }

    /**
     * Method, which returns branch city
     * @return String value
     */
    public String getBranch_city() {
        return branch_city;
    }

    /**
     * Method, which changes branch city
     * @param branch_city
     */
    public void setBranch_city(String branch_city) {
        this.branch_city = branch_city;
    }

    /**
     * Method, which returns branch address
     * @return String value
     */
    public String getBranch_address() {
        return branch_address;
    }

    /**
     * Method, which changes branch address
     * @param branch_address
     */
    public void setBranch_address(String branch_address) {
        this.branch_address = branch_address;
    }

    /**
     * Method, which returns bank id
     * @return String value
     */
    public int getBank_id() {
        return bank_id;
    }

    /**
     * Method, which changes bank id
     * @param bank_id
     */
    public void setBank_Id(int bank_id) {
        this.bank_id = bank_id;
    }

    /**
     * Overridden toString method
     * @return String value
     */
    @Override
    public String toString() {
        return "Branch{" +
                "branch_id= " + branch_id +
                ", branch_name= " + branch_name +
                ", branch_city= " + branch_city +
                ", branch_address= " + branch_address +
                ", bank_id=" + bank_id + "} \n";
    }
}