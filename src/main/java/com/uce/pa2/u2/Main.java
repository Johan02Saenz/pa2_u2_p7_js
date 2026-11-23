package com.uce.pa2.u2;

import java.time.LocalDateTime;

import com.uce.pa2.u2.application.PedidoService;
import com.uce.pa2.u2.application.ProductoService;
import com.uce.pa2.u2.pedidos.domain.model.Pedido;
import com.uce.pa2.u2.pedidos.domain.model.Producto;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;

@QuarkusMain
public class Main implements QuarkusApplication {
    @Inject
    private PedidoService pedidoService;

    @Inject
    private ProductoService productoService;

    public static void main(String[] args) {
        Quarkus.run(Main.class, args);
    }

    @Override
    public int run(String... args) throws Exception {
        System.out.println("[Main] Funciono");
        Pedido p1 = new Pedido();
        p1.setFecha(LocalDateTime.now());
        p1.setProducto("Audifonos Soundcore q11i");
        p1.setPrecio(35.00);
        pedidoService.guardar(p1);

        Producto pr1 = new Producto("Audifonos Soundcore q11i", 35.00, 2, 2);
        productoService.guardar(pr1);
        return 0;
    }

}
