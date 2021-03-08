package com.company.entities;

public class Acquest {
    private int Acquest_id;
    private String Acquest_date;
    private int Acquest_number;
    private int customer_id;

    /**
     * Default constructor
     */
    public Acquest() {

    }

    /**
     * Parameterized constructor
     * @param Acquest_date
     * @param Acquest_number
     * @param customer_id
     */
    public Acquest(String Acquest_date, int Acquest_number, int customer_id) {
        setAcquest_date(Acquest_date);
        setAcquest_number(Acquest_number);
        setCustomerId(customer_id);
    }

    /**
     * Overloaded constructor with 4 default parameter values
     * @param Acquest_id
     * @param Acquest_date
     * @param Acquest_number
     * @param customer_id
     */
    public Acquest(int Acquest_id, String Acquest_date, int Acquest_number, int customer_id) {
        setAcquest_id(Acquest_id);
        setAcquest_date(Acquest_date);
        setAcquest_number(Acquest_number);
        setCustomerId(customer_id);
    }

    /**
     * Method, which returns Acquest id
     * @return integer value
     */
    public int getAcquest_id() {
        return Acquest_id;
    }

    /**
     * Method, which changes Acquest id
     * @param Acquest_id
     */
    public void setAcquest_id(int Acquest_id) {
        this.Acquest_id = Acquest_id;
    }

    /**
     * Method, which returns date of acquest
     * @return integer value
     */
    public String getAcquest_date() {
        return Acquest_date;
    }

    /**
     * Method, which changes date of acquest
     * @param Acquest_date
     */
    public void setAcquest_date(String Acquest_date) {
        this.Acquest_date = Acquest_date;
    }

    /**
     * Method, which returns identical number of acquest
     * @return String value
     */
    public int getAcquest_number() {
        return Acquest_number;
    }

    /**
     * Method, which changes identical number of acquest
     * @param Acquest_number
     */
    public void setAcquest_number(int Acquest_number) {
        this.Acquest_number = Acquest_number;
    }

    /**
     * Method, which returns customer id
     * @return String value
     */
    public int getCustomerId() {
        return customer_id;
    }

    /**
     * Method, which changes customer id
     * @param customer_id
     */
    public void setCustomerId(int customer_id) {
        this.customer_id = customer_id;
    }

    /**
     * Overridden toString method
     * @return String value
     */
    @Override
    public String toString() {
        return "Acquest {" +
                "Acquest id=" + Acquest_id +
                ", Acquest_date= " + Acquest_date +
                ", Acquest_number= " + Acquest_number +
                ", customer_id= " + customer_id + "} \n";
    }
}