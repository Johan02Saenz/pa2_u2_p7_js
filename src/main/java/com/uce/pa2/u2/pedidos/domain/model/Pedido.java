package com.uce.pa2.u2.pedidos.domain.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity // indica que la class sera administrada por jakarta persisten API
@Table(name = "Pedidos") // nombre de la tabla de DB
public class Pedido {
    @Id // para decir que es la primary key
    @SequenceGenerator(name = "pedido_seq", sequenceName = "pedido_seq_db", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pedido_seq")
    @Column(name = "pdd_id") // Asociacion con la columna
    private Integer id;
    @Column(name = "pdd_producto")
    private String producto;
    @Column(name = "pdd_precio")
    private Double precio;
    @Column(name = "pdd_fecha")
    private LocalDateTime fecha;

    
    public Pedido() {
    }

    public Pedido(String producto, Double precio, LocalDateTime fecha) {
        this.producto = producto;
        this.precio = precio;
        this.fecha = fecha;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[Pedido]Detalles {");
        sb.append("id=").append(id);
        sb.append(", producto=").append(producto);
        sb.append(", precio=").append(precio);
        sb.append(", fecha=").append(fecha.toString());
        sb.append('}');
        return sb.toString();
    }



}
