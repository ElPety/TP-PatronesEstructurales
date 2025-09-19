package Facade;

public class Articulo {
    private String nombre;
    private float precio;

    public Articulo(String nombre, float precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public float getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }
}
