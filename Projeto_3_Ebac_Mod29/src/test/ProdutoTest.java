package test;

import domain.Cliente;
import generic.ProdutosDAO.IProdutoDAO;
import generic.ProdutosDAO.ProdutoDAO;
import domain.Produto;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author pmpedrolima@gmail.com
 */
public class ProdutoTest {
    private IProdutoDAO produtoDAO;

    @Test
    public void cadastrarProdutoTest() throws Exception {
        produtoDAO = new ProdutoDAO();

        Produto produto = new Produto();
        produto.setCodigo("10");
        produto.setNome("Produto");
        Integer countCad = produtoDAO.cadastrar(produto);
        assertTrue(countCad == 1);

        Produto produtoBD = produtoDAO.buscar("10");
        assertNotNull(produtoBD);
        assertEquals(produto.getCodigo(), produtoBD.getCodigo());
        assertEquals(produto.getNome(), produtoBD.getNome());

        Integer countDel = produtoDAO.excluir(produtoBD);
        assertTrue(countDel == 1);
    }

    @Test
    public void buscarProdutoTest() throws Exception {
        produtoDAO = new ProdutoDAO();

        Produto produto = new Produto();
        produto.setCodigo("10");
        produto.setNome("Produto");
        Integer countCad = produtoDAO.cadastrar(produto);
        assertTrue(countCad == 1);

        Produto produtoBD = produtoDAO.buscar("10");
        assertNotNull(produtoBD);
        assertEquals(produto.getCodigo(), produtoBD.getCodigo());
        assertEquals(produto.getNome(), produtoBD.getNome());

        Integer countDel = produtoDAO.excluir(produtoBD);
        assertTrue(countDel == 1);
    }

    @Test
    public void excluirProdutoTest() throws Exception {
        produtoDAO = new ProdutoDAO();

        Produto produto = new Produto();
        produto.setCodigo("10");
        produto.setNome("Produto");
        Integer countCad = produtoDAO.cadastrar(produto);
        assertTrue(countCad == 1);

        Produto produtoBD = produtoDAO.buscar("10");
        assertNotNull(produtoBD);
        assertEquals(produto.getCodigo(), produtoBD.getCodigo());
        assertEquals(produto.getNome(), produtoBD.getNome());

        Integer countDel = produtoDAO.excluir(produtoBD);
        assertTrue(countDel == 1);
    }

    @Test
    public void buscarTodosProdutoTest() throws Exception {
        produtoDAO = new ProdutoDAO();

        Produto produto = new Produto();
        produto.setCodigo("10");
        produto.setNome("Produto");
        Integer countCad = produtoDAO.cadastrar(produto);
        assertTrue(countCad == 1);

        Produto produtoBD = produtoDAO.buscar("10");
        assertNotNull(produtoBD);
        assertEquals(produto.getCodigo(), produtoBD.getCodigo());
        assertEquals(produto.getNome(), produtoBD.getNome());

        Integer countDel = produtoDAO.excluir(produtoBD);
        assertTrue(countDel == 1);
    }

    @Test
    public void atualizarProdutoTest() throws Exception {
        produtoDAO = new ProdutoDAO();

        Produto produto = new Produto();
        produto.setCodigo("10");
        produto.setNome("Produto");
        Integer countCad = produtoDAO.cadastrar(produto);
        assertTrue(countCad == 1);

        Produto produtoBD = produtoDAO.buscar("10");
        assertNotNull(produtoBD);
        assertEquals(produto.getCodigo(), produtoBD.getCodigo());
        assertEquals(produto.getNome(), produtoBD.getNome());

        produtoBD.setCodigo("20");
        produtoBD.setNome("Outro nome");
        Integer countUpdate = produtoDAO.atualizar(produtoBD);
        assertTrue(countUpdate == 1);

        Produto produtoBD1 = produtoDAO.buscar("10");
        assertNull(produtoBD1);

        Produto produtoBD2 = produtoDAO.buscar("20");
        assertEquals(produtoBD.getCodigo(), produtoBD2.getCodigo());
        assertEquals(produtoBD.getNome(), produtoBD2.getNome());
        assertEquals(produtoBD.getId(), produtoBD2.getId());
        assertNotNull(produtoBD2);

        List<Produto> list = produtoDAO.buscarTodos();
        for (Produto pro : list) {
            produtoDAO.excluir(pro);
        }
    }


}
