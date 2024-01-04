package main.java.br.com.pedro.services;


import main.java.br.com.pedro.Domain.Cliente;
import main.java.br.com.pedro.exceptions.DAOException;
import main.java.br.com.pedro.services.generic.IGenericService;

/**
 * @author pmpedrolima@gmail.com
 *
 */
public interface IClienteService extends IGenericService<Cliente, Long> {

    //	Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException;
//
    Cliente buscarPorCPF(Long cpf) throws DAOException;
//
//	void excluir(Long cpf);
//
//	void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;

}