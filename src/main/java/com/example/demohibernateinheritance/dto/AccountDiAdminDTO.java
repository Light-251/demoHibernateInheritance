package com.example.demohibernateinheritance.dto;

import com.example.demohibernateinheritance.domain.Admin;

public class AccountDiAdminDTO extends AccountDiPersonaDTO {

    private String email;

    public AccountDiAdminDTO() {
    }

    public AccountDiAdminDTO(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
