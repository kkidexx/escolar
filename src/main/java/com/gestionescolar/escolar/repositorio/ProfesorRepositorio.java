package com.gestionescolar.escolar.repositorio;

import com.gestionescolar.escolar.modelo.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfesorRepositorio extends JpaRepository<Profesor, Integer> {
}