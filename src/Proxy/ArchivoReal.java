package Proxy;

import java.util.ArrayList;

public class ArchivoReal implements Archivo {
    private String nombre;
    private String contenido;

    public ArchivoReal(String nombre) {
        this.nombre = nombre;
        this.contenido = contenido;
    }

    public String getNombre() {
        return nombre;
    }



    public String getContenido() {
        return contenido;
    }

    public void leerArchivo() {
        System.out.println("Contenido del archivo: "+this.contenido);
    }
}
