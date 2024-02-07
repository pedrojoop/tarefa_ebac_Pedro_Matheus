package br.com.vendas.online.ProdutosService.Repository;

import br.com.vendas.online.ProdutosService.Domain.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}