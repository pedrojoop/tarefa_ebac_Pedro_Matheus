package br.com.vendas.online.ClienteService.Service;

import br.com.vendas.online.ClienteService.Domain.Client;
import br.com.vendas.online.ClienteService.Repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    public Optional<Client> getClientById(String id) {
        return clientRepository.findById(id);
    }

    public Client createClient(Client client) {
        return clientRepository.save(client);
    }

    public Client updateClient(String id, Client client){
        if (!clientRepository.existsById(id)) {
            return null;
        }
        client.setId(id);
        return clientRepository.save(client);
    }

    public void deleteClient(String id) {
        clientRepository.deleteById(id);
    }
}
