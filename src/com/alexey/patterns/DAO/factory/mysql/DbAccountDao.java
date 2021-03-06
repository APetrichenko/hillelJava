package com.alexey.patterns.DAO.factory.mysql;

import com.alexey.patterns.DAO.businessobject.Account;
import com.alexey.patterns.DAO.factory.AccountDao;

import java.math.BigDecimal;
import java.sql.*;
import java.util.Collection;

/**
 * Created by NewClass7 on 15.09.2015.
 */
public class DbAccountDao implements AccountDao {
    private static final String USERNAME = "anaconda";
    private static final String PASSWORD = "anaconda";

    @Override
    public boolean insertAccount(Account account) {
        Connection con = null;
        try {
            con = DriverManager.getConnection(
                    "jdbc:postgresql://localhost/test",
                    USERNAME,
                    PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        PreparedStatement statement = null;
        try {
            statement = con.prepareStatement(
                    "INSERT INTO test.account" +
                            "(account_id, balance) VALUES" +
                            "(? , ?)");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            statement.setLong(1, account.getId());
            statement.setBigDecimal(2, account.getBalance());
            statement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            if (statement != null) statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            if (con != null) con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return true;
    }

    @Override
    public boolean deleteAccount(Account account) {
        Connection con = null;
        try {
            con = DriverManager.getConnection(
                    "jdbc:postgresql://localhost/test",
                    USERNAME,
                    PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        PreparedStatement statement = null;
        try {
            statement = con.prepareStatement(
                    "DELETE FROM test.account" +
                            " WHERE account_id = ?");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            statement.setLong(1, account.getId());
            statement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            if (statement != null) statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            if (con != null) con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return true;
    }

    @Override
    public Account findAccount(long id) {
        String sqlQuery = "SELECT balance FROM test.account" +
                " WHERE account_id = ?";
        try (Connection con = DriverManager.getConnection(
                "jdbc:postgresql://localhost/test",
                USERNAME,
                PASSWORD); PreparedStatement statement = con.prepareStatement(sqlQuery)) {
            statement.setLong(1, id);
            try(ResultSet resultSet = statement.executeQuery()){
                resultSet.next();
                Account account = new Account(id);
                BigDecimal balance = resultSet.getBigDecimal(1);
                account.setBalance(balance);
                return account;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean updateAccount(Account account) {
        String sqlQuery = "UPDATE test.account" +
                " SET balance = ?" +
                " WHERE account_id = ?";
        try (Connection con = DriverManager.getConnection(
                "jdbc:postgresql://localhost/test",
                USERNAME,
                PASSWORD); PreparedStatement statement = con.prepareStatement(sqlQuery)) {
            statement.setBigDecimal(1, account.getBalance());
            statement.setLong(2, account.getId());
            statement.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return true;
    }

    @Override
    public Collection<Account> getAccounts() {
        throw new UnsupportedOperationException("Please implement");
    }
}
