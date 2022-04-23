package com.senai.livros.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.livros.dto.LivroDTO;
import com.senai.livros.services.LivroService;

@RestController
@RequestMapping(value = "/livros")
public class LivroController {
	
	@Autowired
	private LivroService service;
	
	@GetMapping
	public List<LivroDTO> getLivrosAll() {
		return service.getLivrosAll();
	}
}
