package br.com.vendas.online.VendasService.Service;

import org.springframework.stereotype.Service;

@Service
public class NotificacaoService {

    public void enviarEmailConfirmacaoPedido(String clienteId) {
        System.out.println("Email de confirmação do pedido enviado para o cliente com ID: " + clienteId);
    }

}
