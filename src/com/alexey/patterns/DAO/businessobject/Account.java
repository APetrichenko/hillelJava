package com.alexey.patterns.DAO.businessobject;

import java.math.BigDecimal;

/**
 * Created by NewClass7 on 15.09.2015.
 */
public class Account {
    private final long id;
    private BigDecimal balance;

    public Account(long id) {
        this.id = id;
        this.balance = BigDecimal.ZERO;
    }

    public Account(long id, BigDecimal balance) {
        this.id = id;
        this.balance = balance;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public long getId() {
        return id;
    }
}
