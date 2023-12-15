package br.com.pedroL.dao;

import br.com.pedroL.dao.generic.IGenericDAO;
import br.com.pedroL.domain.Venda;
import br.com.pedroL.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author pmpedrolima@gmail.com
 *
 */
public interface IVendaDAO extends IGenericDAO<Venda, String> {

	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException;
}
