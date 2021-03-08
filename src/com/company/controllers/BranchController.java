package com.company.controllers;

//import the paths to the classes
import com.company.entities.Branch;
import com.company.repositories.interfaces.IBranchRepository;

import java.util.List;

public class BranchController {
    private final IBranchRepository repo;

    /**
     * Parameterized constructor
     */
    public BranchController(IBranchRepository repo) {
        this.repo = repo;
    }

    /**
     * Overloaded method with default parameter values
     * @return String value
     */
    public String createBranch(String branch_name, String branch_city, String branch_address, int bank_id) {
        Branch branch = new Branch(branch_name, branch_city, branch_address, bank_id);
        boolean created = repo.createBranch(branch);
        return (created ? "Branch creation was failed!" : "Branch was created!");
    }

    /**
     * Overloaded method with default parameter values
     * @return String value
     */
    public String getBranch(int branch_id) {
        Branch branch = repo.getBranch(branch_id);
        return (branch == null ? "Branch was not found!" : branch.toString());
    }

    /**
     * Method, which returns all middle level executivesMethod, which returns all middle level executives
     * @return String value
     */
    public String getAllBranchеs() {
        List<Branch> branch = repo.getAllBranches();
        return branch.toString();
    }
}