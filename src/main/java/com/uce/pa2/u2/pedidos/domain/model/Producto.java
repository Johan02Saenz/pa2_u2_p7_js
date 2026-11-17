package com.uce.pa2.u2.pedidos.domain.model;

import java.math.BigDecimal;

public class Producto {
    private Integer id;
    private String nombre;
    private BigDecimal precio;
    private Integer stock;
    private Integer categoriaId;

    public Producto() {
    }

    public Producto(Integer id, String nombre, BigDecimal precio, Integer stock, Integer categoriaId) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.categoriaId = categoriaId;
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

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getCategoriaId() {
        return categoriaId;
    }

    public void setCategoriaId(Integer categoriaId) {
        this.categoriaId = categoriaId;
    }
}
