package com.company.repositories;

import com.company.data.interfaces.IDB;
import com.company.entities.Transaction;
import com.company.repositories.interfaces.ITransactionRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * TransactionRepository inherits from ITransactionRepository interface
 */
public class TransactionRepository implements ITransactionRepository {
    private final IDB db;
    /**
     * Overloaded constructor with default parameter values
     */
    public TransactionRepository(IDB db) {
        this.db = db;
    }

    /**
     * Overridden createLow method with default parameter values
     * @return boolean value
     */
    @Override
    public boolean createTransaction(Transaction transaction) {
        Connection con = null;
        try {
            con = db.getConnection();
            /**
             * insert into is used to insert a values into Transactions table
             */
            String sql = "INSERT INTO Transactions(Transaction_date, Transaction_amount, Account_id, Acquest_id, Transaction_type) VALUES (?,?,?,?,?)";
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, transaction.getTransaction_id());
            st.setString(2, transaction.getTransaction_date());
            st.setInt(3, transaction.getTransaction_amount());
            st.setInt(4, transaction.getAccount_id());
            st.setInt(5, transaction.getAcquest_id());
            st.setString(6, transaction.getTransaction_type());
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
     * Overridden getTransaction method with default parameter values
     * @return integer value
     */
    @Override
    public Transaction getTransaction(int acquest_id) {
        Connection con = null;
        try {
            con = db.getConnection();
            /**
             * select values from Transactions table by searching selected Acquest_id
             */
            String sql = "SELECT Transaction_id, Transaction_date, Transaction_amount, Account_id, Acquest_id, Transaction_type FROM Transactions WHERE Acquest_id=?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, acquest_id);

            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                Transaction transaction = new Transaction(rs.getInt("Transaction_id"),
                        rs.getString("Transaction_date"),
                        rs.getInt("Transaction_amount"),
                        rs.getInt("Account_id"),
                        rs.getInt("Acquest_id"),
                        rs.getString("Transaction_type"));

                return transaction;
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
     * Overridden getAllTransactions method with default parameter values
     * @return integer value
     */
    @Override
    public List<Transaction> getAllTransactions() {
        Connection con = null;
        try {
            con = db.getConnection();
            /**
             * select all values from the Transactions table
             */
            String sql = "SELECT Transaction_id, Transaction_date, Transaction_amount, Account_id, Acquest_id, Transaction_type FROM Transactions";
            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(sql);
            List<Transaction> transactions = new ArrayList<>();
            while (rs.next()) {
                Transaction transaction = new Transaction(rs.getInt("Transaction_id"),
                        rs.getString("Transaction_date"),
                        rs.getInt("Transaction_amount"),
                        rs.getInt("Account_id"),
                        rs.getInt("Acquest_id"),
                        rs.getString("Transaction_type"));

                transactions.add(transaction);
            }

            return transactions;
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