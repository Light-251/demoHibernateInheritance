//package com.example.demohibernateinheritance.domain;
//
//import com.example.demohibernateinheritance.dto.AccountDiPersonaDTO;
//import jakarta.persistence.Column;
//import jakarta.persistence.DiscriminatorValue;
//import jakarta.persistence.Entity;
//import jakarta.persistence.Table;
//
//@Entity
//@DiscriminatorValue("Medico")
//@Table(name = "tab_medico")
//public class Medico extends Persona {
//
//    @Column(name = "anni_di_servizio")
//    private Integer anniDiServizio;
//
//    @Override
//    public AccountDiPersonaDTO getDTOofPersona() {
//        return null;
//    }
//
//    public Medico() {
//    }
//
//    public Medico(Integer anniDiServizio) {
//        this.anniDiServizio = anniDiServizio;
//    }
//
//    public Medico(String nome, String cognome, String sesso, Integer anniDiServizio) {
//        super(nome, cognome, sesso);
//        this.anniDiServizio = anniDiServizio;
//    }
//
//    public Integer getAnniDiServizio() {
//        return anniDiServizio;
//    }
//
//    public void setAnniDiServizio(Integer anniDiServizio) {
//        this.anniDiServizio = anniDiServizio;
//    }
//}
