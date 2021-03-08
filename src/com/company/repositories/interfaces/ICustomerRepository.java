package com.company.repositories.interfaces;

//import the path to the class
import com.company.entities.Customer;

import java.util.List;

/**
 * ICustomerRepository interface class that has createCustomer, getCustomer, getAllCustomers methods
 */
public interface ICustomerRepository {
    //createCustomer is used to create a new customer in database
    boolean createCustomer(Customer customer);
    //getCustomer is used for getting selected customer by branch_id from database
    Customer getCustomer(int branch_id);
    //getAllCustomers is used to get all customers from database
    List<Customer> getAllCustomers();
}