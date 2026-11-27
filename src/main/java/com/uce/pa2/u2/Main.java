package com.uce.pa2.u2;

import java.time.LocalDateTime;

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
        pedidoService.guardar(p1);

        Producto pr1 = new Producto("Audifonos Soundcore q11i", 35.00, 2, 2);
        productoService.guardar(pr1);
        System.out.println(this.productoService.buscarPorID((long) 1).toString());
        /*Producto pr2 = this.productoService.buscarPorID((long) 1);
        pr2.setPrecio(40.00);
        this.productoService.actualizar(pr2);
        this.productoService.eliminar((long) 1); 
*/
        Categoria ct = new Categoria("PC", "Area enfocada en componenentes de PC", true, 2);
        this.categoriaService.guardar(ct);
        Categoria ct2 = this.categoriaService.buscarPorID(1);
        System.out.println(ct2.toString());
        ct2.setDescripcion(ct2.getDescripcion()+" y laptops");
        this.categoriaService.actualizar(ct2);
        return 0;
    }

}
