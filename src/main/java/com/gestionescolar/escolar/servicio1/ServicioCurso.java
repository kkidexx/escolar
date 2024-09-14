package com.gestionescolar.escolar.servicio1;


import com.gestionescolar.escolar.modelo.Curso;

import java.util.List;

public interface ServicioCurso {
    List<Curso> listarCursos();
    void guardarCurso(Curso curso);
    void eliminarCurso(int id);
    Curso obtenerCursoPorId(int id);
}