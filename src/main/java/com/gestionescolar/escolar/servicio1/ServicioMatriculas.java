package com.gestionescolar.escolar.servicio1;


import com.gestionescolar.escolar.modelo.Matriculas;

import java.util.List;

public interface ServicioMatriculas {
    List<Matriculas> listarMatriculas();
    void guardarMatriculas(Matriculas matriculas);
    void eliminarMatriculas(int id);
    Matriculas obtenerMatriculasPorId(int id);
}