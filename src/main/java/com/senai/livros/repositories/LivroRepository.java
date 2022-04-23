package com.senai.livros.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senai.livros.entities.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long> {

}
