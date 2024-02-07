package br.com.vendas.online.VendasService.Controller;


import br.com.vendas.online.VendasService.Domain.Pedido;
import br.com.vendas.online.VendasService.Service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    @GetMapping
    public List<Pedido> getAllPedidos() {
        return pedidoService.getAllPedidos();
    }

    // Implemente endpoints para criar e processar pedidos conforme necessário
}