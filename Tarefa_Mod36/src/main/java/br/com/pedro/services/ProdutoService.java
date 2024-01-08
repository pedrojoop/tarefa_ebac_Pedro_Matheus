package main.java.br.com.pedro.services;

import main.java.br.com.pedro.Domain.Produto;
import main.java.br.com.pedro.dao.IProdutoDAO;
import main.java.br.com.pedro.services.generic.GenericService;

/**
 * @author pmpedrolima@gmail.com
 *
 */
public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

    public ProdutoService(IProdutoDAO dao) {
        super(dao);
    }

}
