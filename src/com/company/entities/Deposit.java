package com.company.entities;

public class Deposit {
    private int depo_id;
    private int account_id;
    private int depo_amount;

    /**
     * Default constructor
     */
    public Deposit() {
    }

    /**
     * Parameterized constructor
     * @param account_id
     * @param depo_amount
     */
    public Deposit(int account_id, int depo_amount) {
        setAccId(account_id);
        setDepoAmount(depo_amount);
    }

    /**
     * Overloaded constructor with 3 default parameter values
     * @param account_id
     * @param depo_amount
     * @param depo_id
     */
    public Deposit(int depo_id, int account_id, int depo_amount) {
        setDepositId(depo_id);
        setAccId(account_id);
        setDepoAmount(depo_amount);
    }

    /**
     * Method, which returns customer's deposit id
     * @return integer value
     */
    public int getDepositId() {
        return depo_id;
    }

    /**
     * Method, which changes customer's deposit id
     * @param depo_id
     */
    public void setDepositId(int depo_id) {
        this.depo_id = depo_id;
    }

    /**
     * Method, which returns customer's account id
     * @return String value
     */
    public int getAccId() {
        return account_id;
    }

    /**
     * Method, which changes customer's account id
     * @param account_id
     */
    public void setAccId(int account_id) {
        this.account_id = account_id;
    }

    /**
     * Method, which returns customer's deposit amount
     * @return String value
     */
    public int getDepositAmount() {
        return depo_amount;
    }

    /**
     * Method, which changes customer's deposit amount
     * @param depo_amount
     */
    public void setDepoAmount(int depo_amount) {
        this.depo_amount = depo_amount;
    }

    /**
     * Overridden toString method
     * @return String value
     */
    @Override
    public String toString() {
        return "Account deposit {" +
                " deposit_id=" + depo_id +
                ", account_id='" + account_id + '\'' +
                ", deposit amount=" + depo_amount + "}\n";
    }
}