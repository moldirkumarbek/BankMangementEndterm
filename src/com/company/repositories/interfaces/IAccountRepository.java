package com.company.repositories.interfaces;

//import the path to the class

import com.company.entities.Account;

import java.util.List;

/**
 * IAccountRepository interface class that has createAccount, getAccount, getAllAccounts methods
 */
public interface IAccountRepository {
    //createAccount is used to create a new account in database
    boolean createAccount(Account account);
    //getAccount is used for getting selected account from database
    Account getAccount(int customer_id);
    //getAllAccounts is used to get all accounts from database
    List<Account> getAllAccounts();
}