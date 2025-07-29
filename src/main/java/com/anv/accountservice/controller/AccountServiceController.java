package com.anv.accountservice.controller;


import com.anv.accountservice.entity.Account;
import com.anv.accountservice.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.nio.channels.AcceptPendingException;

@RestController
@RequestMapping("/api/account")
public class AccountServiceController {

    @Autowired
    AccountService accountService;

    @PostMapping("/save")
    public Account createAccount (@RequestBody Account account){

        return accountService.createAccount(account);
    }

    @GetMapping("/{id}")
    public Account getAccount (@PathVariable Long id){

        return accountService.getAccount(id);
    }

    @GetMapping("/{id}/balance")
    public BigDecimal getAccountBalance(@PathVariable Long id){
        return accountService.getAccountBalance(id);
    }

}
