package main.java.br.com.pedro.services;

import main.java.br.com.pedro.Domain.Cliente;
import main.java.br.com.pedro.dao.IClienteDAO;
import main.java.br.com.pedro.exceptions.DAOException;
import main.java.br.com.pedro.exceptions.MaisDeUmRegistroException;
import main.java.br.com.pedro.exceptions.TableException;
import main.java.br.com.pedro.services.generic.GenericService;

/**
 * @author rodrigo.pires
 *
 */
public class ClienteService extends GenericService<Cliente, Long> implements IClienteService {

    //private IClienteDAO clienteDAO;

    public ClienteService(IClienteDAO clienteDAO) {
        super(clienteDAO);
    }

//	@Override
//	public Boolean salvar(Cliente cliente) throws TipoChaveNaoEncontradaException {
//		return clienteDAO.cadastrar(cliente);
//	}

    @Override
    public Cliente buscarPorCPF(Long cpf) throws DAOException {
        try {
            return this.dao.consultar(cpf);
        } catch (MaisDeUmRegistroException | TableException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }

}
