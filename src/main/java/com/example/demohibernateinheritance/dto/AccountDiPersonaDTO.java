package com.example.demohibernateinheritance.dto;

import com.example.demohibernateinheritance.domain.Account;
import com.example.demohibernateinheritance.domain.Persona;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = AccountDiOperatoreDTO.class, name = "Operatore"),
        @JsonSubTypes.Type(value = AccountDiAdminDTO.class, name = "Admin"),
        @JsonSubTypes.Type(value = AccountDiCoordinatoreDTO.class, name = "Coordinatore"),
        @JsonSubTypes.Type(value = AccountDiMedicoDTO.class, name = "Medico")
})

//@JsonDeserialize(using = AccountDiPersonaDTODeserializer.class)
public class AccountDiPersonaDTO {

    private Integer idAccount;
    private Integer idPersona;
    private String nome;
    private String cognome;
    private String sesso;

//    @JsonProperty("type")
//    private String typeName;

    public Integer getIdAccount() {
        return idAccount;
    }

    public void setIdAccount(Integer idAccount) {
        this.idAccount = idAccount;
    }

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

//    public String getTypeName() {
//        return typeName;
//    }
//
//    @JsonSetter("type")
//    public void setTypeName(String typeName) {
//        this.typeName = typeName;
//    }

    public Persona toObject() {
        return null;
    }

}
