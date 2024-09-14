package com.gestionescolar.escolar.repositorio;

import com.gestionescolar.escolar.modelo.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoRepositorio extends JpaRepository<Curso, Integer> {
}