package com.uce.pa2.u2.pedidos.domain.model;

public class Empleado {
    private Integer id;
    private String nombre;
    private String cargo;
    private String telefono;
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
