package com.uce.pa2.u2.application;

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

 
    public Pedido buscarPorID(Integer id) {
        return this.repo.read(id);
    }

  
    public void actualizar(Pedido pedido) {
        this.repo.update(pedido);
    }

 
    public void eliminar(Integer id) {
        this.repo.delete(id);
    }




}
