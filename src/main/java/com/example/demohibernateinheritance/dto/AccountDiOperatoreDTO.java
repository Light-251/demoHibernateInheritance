package com.example.demohibernateinheritance.dto;

import com.example.demohibernateinheritance.domain.Account;
import com.example.demohibernateinheritance.domain.Operatore;

public class AccountDiOperatoreDTO extends AccountDiPersonaDTO {

    private Integer anniDiServizio;

    public Integer getAnniDiServizio() {
        return anniDiServizio;
    }

    public void setAnniDiServizio(Integer anniDiServizio) {
        this.anniDiServizio = anniDiServizio;
    }

}
