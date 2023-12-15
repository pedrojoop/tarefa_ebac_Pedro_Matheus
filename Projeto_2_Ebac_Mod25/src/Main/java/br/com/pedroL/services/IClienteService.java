package br.com.pedroL.services;

import br.com.pedroL.domain.Cliente;
import br.com.pedroL.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author pmpedrolima@gmail.com
 *
 */
public interface IClienteService {

	Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException;

	Cliente buscarPorCPF(Long cpf);

	void excluir(Long cpf);

	void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;

}
