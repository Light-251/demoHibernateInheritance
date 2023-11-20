package com.example.demohibernateinheritance.dto;

public class AccountDiMedicoDTO extends AccountDiPersonaDTO{

    private Integer anniDiServizio;

    public AccountDiMedicoDTO() {
    }

    public AccountDiMedicoDTO(Integer anniDiServizio) {
        this.anniDiServizio = anniDiServizio;
    }

    public Integer getAnniDiServizio() {
        return anniDiServizio;
    }

    public void setAnniDiServizio(Integer anniDiServizio) {
        this.anniDiServizio = anniDiServizio;
    }
}
