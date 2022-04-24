package com.senai.livros.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.livros.dto.LivroDTO;
import com.senai.livros.exceptions.NotFoundRuntimeException;
import com.senai.livros.services.LivroService;

@RestController
@RequestMapping(value = "/livros")
public class LivroController {
	
	@Autowired
	private LivroService service;
	
	@GetMapping
	public ResponseEntity<List<LivroDTO>> findLivrosAll() {
		List<LivroDTO> livros = service.findLivrosAll();
		return ResponseEntity.status(HttpStatus.OK).body(livros);
	}
	
	@GetMapping(value = "/{idLivro}")
	public ResponseEntity<?> findLivroById(@PathVariable Long idLivro) {
		try {
			LivroDTO livro = service.findLivroById(idLivro);
			return ResponseEntity.status(HttpStatus.OK).body(livro);
		}
		catch(NullPointerException e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e);
		}
		catch(NotFoundRuntimeException e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e);
		}
	}
	
	@PostMapping
	public ResponseEntity<?> insertLivro(@RequestBody LivroDTO livro) {
		try {
			LivroDTO livroInserido = service.insertLivro(livro);
			return ResponseEntity.status(HttpStatus.CREATED).body(livroInserido);
		}
		catch(NullPointerException e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e);
		}
	}
}
