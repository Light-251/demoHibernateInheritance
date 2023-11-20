package com.example.demohibernateinheritance.dto;

public class AccountDiOperatoreDTO extends AccountDiPersonaDTO {

    private Integer anniDiServizio;

    public Integer getAnniDiServizio() {
        return anniDiServizio;
    }

    public void setAnniDiServizio(Integer anniDiServizio) {
        this.anniDiServizio = anniDiServizio;
    }
}
