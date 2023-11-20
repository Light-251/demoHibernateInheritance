package com.example.demohibernateinheritance.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = AccountDiOperatoreDTO.class, name = "Operatore"),
        @JsonSubTypes.Type(value = AccountDiAdminDTO.class, name = "Admin"),
        @JsonSubTypes.Type(value = AccountDiCoordinatoreDTO.class, name = "Coordinatore")
})
//@JsonDeserialize(using = AccountDiPersonaDTODeserializer.class)
public class AccountDiPersonaDTO {

    private Integer idPersona;
    private String nome;
    private String cognome;
    private String sesso;

    public Integer getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Integer idPersona) {
        this.idPersona = idPersona;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getSesso() {
        return sesso;
    }

    public void setSesso(String sesso) {
        this.sesso = sesso;
    }
}
