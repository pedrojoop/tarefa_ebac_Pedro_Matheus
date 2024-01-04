package main.java.br.com.pedro.dao;

import main.java.br.com.pedro.Domain.Venda;
import main.java.br.com.pedro.dao.generic.IGenericDAO;
import main.java.br.com.pedro.exceptions.DAOException;
import main.java.br.com.pedro.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author pmpedrolima@gmail.com
 */
public interface IVendaDAO extends IGenericDAO<Venda, String> {

    public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException, DAOException;

    public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
}
