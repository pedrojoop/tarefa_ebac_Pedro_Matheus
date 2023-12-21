package test.java;

import Main.java.dao.IMatriculaDAO;
import Main.java.dao.IProdutoDAO;
import Main.java.dao.MatriculaDAO;
import Main.java.dao.ProdutoDAO;
import Main.java.domain.Matricula;
import Main.java.domain.Produto;
import org.junit.Test;

import java.time.Instant;

import static org.junit.Assert.assertNotNull;

public class ProdutoTest {
    private IProdutoDAO produtoDAO;

    public ProdutoTest() {
        produtoDAO = new ProdutoDAO();
    }

    @Test
    public void cadastrar() {
        Produto prod = new Produto();
        prod.setCodigo("123");
        prod.setValor(2000d);
        produtoDAO.cadastrar(prod);

        assertNotNull(prod);
        assertNotNull(prod.getId());
    }

    @Test
    public void buscarPorId() {
        Produto prod = new Produto();
        prod.setCodigo("123");
        prod.setValor(2000d);
        produtoDAO.cadastrar(prod);

        assertNotNull(prod);
        assertNotNull(prod.getId());
    }

    @Test
    public void excluirProduto() {
        Produto prod = new Produto();
        prod.setCodigo("123");
        prod.setValor(2000d);
        produtoDAO.cadastrar(prod);

        assertNotNull(prod);
        assertNotNull(prod.getId());
    }

    @Test
    public void atualizarProduto() {
        Produto prod = new Produto();
        prod.setCodigo("123");
        prod.setValor(2000d);
        produtoDAO.cadastrar(prod);

        assertNotNull(prod);
        assertNotNull(prod.getId());
    }
}
