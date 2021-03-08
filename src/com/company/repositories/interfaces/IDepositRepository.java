package com.company.repositories.interfaces;

//import the path to the class
import com.company.entities.Deposit;

import java.util.List;

/**
 * IDepositRepository interface class that has createDeposit, getDeposit, getAllDeposits methods
 */
public interface IDepositRepository {
    //createDeposit is used to create a new deposit in database
    boolean createDeposit(Deposit depo);
    //getDeposit is used for getting selected deposit by account_id from database
    Deposit getDeposit(int account_id);
    //getAllDeposits is used to get all deposits from database
    List<Deposit> getAllDeposits();
}