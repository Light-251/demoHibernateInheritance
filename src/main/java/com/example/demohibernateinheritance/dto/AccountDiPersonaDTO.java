package com.example.demohibernateinheritance.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
@JsonSubTypes({
//        @JsonSubTypes.Type(value = AccountDiPazientePrivatoDTO.class, name = "Paziente"),
//        @JsonSubTypes.Type(value = AccountDiOperatorePrivatoDTO.class, name = "Operatore"),
//        @JsonSubTypes.Type(value = AccountDiMedicoDTO.class, name = "Medico"),
//        @JsonSubTypes.Type(value = AccountDiAdminDTO.class, name = "Admin"),
//        @JsonSubTypes.Type(value = AccountDiCoordinatoreDTO.class, name = "Coordinatore")
})
//@JsonDeserialize(using = AccountDiPersonaDTODeserializer.class)
public class AccountDiPersonaDTO {

    @JsonProperty("type")
    private String type;
    private Integer idPersona;
    private String nome;
    private String cognome;
}