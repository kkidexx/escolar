package com.gestionescolar.escolar.servicio.impl;


import com.gestionescolar.escolar.modelo.Curso;
import com.gestionescolar.escolar.repositorio.CursoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioCursoImpl implements com.gestionescolar.escolar.servicio1.ServicioCurso {

    @Autowired
    private CursoRepositorio cursoRepositorio;

    @Override
    public List<Curso> listarCursos() {
        return cursoRepositorio.findAll();
    }

    @Override
    public void guardarCurso(Curso curso) {
        cursoRepositorio.save(curso);
    }

    @Override
    public void eliminarCurso(int id) {
        cursoRepositorio.deleteById(id);
    }

    @Override
    public Curso obtenerCursoPorId(int id) {
        return cursoRepositorio.findById(id).orElse(null);
    }
}
