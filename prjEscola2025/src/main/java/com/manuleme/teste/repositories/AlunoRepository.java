package com.manuleme.teste.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manuleme.teste.entities.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {

}
