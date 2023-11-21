package com.example.demohibernateinheritance.dto;

import com.example.demohibernateinheritance.domain.Admin;
import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("Admin")
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

    public Admin toObject() {
        Admin admin = new Admin();

        admin.setNome(this.getNome());
        admin.setCognome(this.getCognome());
        admin.setSesso(this.getSesso());
        admin.setEmail(this.email);

        return admin;
    }

}
