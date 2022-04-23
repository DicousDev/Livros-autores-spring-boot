package com.senai.livros.dto;

import java.util.ArrayList;
import java.util.List;

import com.senai.livros.entities.Autor;
import com.senai.livros.entities.Livro;

public class LivroDTO {

	private Long id;
	private String titulo;
	private String subtitulo;
	private Integer numeroDePaginas;
	private Integer anoDeLancamento;
	private List<Autor> autores = new ArrayList<>();
	
	public LivroDTO(Livro livro) {
		id = livro.getId();
		titulo = livro.getTitulo();
		subtitulo = livro.getSubtitulo();
		numeroDePaginas = livro.getNumeroDePaginas();
		anoDeLancamento = livro.getAnoDeLancamento();
		autores = livro.getAutores();
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
