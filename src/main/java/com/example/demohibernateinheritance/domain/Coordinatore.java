package com.example.demohibernateinheritance.domain;

import com.example.demohibernateinheritance.dto.AccountDiCoordinatoreDTO;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@DiscriminatorValue("Coordinatore")
@Table(name = "tab_coordinatori")
public class Coordinatore extends Persona {

    private String ruolo;

    public String getRuolo() {
        return ruolo;
    }

    public void setRuolo(String ruolo) {
        this.ruolo = ruolo;
    }

    @Override
    public AccountDiCoordinatoreDTO getDTOofPersona() {

        AccountDiCoordinatoreDTO accountDiCoordinatoreDTO = new AccountDiCoordinatoreDTO();

//        accountDiCoordinatoreDTO.setTypeName("Coordinatore");
        accountDiCoordinatoreDTO.setIdPersona(this.getId());
        accountDiCoordinatoreDTO.setNome(this.getNome());
        accountDiCoordinatoreDTO.setCognome(this.getCognome());
        accountDiCoordinatoreDTO.setSesso(this.getSesso());
        accountDiCoordinatoreDTO.setRuolo(this.getRuolo());

        return accountDiCoordinatoreDTO;
    }
}
