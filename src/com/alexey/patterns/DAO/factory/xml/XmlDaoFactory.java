package com.alexey.patterns.DAO.factory.xml;

import com.alexey.patterns.DAO.factory.AccountDao;
import com.alexey.patterns.DAO.factory.CustomerDao;
import com.alexey.patterns.DAO.factory.DaoFactory;

/**
 * Created by NewClass7 on 15.09.2015.
 */
public class XmlDaoFactory extends DaoFactory {
    @Override
    public CustomerDao getCustomerDao() {
        return new XmlCustomerDao();
    }

    @Override
    public AccountDao getAccountDao() {
        return new XmlAccountDao();
    }
}
