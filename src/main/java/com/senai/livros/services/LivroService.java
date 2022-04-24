package com.senai.livros.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.senai.livros.dto.LivroDTO;
import com.senai.livros.entities.Livro;
import com.senai.livros.exceptions.NotFoundRuntimeException;
import com.senai.livros.repositories.LivroRepository;

@Service
public class LivroService {

	@Autowired
	private LivroRepository repository;
	
	@Transactional(readOnly = true)
	public List<LivroDTO> findLivrosAll() {
		return repository.findAll().stream()
				.map(livro -> new LivroDTO(livro))
				.collect(Collectors.toList());
	}

	@Transactional(readOnly = true)
	public LivroDTO findLivroById(Long idLivro) {
		
		if(idLivro == null) {
			throw new NullPointerException("Erro ao tentar procurar um livro por id.");
		}
		
		Optional<Livro> livro = repository.findById(idLivro);
		if(livro.isEmpty()) {
			throw new NotFoundRuntimeException("Busca por livro com id " + idLivro + " não foi encontrado.");
		}
		
		Livro getLivro = livro.get();
		LivroDTO livroDTO = new LivroDTO(getLivro);
		return livroDTO;
	}
	
	@Transactional
	public LivroDTO insertLivro(LivroDTO livro) {
		
		if(livro == null) {
			throw new NullPointerException("Erro ao tentar inserir um novo livro.");
		}
		
		Livro livroParaSalvar = new Livro(livro);
		Livro livroSalvado = repository.save(livroParaSalvar);
		return new LivroDTO(livroSalvado);
	}
	
	@Transactional
	public LivroDTO updateLivro(Long idLivro, LivroDTO livro) throws RuntimeException {
		
		if(livro == null) {
			throw new NullPointerException("Erro ao tentar atualizar um livro.");
		}
		
		LivroDTO livroEncontrado = findLivroById(idLivro);
		Livro livroParaAtualizar = new Livro(livroEncontrado);
		livroParaAtualizar.setTitulo(livro.getTitulo());
		livroParaAtualizar.setSubtitulo(livro.getSubtitulo());
		livroParaAtualizar.setNumeroDePaginas(livro.getNumeroDePaginas());
		livroParaAtualizar.setAnoDeLancamento(livro.getAnoDeLancamento());
		Livro livroAtualizado = repository.save(livroParaAtualizar);
		return new LivroDTO(livroAtualizado);
	}

	@Transactional
	public void removeLivro(Long idLivro) throws RuntimeException {
		
		if(idLivro == null) {
			throw new NullPointerException("Erro ao tentar remover um livro.");
		}
		
		Optional<Livro> livro = repository.findById(idLivro);
		if(livro.isEmpty()) {
			throw new NotFoundRuntimeException("Busca por livro com id " + idLivro + " não foi encontrado.");
		}
		
		repository.deleteById(idLivro);
	}
}
