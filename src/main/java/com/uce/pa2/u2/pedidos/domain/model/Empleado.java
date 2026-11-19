package com.uce.pa2.u2.pedidos.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "Empleados")
public class Empleado {
   
    @Id
    @SequenceGenerator(name = "Empleados_seq", sequenceName = "Empleados_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Empleados_seq")
    @Column(name = "empl_id")
    private Integer id;
    @Column(name = "empl_nombre")
    private String nombre;
    @Column(name = "empl_cargo")
    private String cargo;
    @Column(name = "empl_telefono")
    private String telefono;
    @Column(name = "empl_activo")
    private Boolean activo;

    public Empleado() {
    }

    public Empleado(Integer id, String nombre, String cargo, String telefono, Boolean activo) {
        this.id = id;
        this.nombre = nombre;
        this.cargo = cargo;
        this.telefono = telefono;
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }
}
