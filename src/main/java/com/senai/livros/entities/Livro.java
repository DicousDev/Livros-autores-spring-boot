package com.senai.livros.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.senai.livros.dto.LivroDTO;

@Entity
@Table(name = "tb_livro")
public class Livro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String titulo;
	private String subtitulo;
	private Integer numeroDePaginas;
	private Integer anoDeLancamento;
	
	@OneToMany
	private List<Autor> autores = new ArrayList<>();
	
	public Livro(LivroDTO livro) {
		titulo = livro.getTitulo();
		subtitulo = livro.getSubtitulo();
		numeroDePaginas = livro.getNumeroDePaginas();
		anoDeLancamento = livro.getAnoDeLancamento();
	}

	public Long getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getSubtitulo() {
		return subtitulo;
	}

	public Integer getNumeroDePaginas() {
		return numeroDePaginas;
	}

	public Integer getAnoDeLancamento() {
		return anoDeLancamento;
	}

	public List<Autor> getAutores() {
		return autores;
	}
}
