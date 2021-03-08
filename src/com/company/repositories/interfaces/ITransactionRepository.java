package com.company.repositories.interfaces;

//import the path to the class

import com.company.entities.Transaction;

import java.util.List;

/**
 * ITransactionRepository interface class that has createTransaction, getTransaction, getAllTransactions methods
 */
public interface ITransactionRepository {
    //createTransaction is used to create a new transaction in database
    boolean createTransaction(Transaction Transaction);
    //getTransaction is used for getting selected transaction by acquest_id from database
    Transaction getTransaction(int acquest_id);
    //getAllTransactions is used to get all transactions from database
    List<Transaction> getAllTransactions();
}