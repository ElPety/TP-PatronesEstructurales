package Composite;

import java.util.ArrayList;
import java.util.List;

public class Promo implements ElementoMenu{

    private String nombre;
    private List<ElementoMenu> platosPromo = new ArrayList<>();
    public Promo(String nombre) {
        this.nombre = "promo" + nombre;
        System.out.println("Promocion " + nombre + " creada con exito");
    }
    public void addPlato(ElementoMenu plato) {
        platosPromo.add(plato);
    }
    public void pedir(int cantidad){
        System.out.println("El pedido de: "+nombre + "[" + cantidad + "] fue realizado con exito");
        System.out.println("La promo incluye: ");
        for (ElementoMenu plato : platosPromo) {
            plato.pedir(cantidad);
        }
    }
}
