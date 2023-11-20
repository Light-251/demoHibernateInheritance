package com.example.demohibernateinheritance.controller;

import com.example.demohibernateinheritance.domain.Account;
import com.example.demohibernateinheritance.domain.Coordinatore;
import com.example.demohibernateinheritance.domain.Persona;
import com.example.demohibernateinheritance.dto.AccountDiPersonaDTO;
import com.example.demohibernateinheritance.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping(value = "getAllAccounts", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<?> getAllAccounts() throws Exception {
        try {
            List<AccountDiPersonaDTO> accounts = accountService.getAllAccounts();
            return new ResponseEntity<>(accounts, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value = "addAccount", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<?> addAccount(@RequestBody Coordinatore account) throws Exception {
        try {
            accountService.addAccount(account);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}