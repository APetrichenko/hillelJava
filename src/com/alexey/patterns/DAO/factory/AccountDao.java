package com.alexey.patterns.DAO.factory;

import com.alexey.patterns.DAO.businessobject.Account;

import java.util.Collection;

/**
 * Created by NewClass7 on 15.09.2015.
 */
public interface AccountDao {
    boolean insertAccount(Account account);
    boolean deleteAccount(Account account);
    Account findAccount(long id);
    boolean updateAccount(Account account);
    Collection<Account> getAccounts();
}