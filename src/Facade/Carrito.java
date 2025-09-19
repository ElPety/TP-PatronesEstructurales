package Facade;
import java.util.Random;

import java.util.ArrayList;

public class Carrito {

    private ArrayList<Articulo> articulos = new ArrayList();
    private int id;
    public Carrito() {
        this.id = new Random().nextInt(1000);
    }

    public int getId() {
        return id;
    }

    public ArrayList<Articulo> getArticulos() {
        return articulos;
    }

    public void agregarCarrito(Articulo articulo) {
        articulos.add(articulo);
        System.out.println(articulo.getNombre() + " añadido al carrito");
    }
}
