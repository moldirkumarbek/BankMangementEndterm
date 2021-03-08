package com.company.repositories.interfaces;

//import the path to the class

import com.company.entities.Branch;

import java.util.List;

/**
 * IBranchRepository interface class that has createBranch, getBranch, getAllBranches methods
 */
public interface IBranchRepository {
    //createBranch is used to create a new branch in database
    boolean createBranch(Branch branch);
    //getBranch is used for getting selected branch by bank_id from database
    Branch getBranch(int bank_id);
    //getAllBranches is used to get all branches from database
    List<Branch> getAllBranches();
}