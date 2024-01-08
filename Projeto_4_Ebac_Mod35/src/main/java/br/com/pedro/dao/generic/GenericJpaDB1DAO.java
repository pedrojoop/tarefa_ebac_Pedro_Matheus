package main.java.br.com.pedro.dao.generic;

import main.java.br.com.pedro.dao.Jpa.Persistente;
import main.java.br.com.pedro.dao.generic.jpa.GenericJpaDAO;

import java.io.Serializable;

/**
 * @author pmpedrolima@gmail.com
 */
public abstract class GenericJpaDB1DAO <T extends Persistente, E extends Serializable>
        extends GenericJpaDAO<T,E> {

    public GenericJpaDB1DAO(Class<T> persistenteClass) {
        super(persistenteClass, "Postgre1");
    }

}
