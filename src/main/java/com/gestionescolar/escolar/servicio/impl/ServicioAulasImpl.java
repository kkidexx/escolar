package com.gestionescolar.escolar.servicio.impl;

import com.gestionescolar.escolar.modelo.Aulas;
import com.gestionescolar.escolar.repositorio.AulasRepositorio;
import com.gestionescolar.escolar.servicio1.ServicioAulas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioAulasImpl implements ServicioAulas {

    @Autowired
    private AulasRepositorio aulasRepositorio;

    @Override
    public List<Aulas> listarAulas() {
        return aulasRepositorio.findAll();
    }

    @Override
    public void guardarAula(Aulas aula) {
        aulasRepositorio.save(aula);
    }

    @Override
    public void eliminarAula(int id) {
        aulasRepositorio.deleteById(id);
    }

    @Override
    public Aulas obtenerAulaPorId(int id) {
        return aulasRepositorio.findById(id).orElse(null);
    }
}