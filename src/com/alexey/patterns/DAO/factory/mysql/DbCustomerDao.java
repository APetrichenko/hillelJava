package com.alexey.patterns.DAO.factory.mysql;

import com.alexey.patterns.DAO.businessobject.Customer;
import com.alexey.patterns.DAO.factory.CustomerDao;

import java.util.Collection;

/**
 * Created by NewClass7 on 15.09.2015.
 */
public class DbCustomerDao implements CustomerDao {
    @Override
    public boolean insertCustomer(Customer customer) {
        return false;
    }

    @Override
    public boolean deleteCustomer(Customer customer) {
        return false;
    }

    @Override
    public Customer findCustomer(long id) {
        return null;
    }

    @Override
    public boolean updateCustomer(Customer customer) {
        return false;
    }

    @Override
    public Collection<Customer> getCustomers() {
        return null;
    }
}