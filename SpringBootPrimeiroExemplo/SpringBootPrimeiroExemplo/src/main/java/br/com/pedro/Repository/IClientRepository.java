package br.com.pedro.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.pedro.Repository.Cliente;

/**
 * @author rodrigo.pires
 *
 */
@Repository
public interface IClientRepository extends CrudRepository<Cliente, Long>{

}