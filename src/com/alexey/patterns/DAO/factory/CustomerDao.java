package com.alexey.patterns.DAO.factory;

import com.alexey.patterns.DAO.businessobject.Customer;

import java.util.Collection;

/**
 * Created by NewClass7 on 15.09.2015.
 */
public interface CustomerDao {
    boolean insertCustomer(Customer customer);
    boolean deleteCustomer(Customer customer);
    Customer findCustomer(long id);
    boolean updateCustomer(Customer customer);
    Collection<Customer> getCustomers();
}
