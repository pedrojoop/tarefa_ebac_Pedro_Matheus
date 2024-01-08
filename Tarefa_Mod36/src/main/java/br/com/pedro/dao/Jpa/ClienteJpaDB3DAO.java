package main.java.br.com.pedro.dao.Jpa;

import main.java.br.com.pedro.Domain.Jpa.ClienteJpa;
import main.java.br.com.pedro.Domain.Jpa.ClienteJpa2;
import main.java.br.com.pedro.exceptions.DAOException;
import main.java.br.com.pedro.exceptions.MaisDeUmRegistroException;
import main.java.br.com.pedro.exceptions.TableException;
import main.java.br.com.pedro.exceptions.TipoChaveNaoEncontradaException;

import java.util.Collection;

/**
 * @author pmpedrolima@gmail.com
 */
public class ClienteJpaDB3DAO extends GenericJpaDB3DAO<ClienteJpa2, Long> implements IClienteJpaDAO<ClienteJpa2> {

    public ClienteJpaDB3DAO() {
        super(ClienteJpa2.class);
    }

    @Override
    public ClienteJpa cadastrar(ClienteJpa entity) throws TipoChaveNaoEncontradaException, DAOException {
        return null;
    }

    @Override
    public void excluir(ClienteJpa entity) throws DAOException {

    }

    @Override
    public ClienteJpa alterar(ClienteJpa entity) throws TipoChaveNaoEncontradaException, DAOException {
        return null;
    }

    @Override
    public ClienteJpa consultar(Long id) throws MaisDeUmRegistroException, TableException, DAOException {
        return null;
    }

    @Override
    public Collection<ClienteJpa> buscarTodos() throws DAOException {
        return null;
    }
}
