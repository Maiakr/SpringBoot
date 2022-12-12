package com.ejemplo.SpringBoot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;



import lombok.Getter;
import lombok.Setter;

@Getter @Setter

public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Entity

    private Long id;
    private String nombre;
    private String apellido;

    public Persona (Long id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }
}
