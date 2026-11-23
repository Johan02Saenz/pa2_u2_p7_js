package com.uce.pa2.u2.pedidos.domain.model;

import java.math.BigDecimal;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "MetodoPagos")
public class MetodoPago extends PanacheEntityBase{

    @Id
    @SequenceGenerator(name = "MetodoPagos_seq", sequenceName = "MetodoPagos_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MetodoPagos_seq")
    @Column(name = "mtpg_id")
    private Integer id;
    @Column(name = "mtpg_nombre")
    private String nombre;
    @Column(name = "mtpg_descripcion")
    private String descripcion;
    @Column(name = "mtpg_comision")
    private BigDecimal comision;
    @Column(name = "mtpg_activo")
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
