package com.example.demohibernateinheritance.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "tab_account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne
    @JoinColumn(name = "tab_persona")
    private Persona persona;
}
