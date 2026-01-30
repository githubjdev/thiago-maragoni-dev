package dev.thiago.springboot.controller;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.thiago.springboot.model.Produto;
import dev.thiago.springboot.service.ProdutoService;

@RestController /* Faz todo os métodos retornarem JSON e identifica um controller API REST */
@RequestMapping("/api/produtos") /* Faz o mapeamento da rota para acesso a API e os end-point */
public class ProdutoController {

	@Autowired /* Injeção de dependencia do Spring Boot */
	private ProdutoService produtoService;

	@PostMapping("/criar") /* Post para envio de dados */
	public ResponseEntity<Produto> criar(@RequestBody Produto produto) {
		Produto p = produtoService.salvar(produto);
		return ResponseEntity.ok(p);
	}

	@GetMapping /* Get para carregar dados oiu buscar */
	public ResponseEntity<List<Produto>> listarTodos() {

		List<Produto> produtos = produtoService.listarTodos();

		if (produtos.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(Collections.emptyList());
		}

		return ResponseEntity.ok(produtos);

	}

	@PutMapping
	public ResponseEntity<Produto> atualizar(@RequestBody Produto produto) throws Exception {
		Produto prod = produtoService.atualizar(produto);
		return ResponseEntity.ok(prod);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Produto> buscarPorId(@PathVariable(name = "id") Long id){
		
		if(id <= 0) {/*Id errado*/
			return ResponseEntity.badRequest().build();
		}
		
		Optional<Produto> produto = produtoService.buscarPorId(id);
		
		if (!produto.isPresent()) { /*Não foi encontrado*/
			return ResponseEntity.notFound().build();
		}
		
		/*Produto encontrado corretamente*/
		return ResponseEntity.ok(produto.get());
		
	}
	

}
