package com.company.repositories;
//paths to the packages
import com.company.data.interfaces.IDB;
import com.company.entities.Bank;
import com.company.repositories.interfaces.IBankRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * BankRepository inherits from IBankRepository interface
 */
public class BankRepository implements IBankRepository {
    private final IDB db;
    public BankRepository(IDB db) {
        this.db = db;
    }

    /**
     * Overloaded method with default parameter values
     * @param bank
     * @return boolean value
     */
    @Override
    public boolean createBank(Bank bank) {
        Connection con = null;
        try {
            con = db.getConnection();
            /**
             * insert into is used to insert a new values into bank table
             */
            String sql = "INSERT INTO bank(bank_name,bank_country,bank_city,bank_address) VALUES (?,?,?,?)";
            PreparedStatement st = con.prepareStatement(sql);

            st.setString(1, bank.getName());
            st.setString(2, bank.getAddress());
            st.setString(3, bank.getCity());


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
     * Overridden getBank method with default parameter values
     * @return integer value
     */
    @Override
    public Bank getBank(int bank_id) {
        Connection con = null;
        try {
            con = db.getConnection();
            /**
             * select values from the bank table by searching selected bank_id
             */
            String sql = "SELECT bank_id,bank_name,bank_country,bank_city,bank_address FROM bank WHERE bank_id=?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, bank_id);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                Bank bank = new Bank(rs.getInt("bank_id"),
                        rs.getString("bank_name"),
                        rs.getString("bank_country"),
                        rs.getString("bank_city"),
                        rs.getString("bank_address"));

                return bank;
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
     * Overridden getAllBanks method with default parameter values
     * @return integer value
     */
    @Override
    public List<Bank> getAllBanks() {
        Connection con = null;
        try {
            con = db.getConnection();
            /**
             * select all values from the bank table
             */
            String sql = "SELECT bank_id,bank_name,bank_country,bank_city,bank_address FROM bank";
            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(sql);
            List<Bank> bank = new ArrayList<>();
            while (rs.next()) {
                Bank banks = new Bank(rs.getInt("bank_id"),
                        rs.getString("bank_name"),
                        rs.getString("bank_country"),
                        rs.getString("bank_city"),
                        rs.getString("bank_address"));

                bank.add(banks);
            }

            return bank;
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