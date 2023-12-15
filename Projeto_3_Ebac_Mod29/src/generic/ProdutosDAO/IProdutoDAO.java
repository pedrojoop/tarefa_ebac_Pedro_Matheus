package generic.ProdutosDAO;

import domain.Produto;

import java.util.List;

/**
 * @author pmpedrolima@gmail.com
 */
public interface IProdutoDAO {

    /**
     * Cadastra um novo produto
     * @param produto
     * @return
     * @throws Exception
     */
    public Integer cadastrar(Produto produto) throws Exception;

    /**
     * Atualiza um produto
     * @param produto
     * @return
     * @throws Exception
     */
    public Integer atualizar(Produto produto) throws Exception;

    /**
     * Busca um produto pelo código
     * @param codigo
     * @return
     * @throws Exception
     */
    public Produto buscar(String codigo) throws Exception;

    /**
     * Busca todos os produtos
     * @return
     * @throws Exception
     */
    public List<Produto> buscarTodos() throws Exception;

    /**
     * Exclui um produto
     * @param produto
     * @return
     * @throws Exception
     */
    public Integer excluir(Produto produto) throws Exception;
}
