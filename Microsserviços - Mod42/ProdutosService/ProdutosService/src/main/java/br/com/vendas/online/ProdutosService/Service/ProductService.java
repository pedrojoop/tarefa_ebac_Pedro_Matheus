package br.com.vendas.online.ProdutosService.Service;

import br.com.vendas.online.ProdutosService.Domain.Product;
import br.com.vendas.online.ProdutosService.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Optional<Product> getProductById(String id) {
        return productRepository.findById(id);
    }

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    public Product updateProduct(String id, Product product) {
        Optional<Product> existingProductOptional = productRepository.findById(id);
        if (!existingProductOptional.isPresent()) {
            return null;
        }
        Product existingProduct = existingProductOptional.get();
        existingProduct.setNome(product.getNome());
        existingProduct.setPrice(product.getPrice());
        return productRepository.save(existingProduct);
    }

    public void deleteProduct(String id) {
        productRepository.deleteById(id);
    }

    public void atualizarEstoque(String produtoId, int i) {
    }
}
