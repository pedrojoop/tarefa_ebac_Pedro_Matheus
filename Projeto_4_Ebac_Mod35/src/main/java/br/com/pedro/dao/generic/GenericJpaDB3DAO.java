package main.java.br.com.pedro.dao.generic;

import main.java.br.com.pedro.dao.Jpa.Persistente;
import main.java.br.com.pedro.dao.generic.jpa.GenericJpaDAO;

import java.io.Serializable;

/**
 * @author pmpedrolima@gmail.com
 * @param <T>
 * @param <E>
 */
public abstract class GenericJpaDB3DAO <T extends Persistente, E extends Serializable>
        extends GenericJpaDAO<T,E> {

    public GenericJpaDB3DAO(Class<T> persistenteClass) {
        super(persistenteClass, "Mysql1");
    }

}
