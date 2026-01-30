package dev.thiago.springboot.service;

import java.util.List;
import java.util.Optional;

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

	public List<Produto> listarTodos() {
		return produtoRepository.findAll();
	}

	public Produto atualizar(Produto produto) throws Exception {
		
		if (produto.getId() == null) {
			throw new Exception("Id do produto não informado");
		}
		
		produtoRepository.findById(produto.getId())
		      .orElseThrow(() -> new RuntimeException("Produto não encontrado"));
		
		return produtoRepository.save(produto);
	}

	public Optional<Produto> buscarPorId(Long id) {
		return produtoRepository.findById(id);
	}

}
