package com.gestionescolar.escolar.modelo;

import lombok.Data;


import java.io.Serial;
import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Data
@Entity
public class Curso implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCurso;
    private String nombreCurso;
    private int creditos;
    private String nivel; 
    private String modalidad; 
    private String descripcionCurso; 
}
