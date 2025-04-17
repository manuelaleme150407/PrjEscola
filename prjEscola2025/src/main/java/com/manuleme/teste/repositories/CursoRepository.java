package com.manuleme.teste.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manuleme.teste.entities.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {

}
