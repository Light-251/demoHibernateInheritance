package com.example.demohibernateinheritance.service;

import com.example.demohibernateinheritance.domain.Account;
import com.example.demohibernateinheritance.dto.AccountDiPersonaDTO;
import com.example.demohibernateinheritance.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public List<AccountDiPersonaDTO> getAllAccounts() {

        List<Account> accounts = accountRepository.findAll();

       List<AccountDiPersonaDTO> accountDiPersonaDTOS = accounts.stream().map(Account::toDTO).collect(Collectors.toList());

        return accountDiPersonaDTOS;
    }

    public Boolean addAccount(AccountDiPersonaDTO accountDTO) {

        try {

            Account account = new Account();
            account.setPersona(accountDTO.toObject());

            accountRepository.save(account);

            return true;
        } catch (Exception e) {
            return false;
        }
    }
}