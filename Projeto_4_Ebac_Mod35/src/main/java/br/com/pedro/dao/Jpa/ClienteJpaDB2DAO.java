package main.java.br.com.pedro.dao.Jpa;

import main.java.br.com.pedro.Domain.Jpa.ClienteJpa;
import main.java.br.com.pedro.dao.generic.GenericJpaDB2DAO;
import main.java.br.com.pedro.exceptions.DAOException;
import main.java.br.com.pedro.exceptions.MaisDeUmRegistroException;
import main.java.br.com.pedro.exceptions.TableException;
import main.java.br.com.pedro.exceptions.TipoChaveNaoEncontradaException;

import java.util.Collection;

/**
 * @author pmpedrolima@gmail.com
 */
public class ClienteJpaDB2DAO extends GenericJpaDB2DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

    public ClienteJpaDB2DAO() {
        super(ClienteJpa.class);
    }
}
