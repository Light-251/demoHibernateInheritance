package com.example.demohibernateinheritance.controller;

import com.example.demohibernateinheritance.domain.*;
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
    public ResponseEntity<?> addAccount(@RequestBody AccountDiPersonaDTO accountDTO) throws Exception {



        try {
            accountService.addAccount(accountDTO);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value = "addPersone")
    public ResponseEntity aggiungiPersone () {

        Admin admin = new Admin();
        admin.setNome("Fra");
        admin.setCognome("congome");
        admin.setSesso("M");
        admin.setEmail("email@gmail.com");

        Operatore operatore = new Operatore();
        operatore.setNome("Mario");
        operatore.setCognome("Cognome");
        operatore.setSesso("M");
        operatore.setAnniDiServizio(12);

        Medico medico = new Medico();
        medico.setNome("Luigi");
        medico.setCognome("Cognome");
        medico.setSesso("M");
        medico.setAnniDiServizio(13);

        Coordinatore coordinatore = new Coordinatore();
        coordinatore.setNome("Paola");
        coordinatore.setCognome("Cognome");
        coordinatore.setSesso("F");
        coordinatore.setRuolo("Infermiere");

        Account account = new Account();
        account.setPersona(admin);

        Account account1 = new Account();
        account1.setPersona(operatore);

        Account account2 = new Account();
        account2.setPersona(medico);

        Account account3 = new Account();
        account3.setPersona(coordinatore);

//        accountService.addAccount(account);
//        accountService.addAccount(account1);
//        accountService.addAccount(account2);
//        accountService.addAccount(account3);

        return new ResponseEntity("OK", HttpStatus.OK);
    }
}