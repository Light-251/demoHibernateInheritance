package com.example.demohibernateinheritance.service;

import com.example.demohibernateinheritance.domain.Account;
import com.example.demohibernateinheritance.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    @Autowired
    AccountRepository accountRepository;

    public void add(Account account) throws Exception {
        try {
            accountRepository.save(account);
        } catch (Exception e) {
            throw new Exception("Errore salvataggio account");
        }
    }
}
