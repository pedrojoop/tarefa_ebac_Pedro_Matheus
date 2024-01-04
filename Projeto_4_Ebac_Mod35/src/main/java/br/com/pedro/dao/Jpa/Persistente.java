package main.java.br.com.pedro.dao.Jpa;

import javax.persistence.MappedSuperclass;

/**
 * @author pmpedrolima@gmail.com
 */
public interface Persistente {
    public Long getId();

    public void setId(Long id);
}