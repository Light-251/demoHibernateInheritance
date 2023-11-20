package com.example.demohibernateinheritance.domain;

import com.example.demohibernateinheritance.dto.AccountDiOperatoreDTO;
import com.example.demohibernateinheritance.dto.AccountDiPersonaDTO;
import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@DiscriminatorValue("Operatore")
@Table(name = "tab_operatori")
public class Operatore extends Persona{

    @Column(name = "anni_di_servizio")
    private Integer anniDiServizio;

    public Integer getAnniDiServizio() {
        return anniDiServizio;
    }

    public void setAnniDiServizio(Integer anniDiServizio) {
        this.anniDiServizio = anniDiServizio;
    }

    @Override
    public AccountDiOperatoreDTO getDTOofPersona() {

        AccountDiOperatoreDTO accountDiOperatoreDTO = new AccountDiOperatoreDTO();

        accountDiOperatoreDTO.setNome(this.getNome());
        accountDiOperatoreDTO.setCognome(this.getCognome());
        accountDiOperatoreDTO.setSesso(this.getSesso());
        accountDiOperatoreDTO.setAnniDiServizio(this.getAnniDiServizio());

        return accountDiOperatoreDTO;
    }
}
