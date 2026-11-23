package com.uce.pa2.u2.pedidos.domain.repository;

import com.uce.pa2.u2.pedidos.domain.model.Empleado;


public interface EmpleadoRepository {

    public void create(Empleado empleado);
    public Empleado read (Integer id);
    public void update(Empleado empleado);
    public void delete(Integer id);
}
