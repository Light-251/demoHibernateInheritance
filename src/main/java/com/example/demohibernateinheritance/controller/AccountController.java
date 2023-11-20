package com.example.demohibernateinheritance.controller;

import com.example.demohibernateinheritance.domain.Account;
import com.example.demohibernateinheritance.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    AccountService accountService;

    @PostMapping("/add")
    public ResponseEntity addAccount(Account account) {
        try {
            accountService.add(account);
            return new ResponseEntity("SUCCESS", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity("ERROR: " + e.getMessage(), HttpStatus.BAD_REQUEST);
        }


    }
}
