package test.java.br.com.pedro.dao.dao;

import java.util.Collection;

import main.java.br.com.pedro.Domain.Produto;
import main.java.br.com.pedro.dao.IProdutoDAO;
import main.java.br.com.pedro.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author pmpedrolima@gmail.com
 *
 */
public class ProdutoDaoMock implements IProdutoDAO {

    @Override
    public Boolean cadastrar(Produto entity) throws TipoChaveNaoEncontradaException {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public void excluir(String valor) {
        // TODO Auto-generated method stub

    }

    @Override
    public void alterar(Produto entity) throws TipoChaveNaoEncontradaException {
        // TODO Auto-generated method stub

    }

    @Override
    public Produto consultar(String valor) {
        Produto produto = new Produto();
        produto.setCodigo(valor);
        return produto;
    }

    @Override
    public Collection<Produto> buscarTodos() {
        // TODO Auto-generated method stub
        return null;
    }

}
