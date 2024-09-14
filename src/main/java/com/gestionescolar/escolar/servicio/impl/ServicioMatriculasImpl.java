package com.gestionescolar.escolar.servicio.impl;

import com.gestionescolar.escolar.modelo.Matriculas;
import com.gestionescolar.escolar.repositorio.MatriculasRepositorio;
import com.gestionescolar.escolar.servicio1.ServicioMatriculas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioMatriculasImpl implements ServicioMatriculas {

    @Autowired
    private MatriculasRepositorio matriculasRepositorio;

    @Override
    public List<Matriculas> listarMatriculas() {
        return matriculasRepositorio.findAll();
    }

    @Override
    public void guardarMatriculas(Matriculas matriculas) {
        matriculasRepositorio.save(matriculas);
    }

    @Override
    public void eliminarMatriculas(int id) {
        matriculasRepositorio.deleteById(id);
    }

    @Override
    public Matriculas obtenerMatriculasPorId(int id) {
        return matriculasRepositorio.findById(id).orElse(null);
    }
}