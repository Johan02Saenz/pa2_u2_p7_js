package com.uce.pa2.u2.pedidos.domain.model;

import io.quarkus.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "Categorias")
public class Categoria {
    @Id
    @SequenceGenerator(name = "categoria_seq", sequenceName = "categoria_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "categoria_seq")
    @Column(name = "ctg_id")
    private Integer id;
    @Column(name = "ctg_nombre")
    private String nombre;
    @Column(name = "ctg_descripcion")
    private String descripcion;
    @Column(name = "ctg_activa")
    private Boolean activa;
    @Column(name = "ctg_orden")
    private Integer orden;

    public Categoria() {
    }

    public Categoria(Integer id, String nombre, String descripcion, Boolean activa, Integer orden) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.activa = activa;
        this.orden = orden;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Boolean getActiva() {
        return activa;
    }

    public void setActiva(Boolean activa) {
        this.activa = activa;
    }

    public Integer getOrden() {
        return orden;
    }

    public void setOrden(Integer orden) {
        this.orden = orden;
    }
}
