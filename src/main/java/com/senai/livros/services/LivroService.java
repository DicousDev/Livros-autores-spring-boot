package com.senai.livros.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.livros.dto.LivroDTO;
import com.senai.livros.entities.Livro;
import com.senai.livros.repositories.LivroRepository;

@Service
public class LivroService {

	@Autowired
	private LivroRepository repository;
	
	public List<LivroDTO> getLivrosAll() {
		return repository.findAll().stream()
				.map(livro -> new LivroDTO(livro))
				.collect(Collectors.toList());
	}
	
	public LivroDTO insertLivro(LivroDTO livro) {
		
		if(livro == null) {
			throw new NullPointerException("Erro ao tentar inserir um novo livro");
		}
		
		Livro livroParaSalvar = new Livro(livro);
		Livro livroSalvado = repository.save(livroParaSalvar);
		return new LivroDTO(livroSalvado);
	}
}
