package test.java.br.com.pedro.dao.dao;

import main.java.br.com.pedro.Domain.Jpa.VendaJpa;
import main.java.br.com.pedro.dao.Jpa.IVendaJpaDAO;
import main.java.br.com.pedro.dao.generic.jpa.GenericJpaDAO;
import main.java.br.com.pedro.exceptions.DAOException;
import main.java.br.com.pedro.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author pmpedrolima@gmail.com
 */
public class VendaExclusaoJpaDAO extends GenericJpaDAO<VendaJpa, Long> implements IVendaJpaDAO {

    public VendaExclusaoJpaDAO() {
        super(VendaJpa.class, "Postgre1");
    }

    @Override
    public void finalizarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException {
        throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
    }

    @Override
    public void cancelarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException {
        throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
    }

    @Override
    public VendaJpa consultarComCollection(Long id) {
        throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
    }

}

