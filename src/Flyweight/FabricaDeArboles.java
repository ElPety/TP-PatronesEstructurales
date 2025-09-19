package Flyweight;

import java.util.HashMap;
import java.util.Map;

public class FabricaDeArboles {
    private final Map<String, Arbol> arboles = new HashMap<>();

    public Arbol obtenerArbol(String tipo, String color, String textura) {
        String clave = tipo + "-" + color + "-" + textura;
        Arbol arbol = arboles.get(clave);

        if (arbol == null) {
            arbol = new ArbolConcreto(tipo, color, textura);
            arboles.put(clave, arbol);
        }
        return arbol;
    }

    public int getCantidadArboles() {
        return arboles.size();
    }
}
