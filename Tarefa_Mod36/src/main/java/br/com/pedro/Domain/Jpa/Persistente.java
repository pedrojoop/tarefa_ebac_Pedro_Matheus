package main.java.br.com.pedro.Domain.Jpa;

import javax.persistence.MappedSuperclass;

/**
 * @author pmpedrolima@gmail.com
 */
@MappedSuperclass
public interface Persistente {
    public Long getId();

    public void setId(Long id);
}