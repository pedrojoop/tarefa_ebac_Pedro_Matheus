package br.com.vendas.online.VendasService;

import br.com.vendas.online.VendasService.Domain.ItemPedido;
import br.com.vendas.online.VendasService.Domain.Pedido;
import br.com.vendas.online.VendasService.Repository.PedidoRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class PedidoRepositoryIntegrationTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private PedidoRepository pedidoRepository;

    @Test
    public void whenFindAll_thenReturnListOfPedidos() {
        Pedido pedido = new Pedido();
        pedido.setClienteId("idDoCliente");

        ItemPedido itemPedido = new ItemPedido();
        itemPedido.setProdutoId("idDoProduto");
        itemPedido.setQuantidade(1);
        itemPedido.setPrecoUnitario();

        List<ItemPedido> itens = new ArrayList<>();
        itens.add(itemPedido);

        pedido.setItens(itens);

        List<Pedido> pedidos = pedidoRepository.findAll();

        assertThat(pedidos).hasSize(2);
    }

}
