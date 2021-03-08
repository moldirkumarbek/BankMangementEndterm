package com.company.repositories;

import com.company.data.interfaces.IDB;
import com.company.entities.Deposit;
import com.company.repositories.interfaces.IDepositRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * DepositRepository inherits from IDepositRepository interface
 */
public class DepositRepository implements IDepositRepository {
    private final IDB db;
    public DepositRepository(IDB db) {
        this.db = db;
    }

    /**
     * Overloaded method with default parameter values
     * @param deposit
     * @return boolean value
     */
    @Override
    public boolean createDeposit(Deposit deposit) {
        Connection con = null;
        try {
            con = db.getConnection();
            /**
             * insert into is used to insert a values into deposit table
             */
            String sql = "INSERT INTO deposit(account_id,depo_amount) VALUES (?,?)";
            PreparedStatement st = con.prepareStatement(sql);

            st.setInt(1, deposit.getAccId());
            st.setInt(2, deposit.getDepositAmount());

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
     * Overridden getDeposit method with default parameter values
     * @return integer value
     */
    @Override
    public Deposit getDeposit(int depo_id) {
        Connection con = null;
        try {
            con = db.getConnection();
            /**
             * select values from the deposit table by searching selected account_id
             */
            String sql = "SELECT depo_id,account_id,depo_amount FROM deposit WHERE account_id=?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, depo_id);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                Deposit deposit = new Deposit(rs.getInt("depo_id"),
                        rs.getInt("account_id"),
                        rs.getInt("depo_amount"));

                return deposit;
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
     * Overridden getAllDeposits method with default parameter values
     * @return integer value
     */
    @Override
    public List<Deposit> getAllDeposits() {
        Connection con = null;
        try {
            con = db.getConnection();
            /**
             * select all values from the deposit table
             */
            String sql = "SELECT depo_id,account_id,depo_amount FROM deposit";
            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(sql);
            List<Deposit> deposits = new ArrayList<>();
            while (rs.next()) {
                Deposit deposit = new Deposit(rs.getInt("depo_id"),
                        rs.getInt("account_id"),
                        rs.getInt("depo_amount"));

                deposits.add(deposit);
            }

            return deposits;
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