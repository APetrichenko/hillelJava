package com.alexey.patterns.DAO.factory.mysql;

import com.alexey.patterns.DAO.factory.AccountDao;
import com.alexey.patterns.DAO.factory.CustomerDao;
import com.alexey.patterns.DAO.factory.DaoFactory;

/**
 * Created by NewClass7 on 15.09.2015.
*/
public class DbDaoFactory extends DaoFactory {
    @Override
    public CustomerDao getCustomerDao() {
        return new DbCustomerDao();
    }

    @Override
    public AccountDao getAccountDao() {
        return new DbAccountDao();
    }
}
