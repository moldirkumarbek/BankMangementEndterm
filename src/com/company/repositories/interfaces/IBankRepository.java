package com.company.repositories.interfaces;

//import the path to the class
import com.company.entities.Bank;

import java.util.List;

/**
 * IBankRepository interface class that has createBank, getBank, getAllBanks methods
 */
public interface IBankRepository {
    //createBank is used to create a new bank in database
    boolean createBank(Bank bank);
    //getBank is used for getting selected bank by bank_id from database
    Bank getBank(int bank_id);
    //getAllBanks is used to get all banks from database
    List<Bank> getAllBanks();
}