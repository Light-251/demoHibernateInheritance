package com.example.demohibernateinheritance.dto;

import com.example.demohibernateinheritance.domain.Coordinatore;

public class AccountDiCoordinatoreDTO extends AccountDiPersonaDTO {

    private String ruolo;

    public AccountDiCoordinatoreDTO() {
    }

    public AccountDiCoordinatoreDTO(String ruolo) {
        this.ruolo = ruolo;
    }

    public String getRuolo() {
        return ruolo;
    }

    public void setRuolo(String ruolo) {
        this.ruolo = ruolo;
    }

}
