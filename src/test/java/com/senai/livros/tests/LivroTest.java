package com.senai.livros.tests;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.senai.livros.dto.LivroDTO;
import com.senai.livros.services.LivroService;

@SpringBootTest
public class LivroTest {
	
	@Autowired
	private LivroService service;

	@Test
	public void insertLivro() {
		LivroDTO livroParaSalvar = new LivroDTO("INSERT LIVRO", "", 500, 2022);
		LivroDTO livroSalvado = service.insertLivro(livroParaSalvar);
		assertThat(livroSalvado.getId()).isNotNull();
	}
	
	@Test
	public void insertLivroNull() {
		Assertions.assertThrows(NullPointerException.class, new Executable() {
			
			@Override
			public void execute() {
				service.insertLivro(null);
			}
		});
	}
}
