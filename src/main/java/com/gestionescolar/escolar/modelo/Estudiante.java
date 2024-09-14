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
public class Estudiante implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEstudiante;
    private String nombre;
    private String apellido;
    private String cedula;
    private String correo;
    private String telefono;
}
