package com.uce.pa2.u2.pedidos.infraestructure.persistence.repository;

import com.uce.pa2.u2.pedidos.domain.model.Empleado;
import com.uce.pa2.u2.pedidos.domain.repository.EmpleadoRepository;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;

@ApplicationScoped
public class EmpleadoRepositoryImpl implements EmpleadoRepository {

    @Inject
    private EntityManager entityManager;

    @Override
    public void create(Empleado empleado) {
 this.entityManager.persist(empleado);
    }

    @Override
    public Empleado read(Integer id) {
        return this.entityManager.find(Empleado.class, id);
    }

    @Override
    public void update(Empleado empleado) {
        this.entityManager.merge(empleado);
    }

    @Override
    public void delete(Integer id) {
        this.entityManager.remove(this.read(id));
    }

}