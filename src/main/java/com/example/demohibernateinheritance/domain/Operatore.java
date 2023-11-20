package com.example.demohibernateinheritance.domain;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@DiscriminatorValue("Operatore")
@Table(name = "tab_operatori")
public class Operatore extends Persona{

//    @Column(name = "anni_di_servizio")
    private Integer anniDiServizio;

    public Integer getAnniDiServizio() {
        return anniDiServizio;
    }

    public void setAnniDiServizio(Integer anniDiServizio) {
        this.anniDiServizio = anniDiServizio;
    }
}
