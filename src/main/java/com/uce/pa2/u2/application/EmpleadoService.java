package com.uce.pa2.u2.application;

import com.uce.pa2.u2.pedidos.domain.model.Empleado;
import com.uce.pa2.u2.pedidos.infraestructure.persistence.repository.EmpleadoRepositoryImpl;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
@Transactional
public class EmpleadoService {
    @Inject
    private EmpleadoRepositoryImpl repo;

    public void guardar(Empleado empleado) {
        this.repo.create(empleado);
    }

    public Empleado buscarPorID(Integer id) {
        return this.repo.read(id);
    }

    public void actualizar(Empleado empleado) {
        this.repo.update(empleado);
    }

    public void eliminar(Integer id) {
        this.repo.delete(id);
    }

}
