package main.java.br.com.pedro.dao.Jpa;

import main.java.br.com.pedro.Domain.Jpa.ProdutoJpa;
import main.java.br.com.pedro.dao.generic.jpa.GenericJpaDAO;

/**
 * @author pmpedrolima@gmail.com
 */
public class ProdutoJpaDAO extends GenericJpaDAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

    public ProdutoJpaDAO() {
        super(ProdutoJpa.class);
    }

}

