package com.gestionescolar.escolar.repositorio;

import com.gestionescolar.escolar.modelo.Aulas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AulasRepositorio extends JpaRepository<Aulas, Integer> {
}
