package com.example.demohibernateinheritance.dto;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

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
