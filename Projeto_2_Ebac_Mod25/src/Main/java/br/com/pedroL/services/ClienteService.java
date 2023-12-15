package br.com.pedroL.services;

import br.com.pedroL.dao.IClienteDAO;
import br.com.pedroL.domain.Cliente;
import br.com.pedroL.exceptions.TipoChaveNaoEncontradaException;
import br.com.pedroL.services.generic.GenericService;

/**
 * @author pmpedrolima@gmail.com
 *
 */
public class ClienteService extends GenericService<Cliente, Long> implements IClienteService {
	
	//private IClienteDAO clienteDAO;
	
	public ClienteService(IClienteDAO clienteDAO) {
		super(clienteDAO);
		//this.clienteDAO = clienteDAO;
	}

//	@Override
//	public Boolean salvar(Cliente cliente) throws TipoChaveNaoEncontradaException {
//		return clienteDAO.cadastrar(cliente);
//	}

	@Override
	public Cliente buscarPorCPF(Long cpf) {
		return this.dao.consultar(cpf);
	}

//	@Override
//	public void excluir(Long cpf) {
//		clienteDAO.excluir(cpf);
//	}
//
//	@Override
//	public void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException{
//		clienteDAO.alterar(cliente);
//	}

}
