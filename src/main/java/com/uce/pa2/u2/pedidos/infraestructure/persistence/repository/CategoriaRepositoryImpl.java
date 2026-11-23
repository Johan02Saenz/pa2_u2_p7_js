package com.uce.pa2.u2.pedidos.infraestructure.persistence.repository;

import com.uce.pa2.u2.pedidos.domain.model.Categoria;
import com.uce.pa2.u2.pedidos.domain.repository.CategoriaRepository;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;

@ApplicationScoped
public class CategoriaRepositoryImpl implements CategoriaRepository {
    @Inject
    private EntityManager entityManager;

    @Override
    public void create(Categoria categoria) {
        this.entityManager.persist(categoria);
    }

    @Override
    public Categoria read(Integer id) {
        return this.entityManager.find(Categoria.class, id);
    }

    @Override
    public void update(Categoria categoria) {
        this.entityManager.merge(categoria);
    }

    @Override
    public void delete(Integer id) {
        this.entityManager.remove(this.read(id));
    }

}