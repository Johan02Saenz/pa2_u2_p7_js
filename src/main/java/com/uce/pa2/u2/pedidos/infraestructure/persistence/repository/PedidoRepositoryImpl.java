package com.uce.pa2.u2.pedidos.infraestructure.persistence.repository;

import java.util.List;
import java.util.Optional;

import jakarta.persistence.Query;

import com.uce.pa2.u2.pedidos.domain.model.Pedido;
import com.uce.pa2.u2.pedidos.domain.repository.PedidoRepository;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

@ApplicationScoped
public class PedidoRepositoryImpl implements PedidoRepository {

    @Inject
    private EntityManager entityManager;

    @Override
    public void create(Pedido pedido) {
        this.entityManager.persist(pedido);
    }

    @Override
    public Optional<Pedido> read(Integer id) {
        return Optional.ofNullable(this.entityManager.find(Pedido.class, id));
    }

    @Override
    public void update(Pedido pedido) {
        this.entityManager.merge(pedido);
    }

    @Override
    public void delete(Integer id) {
        Optional<Pedido> pedido = this.read(id);
        pedido.ifPresent(this.entityManager::remove);
    }

    @Override
    public Optional<Pedido> readByNumber(String numero) {
        // Implementacion de la interfaz TypeQuery
        // this.EntityManager.createQuery("Consulta JPQL", Clase con la que trabaja)

        TypedQuery<Pedido> query = this.entityManager.createQuery(
                "SELECT p FROM Pedido p WHERE p.numero = :numeroVariable",
                Pedido.class);
        query.setParameter("numeroVariable", numero);
        return Optional.ofNullable(query.getSingleResult());
    }

    @Override
    public List<Pedido> readAll() {
        TypedQuery<Pedido> myQuery = this.entityManager.createQuery("SELECT p FROM Pedido p", Pedido.class);
        return myQuery.getResultList();
    }

    @Override
    public Optional<Pedido> readByNumberNative(String numero) {
        Query myquery = this.entityManager
                .createNativeQuery("Select * from pedidos p WHERE p.pdd_numero=:numeroVariable",Pedido.class);
        myquery.setParameter("numeroVariable", numero);
        Pedido p =  (Pedido) myquery.getSingleResult();
        
        return Optional.ofNullable( p);
    }

    @Override
    public List<Pedido> readAllNative() {
        Query myQuery = this.entityManager.createNativeQuery("SELECT * FROM pedidos");
return myQuery.getResultList();

    }

}
