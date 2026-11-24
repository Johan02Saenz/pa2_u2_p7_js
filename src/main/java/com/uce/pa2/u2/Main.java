package com.uce.pa2.u2;

import java.time.LocalDateTime;

import com.uce.pa2.u2.application.PedidoService;
import com.uce.pa2.u2.pedidos.domain.model.Pedido;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;

@QuarkusMain
public class Main implements QuarkusApplication {
    @Inject
    private PedidoService pedidoService;

    public static void main(String[] args) {
        Quarkus.run(Main.class, args);
    }

    @Override
    public int run(String... args) throws Exception {
        System.out.println("[Main] Funciono");

        Pedido p1 = new Pedido();
        p1.setFecha(LocalDateTime.now());
        p1.setProducto("Audifonos Soundcore q20i");
        p1.setPrecio(65.00);
        p1.setNumero("10-MAR-23");
         this.pedidoService.guardar(p1);

        Pedido p2 = this.pedidoService.buscarPorNumero("10-MAR-23").get();
        System.out.println("Pedido encontrado por numero: " + p2.toString());
        return 0;
    }

}
