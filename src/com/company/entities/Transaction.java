package com.company.entities;

public class Transaction {
    private int customer_id;
    private int Account_id;
    private int Transaction_id;
    private String Transaction_date;
    private int Transaction_amount;
    private int Acquest_id;
    private String Transaction_type;

    /**
     * Parameterized constructor
     * @param Account_id
     * @param Transaction_id
     * @param Transaction_date
     * @param Transaction_amount
     * @param Acquest_id
     * @param Transaction_type
     */
    public Transaction(int Transaction_id, String Transaction_date, int Transaction_amount, int Account_id, int Acquest_id, String Transaction_type) {
        setAccount_id(Account_id);
        setTransaction_id(Transaction_id);
        setTransaction_date(Transaction_date);
        setTransaction_amount(Transaction_amount);
        setAcquest_id(Acquest_id);
        setTransaction_type(Transaction_type);
    }

    /**
     * Parameterized constructor with 7 default parameter values
     * @param customer_id
     * @param Account_id
     * @param Transaction_id
     * @param Transaction_date
     * @param Transaction_amount
     * @param Acquest_id
     * @param Transaction_type
     */
    public Transaction(int customer_id, int Transaction_id, String Transaction_date, int Transaction_amount, int Account_id, int Acquest_id, String Transaction_type) {
        setCustomer_id(customer_id);
        setAccount_id(Account_id);
        setTransaction_id(Transaction_id);
        setTransaction_date(Transaction_date);
        setTransaction_amount(Transaction_amount);
        setAcquest_id(Acquest_id);
        setTransaction_type(Transaction_type);
    }

    /**
     * Method, which returns customer's id
     * @return integer value
     */
    public int getCustomer_id() {
        return customer_id;
    }

    /**
     * Method, which changes customer's id
     * @param customer_id
     */
    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    /**
     * Method, which returns customer's account id
     * @return integer value
     */
    public int getAccount_id() {
        return Account_id;
    }

    /**
     * Method, which changes customer's account id
     * @param Account_id
     */
    public void setAccount_id(int Account_id) {
        this.Account_id = Account_id;
    }

    /**
     * Method, which returns acquest's transaction id
     * @return String value
     */
    public int getTransaction_id() {
        return Transaction_id;
    }

    /**
     * Method, which changes acquest's transaction id
     * @param Transaction_id
     */
    public void setTransaction_id(int Transaction_id) {
        this.Transaction_id = Transaction_id;
    }

    /**
     * Method, which returns acquest's transaction date
     * @return String value
     */
    public String getTransaction_date() {
        return Transaction_date;
    }

    /**
     * Method, which changes acquest's transaction date
     * @param Transaction_date
     */
    public void setTransaction_date(String Transaction_date) {
        this.Transaction_date = Transaction_date;
    }

    /**
     * Method, which returns transaction amount
     * @return boolean value
     */
    public int getTransaction_amount() {
        return Transaction_amount;
    }

    /**
     * Method, which changes transaction amount
     * @param Transaction_amount
     */
    public void setTransaction_amount(int Transaction_amount) {
        this.Transaction_amount = Transaction_amount;
    }

    /**
     * Method, which returns account's acquest id
     * @return integer value
     */
    public int getAcquest_id() {
        return Acquest_id;
    }

    /**
     * Method, which changes account's acquest id
     * @param Acquest_id
     */
    public void setAcquest_id(int Acquest_id) {
        this.Acquest_id = Acquest_id;
    }

    /**
     * Method, which returns transaction type
     * @return String value
     */
    public String getTransaction_type() {
        return Transaction_type;
    }

    /**
     * Method, which changes transaction type
     * @param Transaction_type
     */
    public void setTransaction_type(String Transaction_type) {
        this.Transaction_type = Transaction_type;
    }
    /**
     * Overridden toString method
     * @return String value
     */
    @Override
    public String toString() {
        return "Bank customers {" +
                "Account id=" + Account_id +'\'' +
                ", Transaction_id='" + Transaction_id + '\'' +
                ", Transaction_date='" + Transaction_date + '\'' +
                ", Transaction_amount=" + Transaction_amount + '\'' +
                ", Acquest_id=" + Acquest_id + '\'' +
                ", Transaction_type=" + Transaction_type + "} \n";
    }
}