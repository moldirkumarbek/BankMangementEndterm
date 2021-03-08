package com.company.repositories;
//paths to the packages
import com.company.data.interfaces.IDB;
import com.company.entities.Acquest;
import com.company.repositories.interfaces.IAcquestRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * AcquestRepository inherits from IAcquestRepository interface
 */
public class AcquestRepository implements IAcquestRepository {
    private final IDB db;
    public AcquestRepository(IDB db) {
        this.db = db;
    }

    /**
     * Overloaded method with default parameter values
     * @param acquest
     * @return boolean value
     */
    @Override
    public boolean createAcquest(Acquest acquest) {
        Connection con = null;
        try {
            con = db.getConnection();
            /**
             * insert into is used to insert a new values into customer_acquests table
             */
            String sql = "INSERT INTO customer_acquests(Acquest_id,Acquest_date,Acquest_number,customer_id) VALUES (?,?,?,?)";
            PreparedStatement st = con.prepareStatement(sql);

            st.setString(1, acquest.getAcquest_date());
            st.setInt(2, acquest.getAcquest_number());
            st.setInt(3, acquest.getCustomerId());

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
     * Overridden getAcquest method with default parameter values
     * @return integer value
     */
    @Override
    public Acquest getAcquest(int customer_id) {
        Connection con = null;
        try {
            con = db.getConnection();
            /**
             * select values from the customer_acquests table by searching selected customer_id
             */
            String sql = "SELECT Acquest_id,Acquest_date,Acquest_number,customer_id FROM customer_acquests WHERE customer_id=?";
            PreparedStatement st = con.prepareStatement(sql);

            st.setInt(1, customer_id);

            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                Acquest acquest = new Acquest(rs.getInt("Acquest_id"),
                        rs.getString("Acquest_date"),
                        rs.getInt("Acquest_number"),
                        rs.getInt("customer_id"));

                return acquest;
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
     * Overridden getAllAcquests method with default parameter values
     * @return integer value
     */
    @Override
    public List<Acquest> getAllAcquests() {
        Connection con = null;
        try {
            con = db.getConnection();
            /**
             * select all values from the customer_acquests table
             */
            String sql = "SELECT Acquest_id,Acquest_date,Acquest_number,customer_id FROM customer_acquests";
            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(sql);
            List<Acquest> acquests = new ArrayList<>();
            while (rs.next()) {
                Acquest acquest = new Acquest(rs.getInt("Acquest_id"),
                        rs.getString("Acquest_date"),
                        rs.getInt("Acquest_number"),
                        rs.getInt("customer_id"));

                acquests.add(acquest);
            }

            return acquests;
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