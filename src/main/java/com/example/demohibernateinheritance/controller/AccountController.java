package com.example.demohibernateinheritance.controller;

import com.example.demohibernateinheritance.domain.Account;
import com.example.demohibernateinheritance.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/v1/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping(value = "/getAllAccounts", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<?> getAllAccounts() throws Exception {
        try {
            accountService.getAllAccounts();
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value = "/addAccount", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<?> addAccount(@RequestBody Account account) throws Exception {
        try {
            accountService.addAccount(account);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}