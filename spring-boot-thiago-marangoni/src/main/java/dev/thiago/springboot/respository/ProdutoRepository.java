package dev.thiago.springboot.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dev.thiago.springboot.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
  
}
