package com.uce.pa2.u2.application;

import com.uce.pa2.u2.pedidos.domain.model.Producto;
import com.uce.pa2.u2.pedidos.domain.repository.ProductoRepository;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
@Transactional
public class ProductoService {
    @Inject
    private ProductoRepository repo;

    public void guardar(Producto producto) {
        this.repo.persist(producto);
    }

    public Producto buscarPorID(Long id) {
        return this.repo.findById(id);
    }

    @Transactional
    public void actualizar(Producto producto) {
        Producto p = this.repo.findById(producto.getId());
        p.setNombre(producto.getNombre());
        p.setPrecio(producto.getPrecio());
        p.setStock(producto.getStock());

    }

    public void eliminar(Long id) {
        this.repo.deleteById(id);
    }

}