package Facade;

import Facade.Articulo;
import Facade.Carrito;

import java.util.ArrayList;

public class Pago {
    private float monto = 0;
    private String medioPago;
    private Carrito carrito;
    private int id;
    public String getMedioPago() {
        return medioPago;
    }

    public float getMonto() {
        return monto;
    }

    public int getId() {
        return id;
    }

    public Pago(String medioPago, Carrito carrito) {

        this.medioPago = medioPago;
        this.carrito = carrito;
        this.id = carrito.getId();
        ArrayList<Articulo> articulos= carrito.getArticulos();
        for (Articulo articulo : articulos) {
            monto += articulo.getPrecio();
        }
        this.monto = monto;

    }
    public void pagar(){
        System.out.println("Pago de: " + monto +" realizado con " + medioPago);
    }
}
