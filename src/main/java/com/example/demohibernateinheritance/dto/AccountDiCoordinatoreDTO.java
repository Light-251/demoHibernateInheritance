package com.example.demohibernateinheritance.dto;

import com.example.demohibernateinheritance.domain.Coordinatore;
import com.example.demohibernateinheritance.domain.Operatore;
import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("Coordinatore")
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


    public Coordinatore toObject() {
        Coordinatore coordinatore = new Coordinatore();

        coordinatore.setNome(this.getNome());
        coordinatore.setCognome(this.getCognome());
        coordinatore.setSesso(this.getSesso());
        coordinatore.setRuolo(this.ruolo);

        return coordinatore;
    }
}
