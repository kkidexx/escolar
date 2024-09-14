package com.gestionescolar.escolar.servicio.impl;

import com.gestionescolar.escolar.modelo.Profesor;
import com.gestionescolar.escolar.repositorio.ProfesorRepositorio;
import com.gestionescolar.escolar.servicio1.ServicioProfesor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioProfesorImpl implements ServicioProfesor {

    @Autowired
    private ProfesorRepositorio profesorRepositorio;

    @Override
    public List<Profesor> listarProfesores() {
        return profesorRepositorio.findAll();
    }

    @Override
    public void guardarProfesor(Profesor profesor) {
        profesorRepositorio.save(profesor);
    }

    @Override
    public void eliminarProfesor(int id) {
        profesorRepositorio.deleteById(id);
    }

    @Override
    public Profesor obtenerProfesorPorId(int id) {
        return profesorRepositorio.findById(id).orElse(null);
    }
}