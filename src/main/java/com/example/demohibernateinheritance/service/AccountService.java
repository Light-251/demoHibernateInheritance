package com.example.demohibernateinheritance.service;

import com.example.demohibernateinheritance.domain.Account;
import com.example.demohibernateinheritance.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public List<Account> getAllAccounts() throws Exception {
        try {
            return accountRepository.findAll();
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    public Boolean addAccount(Account account) {
        try {
            accountRepository.save(account);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}