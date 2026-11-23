package com.uce.pa2.u2;

import java.time.LocalDateTime;

import com.uce.pa2.u2.application.PedidoService;
import com.uce.pa2.u2.application.ProductoService;
import com.uce.pa2.u2.pedidos.domain.model.Pedido;

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
       
        // Create (insertar)

        Pedido p1 = new Pedido();
        p1.setFecha(LocalDateTime.now());
        p1.setProducto("Audifonos Soundcore q20i");
        p1.setPrecio(65.00);
        pedidoService.guardar(p1);
        // Read (buscar)
        p1 = this.pedidoService.buscarPorID(1);
        System.out.println("Pedido encontrado: " + p1.toString());

        // Update (actualizar)
        p1.setPrecio(40.00);
        this.pedidoService.actualizar(p1);
        Pedido p23 = this.pedidoService.buscarPorID(1);
        System.out.println("Pedido actualizado encontrado: " + p23.toString());

        // Delete (eliminar)
        this.pedidoService.eliminar(1);
        return 0;

    }

}
