package com.uce.pa2.u2.application;

import com.uce.pa2.u2.pedidos.domain.model.Categoria;
import com.uce.pa2.u2.pedidos.infraestructure.persistence.repository.CategoriaRepositoryImpl;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped 
@Transactional 
public class CategoriaService {

    @Inject 
    private CategoriaRepositoryImpl repo;
   
    public void guardar(Categoria categoria) {
        this.repo.create(categoria);
    }

 
    public Categoria buscarPorID(Integer id) {
        return this.repo.read(id);
    }

  
    public void actualizar(Categoria categoria) {
        this.repo.update(categoria);
    }

 
    public void eliminar(Integer id) {
        this.repo.delete(id);
    }




}
