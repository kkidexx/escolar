package com.gestionescolar.escolar.servicio.impl;

import com.gestionescolar.escolar.modelo.Estudiante;
import com.gestionescolar.escolar.repositorio.EstudianteRepositorio;
import com.gestionescolar.escolar.servicio1.ServicioEstudiante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioEstudianteImpl implements ServicioEstudiante {

    @Autowired
    private EstudianteRepositorio estudianteRepositorio;

    @Override
    public List<Estudiante> listarEstudiantes() {
        return estudianteRepositorio.findAll();
    }

    @Override
    public void guardarEstudiante(Estudiante estudiante) {
        estudianteRepositorio.save(estudiante);
    }

    @Override
    public void eliminarEstudiante(int id) {
        estudianteRepositorio.deleteById(id);
    }

    @Override
    public Estudiante obtenerEstudiantePorId(int id) {
        return estudianteRepositorio.findById(id).orElse(null);
    }
}