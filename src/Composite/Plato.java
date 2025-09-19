package Composite;

public class Plato implements ElementoMenu{
    String nombre;
    public Plato(String nombre) {
        this.nombre = nombre;
    }

    public void pedir(int cantidad){
        System.out.println(nombre + "[" + cantidad + "]");
    }
}
