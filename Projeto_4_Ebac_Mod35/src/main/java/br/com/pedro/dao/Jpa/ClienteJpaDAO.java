package main.java.br.com.pedro.dao.Jpa;

import main.java.br.com.pedro.Domain.Jpa.ClienteJpa;
import main.java.br.com.pedro.dao.generic.jpa.GenericJpaDAO;

/**
 * @author pmpedrolima@gmail.com
 */
public class ClienteJpaDAO extends GenericJpaDAO<ClienteJpa, Long> implements IClienteJpaDAO {

    public ClienteJpaDAO() {
        super();
    }

}
