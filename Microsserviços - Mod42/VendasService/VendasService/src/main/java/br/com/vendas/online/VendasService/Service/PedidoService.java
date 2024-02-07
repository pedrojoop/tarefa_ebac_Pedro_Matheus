package br.com.vendas.online.VendasService.Service;

import br.com.vendas.online.ProdutosService.Service.ProductService;
import br.com.vendas.online.VendasService.Domain.ItemPedido;
import br.com.vendas.online.VendasService.Domain.Pedido;
import br.com.vendas.online.VendasService.Repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    private ProductService productService;

    @Autowired
    private NotificacaoService notificacaoService;

    public List<Pedido> getAllPedidos() {
        return pedidoRepository.findAll();
    }

    public Pedido createPedido(Pedido pedido) {
        double total = 0.0;
        for (ItemPedido item : pedido.getItens()) {
            total += item.getPrecoUnitario() * item.getQuantidade();
        }
        pedido.setTotal(total);

        for (ItemPedido item : pedido.getItens()) {
            // Atualiza o estoque do produto apenas se a quantidade for positiva
            if (item.getQuantidade() > 0) {
                productService.atualizarEstoque(item.getProdutoId(), -item.getQuantidade());
            } else {
                throw new IllegalArgumentException("A quantidade de cada item deve ser maior que zero");
            }
        }

        notificacaoService.enviarEmailConfirmacaoPedido(pedido.getClienteId());

        return pedidoRepository.save(pedido);
    }

}
