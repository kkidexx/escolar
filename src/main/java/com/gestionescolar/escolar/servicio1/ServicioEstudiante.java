package com.gestionescolar.escolar.servicio1;


import com.gestionescolar.escolar.modelo.Estudiante;

import java.util.List;

public interface ServicioEstudiante {
    List<Estudiante> listarEstudiantes();
    void guardarEstudiante(Estudiante estudiante);
    void eliminarEstudiante(int id);
    Estudiante obtenerEstudiantePorId(int id);
}