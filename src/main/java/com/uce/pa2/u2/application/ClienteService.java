package com.uce.pa2.u2.application;

import com.uce.pa2.u2.pedidos.domain.model.Cliente;
import com.uce.pa2.u2.pedidos.infraestructure.persistence.repository.ClienteRepositoryImpl;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
@Transactional
public class ClienteService {

    @Inject
    private ClienteRepositoryImpl repo;

    public void guardar(Cliente cliente) {
        this.repo.create(cliente);
    }

    public Cliente buscarPorID(Integer id) {
        return this.repo.read(id);
    }

    public void actualizar(Cliente cliente) {
        this.repo.update(cliente);
    }

    public void eliminar(Integer id) {
        this.repo.delete(id);
    }

}