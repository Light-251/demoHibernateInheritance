package com.example.demohibernateinheritance.dto;

import com.example.demohibernateinheritance.domain.Account;
import com.example.demohibernateinheritance.domain.Operatore;
import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("Operatore")
public class AccountDiOperatoreDTO extends AccountDiPersonaDTO {

    private Integer anniDiServizio;

    public Integer getAnniDiServizio() {
        return anniDiServizio;
    }

    public void setAnniDiServizio(Integer anniDiServizio) {
        this.anniDiServizio = anniDiServizio;
    }

    public Operatore toObject() {
        Operatore operatore = new Operatore();

        operatore.setNome(this.getNome());
        operatore.setCognome(this.getCognome());
        operatore.setSesso(this.getSesso());
        operatore.setAnniDiServizio(this.anniDiServizio);

        return operatore;
    }
}
