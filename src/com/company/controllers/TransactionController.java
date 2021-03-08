package com.company.controllers;

//import the paths to the classes
import com.company.entities.Transaction;
import com.company.repositories.interfaces.ITransactionRepository;

import java.util.List;

public class TransactionController {
    private final ITransactionRepository repo;
    /**
     * Constructor with default parameter value
     */
    public TransactionController(ITransactionRepository repo) {
        this.repo = repo;
    }

    /**
     * Method with default parameter values
     * @return String value
     */
    public String createTransaction(int Transaction_id, String Transaction_date, int Transaction_amount, int Account_id,int Acquest_id, String Transaction_type) {
        Transaction transaction = new Transaction(Transaction_id, Transaction_date, Transaction_amount, Account_id, Acquest_id, Transaction_type);
        boolean created = repo.createTransaction(transaction);
        return (created ? "Low level employee creation was failed!" : "Low level employee was created!");
    }

    /**
     * Method, which returns low level value
     * @return String value
     */
    public String getTransaction(int Transaction_id) {
        Transaction transaction = repo.getTransaction(Transaction_id);
        return (transaction == null ? "Low level employee was not found!" : transaction.toString());
    }

    /**
     * Method, which returns all low level executives
     * @return String value
     */
    public String getAllTransactions() {
        List<Transaction> transaction = repo.getAllTransactions();
        return transaction.toString();
    }
}