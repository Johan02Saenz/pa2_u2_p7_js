package com.uce.pa2.u2.application;

import com.uce.pa2.u2.pedidos.domain.model.MetodoPago;
import com.uce.pa2.u2.pedidos.domain.repository.MetodoPagoRepository;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped 
@Transactional 
public class MetodoPagosService {

    @Inject 
    private MetodoPagoRepository repo;

    
    public void guardar(MetodoPago metodoPago) {
        this.repo.persist(metodoPago);
    }

    public MetodoPago buscarPorID(Integer id) {
        return this.repo.findById(id);
    }

    public void actualizar(MetodoPago metodoPago) {
        MetodoPago m = this.repo.findById(metodoPago.getId());
        m.setDescripcion(metodoPago.getDescripcion());
        m.setComision(metodoPago.getComision());
        m.setActivo(metodoPago.getActivo());
        
    }

    public void eliminar(Integer id) {
        this.repo.deleteById(id);
    }

}