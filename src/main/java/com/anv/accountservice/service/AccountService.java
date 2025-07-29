package com.anv.accountservice.service;

import com.anv.accountservice.entity.Account;
import com.anv.accountservice.repository.AccountServiceRepostiory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class AccountService {

    @Autowired
    AccountServiceRepostiory accountServiceRepostiory;

    public Account createAccount(Account account) {
        return accountServiceRepostiory.save(account);
    }

    public Account getAccount(Long id) {
        return accountServiceRepostiory.getById(id);
    }

    public BigDecimal getAccountBalance(Long id) {
        Account account =  accountServiceRepostiory.getReferenceById(id);
       return account.getBalance();
    }
}
