package service;

import dao.*;

/**
 * @author pmpedrolima@gmail.com
 */

public class ClientService {

    private IClientDAO clientDao;

    public ClientService(IClientDAO clientDao) {
        this.clientDao = clientDao;
    }

    public String Save() {
        clientDao.save();
        return "Sucesso";
    }

    // Implementação dos métodos adicionados
    public Object buscar(int id) {
        // Lógica para buscar um cliente pelo ID
        return null;
    }

    public void excluir(int id) {
        // Lógica para excluir um cliente pelo ID
    }

    public void atualizar(int id, Object cliente) {
        // Lógica para atualizar um cliente pelo ID
    }
}
