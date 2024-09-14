package com.gestionescolar.escolar.servicio1;


import com.gestionescolar.escolar.modelo.Aulas;

import java.util.List;

public interface ServicioAulas {
    List<Aulas> listarAulas();
    void guardarAula(Aulas aula);
    void eliminarAula(int id);
    Aulas obtenerAulaPorId(int id);
}