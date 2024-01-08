package main.java.br.com.pedro.dao.generic.jpa;

import main.java.br.com.pedro.dao.Jpa.Persistente;

import java.io.Serializable;

/**
 * @author pmpedrolima@gmail.com
 * @param <T>
 * @param <E>
 */
public abstract class GenericJpaDB2DAO <T extends Persistente, E extends Serializable>
        extends GenericJpaDAO<T,E> {

    public GenericJpaDB2DAO(Class<T> persistenteClass) {
        super(persistenteClass, "Postgre2");
    }

}
