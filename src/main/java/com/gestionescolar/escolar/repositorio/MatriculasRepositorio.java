package com.gestionescolar.escolar.repositorio;

import com.gestionescolar.escolar.modelo.Matriculas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatriculasRepositorio extends JpaRepository<Matriculas, Integer> {
}