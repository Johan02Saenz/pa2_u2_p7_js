package com.uce.pa2.u2;

import java.time.LocalDateTime;
import java.util.List;

import com.uce.pa2.u2.application.CategoriaService;
import com.uce.pa2.u2.application.ClienteService;
import com.uce.pa2.u2.application.EmpleadoService;
import com.uce.pa2.u2.application.MetodoPagosService;
import com.uce.pa2.u2.application.PedidoService;
import com.uce.pa2.u2.application.ProductoService;
import com.uce.pa2.u2.pedidos.domain.model.Categoria;
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

    @Inject
    private CategoriaService categoriaService;
    @Inject
    private EmpleadoService empleadoService;
    @Inject
    private MetodoPagosService metodoPagosService;

    @Inject
    private ClienteService clienteService;

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
        p1.setNumero("abcdfd");
      //  pedidoService.guardar(p1);

        List<Pedido> pedidos = this.pedidoService.buscarTodos();
        for (Pedido pedido : pedidos) {
            System.out.println(pedido.toString());
        }

        System.out.println(this.pedidoService.buscarPorNumeroNative("abcdfd"));
        return 0;
    }

}
