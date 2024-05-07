package app.service;

import java.util.Optional;

import app.domain.entity.Pedido;
import app.domain.enums.StatusPedido;
import app.rest.dto.PedidoDTO;

public interface PedidoService {
    Pedido salvar( PedidoDTO dto );
    Optional<Pedido> obterPedidoCompleto(Integer id);
    void atualizaStatus(Integer id, StatusPedido statusPedido);
}
