package com.company.repositories;

import com.company.data.interfaces.IDB;
import com.company.entities.Branch;
import com.company.repositories.interfaces.IBranchRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * BranchRepository inherits from IBranchRepository interface
 */
public class BranchRepository implements IBranchRepository {
    private final IDB db;
    public BranchRepository(IDB db) {
        this.db = db;
    }

    /**
     * Overloaded method with default parameter values
     * @param branch
     * @return boolean value
     */
    @Override
    public boolean createBranch(Branch branch) {
        Connection con = null;
        try {
            con = db.getConnection();
            /**
             * insert into is used to insert a values into branch table
             */
            String sql = "INSERT INTO branch(branch_name, branch_city, branch_address, bank_id) VALUES (?,?,?,?)";
            PreparedStatement st = con.prepareStatement(sql);

            st.setInt(1, branch.getBranch_id());
            st.setString(2, branch.getBranchName());
            st.setString(3, branch.getBranch_city());
            st.setString(4, branch.getBranch_address());
            st.setInt(5, branch.getBank_id());

            boolean executed = st.execute();
            return executed;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return false;
    }

    /**
     * Overridden getBranch method with default parameter values
     * @return integer value
     */
    @Override
    public Branch getBranch(int branch_id) {
        Connection con = null;
        try {
            con = db.getConnection();
            /**
             * select values from the branches table by searching selected bank_id
             */
            String sql = "SELECT branch_id, branch_name, branch_city, branch_address, bank_id FROM branches WHERE bank_id=?";
            PreparedStatement st = con.prepareStatement(sql);

            st.setInt(1, branch_id);

            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                Branch branch = new Branch(rs.getInt("branch_id"),
                        rs.getString("branch_name"),
                        rs.getString("branch_city"),
                        rs.getString("branch_address"),
                        rs.getInt("bank_id"));

                return branch;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return null;
    }

    /**
     * Overridden getAllBranches method with default parameter values
     * @return integer value
     */
    @Override
    public List<Branch> getAllBranches() {
        Connection con = null;
        try {
            con = db.getConnection();
            /**
             * select all values from the branches table
             */
            String sql = "SELECT branch_id, branch_name, branch_city, branch_address, bank_id FROM branches";
            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(sql);
            List<Branch> branches = new ArrayList<>();
            while (rs.next()) {
                Branch branch = new Branch(rs.getInt("branch_id"),
                        rs.getString("branch_name"),
                        rs.getString("branch_city"),
                        rs.getString("branch_address"),
                        rs.getInt("bank_id"));

                branches.add(branch);
            }

            return branches;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return null;
    }
}