package com.uce.pa2.u2.application;

import java.util.List;
import java.util.Optional;

import com.uce.pa2.u2.pedidos.domain.model.Pedido;
import com.uce.pa2.u2.pedidos.infraestructure.persistence.repository.PedidoRepositoryImpl;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
@Transactional
public class PedidoService {

    @Inject
    private PedidoRepositoryImpl repo;

    public void guardar(Pedido pedido) {
        this.repo.create(pedido);
    }

    public Optional<Pedido> buscarPorID(Integer id) {
        return this.repo.read(id);
    }

    public void actualizar(Pedido pedido) {
        this.repo.update(pedido);
    }

    public void eliminar(Integer id) {
        this.repo.delete(id);
    }

    public Optional<Pedido> buscarPorNumero(String numero) {
        return this.repo.readByNumber(numero);
    }

    public List<Pedido> buscarTodos() {
        return this.repo.readAll();
    }
    
    public Optional<Pedido> buscarPorNumeroNative(String numero) {
        return this.repo.readByNumberNative(numero);
    }
    public List<Pedido> buscarTodosNative() {
        return this.repo.readAllNative();
    }

}
