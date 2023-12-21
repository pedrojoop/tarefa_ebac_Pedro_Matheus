package Main.java.dao;

import Main.java.domain.Produto;

public interface IProdutoDAO {

    Produto cadastrar(Produto produto);

    Produto buscarPorId(Long id);

    Produto excluirProduto(Long id);

    Produto atualizarProduto(Produto produto);

}
