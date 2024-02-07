package br.com.vendas.online.VendasService.Repository;

import br.com.vendas.online.VendasService.Domain.Pedido;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PedidoRepository extends MongoRepository<Pedido, String> {
}
