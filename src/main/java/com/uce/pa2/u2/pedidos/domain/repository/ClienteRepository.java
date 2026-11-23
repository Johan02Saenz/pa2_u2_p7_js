package com.uce.pa2.u2.pedidos.domain.repository;

import com.uce.pa2.u2.pedidos.domain.model.Cliente;


public interface ClienteRepository {

    public void create(Cliente cliente);
    public Cliente read (Integer id);
    public void update(Cliente cliente);
    public void delete(Integer id);
}
