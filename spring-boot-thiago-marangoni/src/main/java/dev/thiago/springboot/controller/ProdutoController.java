package dev.thiago.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.thiago.springboot.model.Produto;
import dev.thiago.springboot.service.ProdutoService;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

	@Autowired
	private ProdutoService produtoService;

	@PostMapping("/criar")
	public ResponseEntity<Produto> criar(@RequestBody Produto produto) {
		Produto p = produtoService.salvar(produto);
		return ResponseEntity.ok(p);
	}
	

}
