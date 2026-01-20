package dev.thiago.springboot.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.thiago.springboot.model.Produto;

@RestController
@RequestMapping("/apiteste")
public class ControllerInicial {

	@GetMapping
	public String testeInicial1() {
		return "Spring boot funcionando";
	}

	@GetMapping("/teste")
	public String testeInicial() {
		return "Spring boot funcionando método";
	}

	@GetMapping("/produto")
	public ResponseEntity<Produto> getProduto() {
		Produto produto = new Produto();
		produto.setNome("Teclado");
		produto.setValor(120.00);
		return ResponseEntity.ok(produto);

	}

}
