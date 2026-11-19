package com.uce.pa2.u2.pedidos.infraestructure.persistence.repository;

import com.uce.pa2.u2.pedidos.domain.model.Pedido;
import com.uce.pa2.u2.pedidos.domain.repository.PedidoRepository;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;

@ApplicationScoped
public class PedidoRepositoryImpl implements PedidoRepository {

    @Inject
    private EntityManager entityManager;

    @Override
    public void create(Pedido pedido) {
        this.entityManager.persist(pedido);
    }

    @Override
    public Pedido read(Integer id) {
        return this.entityManager.find(Pedido.class, id);
    }

    @Override
    public void update(Pedido pedido) {
        this.entityManager.merge(pedido);
    }

    @Override
    public void delete(Integer id) {
        this.entityManager.remove(this.read(id));
    }

}
