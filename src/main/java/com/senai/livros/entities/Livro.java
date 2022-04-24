package com.senai.livros.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
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
	@Column(nullable = false)
	private String titulo;
	private String subtitulo;
	@Column(nullable = false)
	private Integer numeroDePaginas;
	@Column(nullable = false)
	private Integer anoDeLancamento;
	
	@OneToMany
	private List<Autor> autores = new ArrayList<>();
	
	public Livro() {
		
	}
	
	public Livro(String titulo, String subtitulo, Integer numeroDePaginas, Integer anoDeLancamento) {
		this.titulo = titulo;
		this.subtitulo = subtitulo;
		this.numeroDePaginas = numeroDePaginas;
		this.anoDeLancamento = anoDeLancamento;
	}
	
	public Livro(LivroDTO livro) {
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

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getSubtitulo() {
		return subtitulo;
	}

	public void setSubtitulo(String subtitulo) {
		this.subtitulo = subtitulo;
	}

	public Integer getNumeroDePaginas() {
		return numeroDePaginas;
	}

	public void setNumeroDePaginas(Integer numeroDePaginas) {
		this.numeroDePaginas = numeroDePaginas;
	}

	public Integer getAnoDeLancamento() {
		return anoDeLancamento;
	}

	public void setAnoDeLancamento(Integer anoDeLancamento) {
		this.anoDeLancamento = anoDeLancamento;
	}

	public List<Autor> getAutores() {
		return autores;
	}

	public void setAutores(List<Autor> autores) {
		this.autores = autores;
	}
}
