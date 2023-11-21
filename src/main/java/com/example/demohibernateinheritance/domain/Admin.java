package com.example.demohibernateinheritance.domain;

import com.example.demohibernateinheritance.dto.AccountDiAdminDTO;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@DiscriminatorValue("Admin")
@Table(name = "tab_admin")
public class Admin extends Persona {

    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public AccountDiAdminDTO toDto(Admin admin) {

        AccountDiAdminDTO accountDiAdminDTO = new AccountDiAdminDTO();
        accountDiAdminDTO.setEmail(admin.getEmail());
        accountDiAdminDTO.setNome(admin.getNome());
        accountDiAdminDTO.setCognome(admin.getCognome());
        accountDiAdminDTO.setSesso(admin.getSesso());

        return accountDiAdminDTO;
    }

    @Override
    public AccountDiAdminDTO getDTOofPersona() {

        AccountDiAdminDTO accountDiAdminDTO = new AccountDiAdminDTO();

//        accountDiAdminDTO.setTypeName("Admin");
        accountDiAdminDTO.setIdPersona(this.getId());
        accountDiAdminDTO.setNome(this.getNome());
        accountDiAdminDTO.setCognome(this.getCognome());
        accountDiAdminDTO.setSesso(this.getSesso());
        accountDiAdminDTO.setEmail(this.getEmail());

        return accountDiAdminDTO;
    }
}
