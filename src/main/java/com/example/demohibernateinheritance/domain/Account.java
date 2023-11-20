package com.example.demohibernateinheritance.domain;

import com.example.demohibernateinheritance.dto.AccountDiPersonaDTO;
import jakarta.persistence.*;

@Entity
@Table(name = "tab_account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne
    @JoinColumn(name = "id")
    private Persona persona;

    public AccountDiPersonaDTO toDTO() {

        AccountDiPersonaDTO accountDiPersonaDTO = this.persona.getDTOofPersona();
        accountDiPersonaDTO.setIdAccount(this.getId());
        return accountDiPersonaDTO;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
}
