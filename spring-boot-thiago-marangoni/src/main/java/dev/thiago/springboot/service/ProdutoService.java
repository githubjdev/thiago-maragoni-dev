package dev.thiago.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.thiago.springboot.model.Produto;
import dev.thiago.springboot.respository.ProdutoRepository;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository produtoRepository;

	public Produto salvar(Produto produto) {
		return produtoRepository.save(produto);
	}

}
