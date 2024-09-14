package com.gestionescolar.escolar.servicio1;


import com.gestionescolar.escolar.modelo.Profesor;

import java.util.List;

public interface ServicioProfesor {
    List<Profesor> listarProfesores();
    void guardarProfesor(Profesor profesor);
    void eliminarProfesor(int id);
    Profesor obtenerProfesorPorId(int id);
}