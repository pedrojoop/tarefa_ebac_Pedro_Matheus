package br.com.pedroL.services;

import br.com.pedroL.dao.IProdutoDAO;
import br.com.pedroL.domain.Produto;
import br.com.pedroL.services.generic.GenericService;

/**
 * @author pmpedrolima@gmail.com
 *
 */
public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

	public ProdutoService(IProdutoDAO dao) {
		super(dao);
	}

}
