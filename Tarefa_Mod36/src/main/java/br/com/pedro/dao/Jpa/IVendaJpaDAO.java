package main.java.br.com.pedro.dao.Jpa;

import main.java.br.com.pedro.Domain.Jpa.VendaJpa;
import main.java.br.com.pedro.exceptions.DAOException;
import main.java.br.com.pedro.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author pmpedrolima@gmail.com
 */
public interface IVendaJpaDAO extends IGenericJapDAO<VendaJpa, Long>{

    public void finalizarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException;

    public void cancelarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException;

    public VendaJpa consultarComCollection(Long id);
}

