package com.company;//import the paths to the classes

import com.company.data.PostgresDB;
import com.company.data.interfaces.IDB;
import com.company.repositories.*;
import com.company.repositories.interfaces.*;

public class Main {
    public static void main(String[] args) {
        // specify which DB and Repository to use
        // changing DB should not affect to whole code
        IDB db = new PostgresDB();

        IBankRepository repo = new BankRepository(db);
        IAccountRepository repo2 = new AccountRepository(db);
        ICustomerRepository repo1 = new CustomerRepository(db);
        IDepositRepository repo3 = new DepositRepository(db);
        IBranchRepository repo4 = new BranchRepository(db);
        IAcquestRepository repo5 = new AcquestRepository(db);
        ITransactionRepository repo6 = new TransactionRepository(db);

        MyApplication app = new MyApplication(repo, repo1, repo2, repo3, repo4, repo5, repo6);
        app.start();
    }
}