package com.uce.pa2.u2.pedidos.domain.repository;

import com.uce.pa2.u2.pedidos.domain.model.Pedido;

public interface PedidoRepository {

    public void create(Pedido pedido);
    public Pedido read (Integer id);
    public void update(Pedido pedido);
    public void delete(Integer id);
}
