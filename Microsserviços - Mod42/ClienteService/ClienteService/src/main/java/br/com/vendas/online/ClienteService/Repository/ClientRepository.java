package br.com.vendas.online.ClienteService.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import br.com.vendas.online.ClienteService.Domain.Client;

public interface ClientRepository extends MongoRepository<Client, String> {

}
