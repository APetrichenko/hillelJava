package com.alexey.patterns.DAO.factory;

import com.alexey.patterns.DAO.factory.mysql.DbDaoFactory;
import com.alexey.patterns.DAO.factory.xml.XmlDaoFactory;

/**
 * Created by NewClass7 on 15.09.2015.
 */
public abstract class DaoFactory {
    public enum DataSourceType{
        XML,
        RDB
    }
    public abstract CustomerDao getCustomerDao();
    public abstract AccountDao getAccountDao();

    public static DaoFactory getDaoFactory(DataSourceType dataSourceType){
        switch (dataSourceType){
            case XML:
                return new XmlDaoFactory();
            case RDB:
                return new DbDaoFactory();
            default:
                throw new RuntimeException("Please specify correct exception and data source");
        }
    }
}
