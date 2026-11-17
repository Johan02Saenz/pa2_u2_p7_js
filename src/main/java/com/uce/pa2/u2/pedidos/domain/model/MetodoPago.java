package com.uce.pa2.u2.pedidos.domain.model;

import java.math.BigDecimal;

public class MetodoPago {
    private Integer id;
    private String nombre;
    private String descripcion;
    private BigDecimal comision;
    private Boolean activo;

    public MetodoPago() {
    }

    public MetodoPago(Integer id, String nombre, String descripcion, BigDecimal comision, Boolean activo) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.comision = comision;
        this.activo = activo;
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

    public BigDecimal getComision() {
        return comision;
    }

    public void setComision(BigDecimal comision) {
        this.comision = comision;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }
}
