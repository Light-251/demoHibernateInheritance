package com.example.demohibernateinheritance.dto;

import com.example.demohibernateinheritance.domain.Medico;
import com.example.demohibernateinheritance.domain.Operatore;
import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("Medico")
public class AccountDiMedicoDTO extends AccountDiPersonaDTO {

    private Integer anniDiServizio;
    private String specializzazione;

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

    public String getSpecializzazione() {
        return specializzazione;
    }

    public void setSpecializzazione(String specializzazione) {
        this.specializzazione = specializzazione;
    }

    public Medico toObject() {
        Medico medico = new Medico();

        medico.setNome(this.getNome());
        medico.setCognome(this.getCognome());
        medico.setSesso(this.getSesso());
        medico.setAnniDiServizio(this.anniDiServizio);
        medico.setSpecializzazione(this.specializzazione);

        return medico;
    }
}
