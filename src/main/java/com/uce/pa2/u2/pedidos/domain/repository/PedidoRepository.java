package com.uce.pa2.u2.pedidos.domain.repository;

import java.util.List;
import java.util.Optional;

import com.uce.pa2.u2.pedidos.domain.model.Pedido;

public interface PedidoRepository {

    public void create(Pedido pedido);

    public Optional<Pedido> read(Integer id);

    public Optional<Pedido> readByNumber(String numero);

    public List<Pedido> readAll();

    public void update(Pedido pedido);

    public void delete(Integer id);

    public Optional<Pedido> readByNumberNative(String numero);

    public List<Pedido> readAllNative();
}
