package Facade;

import java.util.ArrayList;

public class CompraFacade {
    private Carrito carrito = new Carrito();
    private String direccion;
    private String medioPago;
    private int id;
    public void comprar( String direccion, String medioPago, Articulo... articulos) {
        this.direccion = direccion;
        this.medioPago = medioPago;
        for (Articulo a : articulos) {
            carrito.agregarCarrito(a);
        }
        Pago pago = new Pago("Tarjeta de Debito", carrito);
        this.id = pago.getId();
        pago.pagar();
        Envio envio = new Envio(direccion);
        envio.enviar(id);

    }
}
