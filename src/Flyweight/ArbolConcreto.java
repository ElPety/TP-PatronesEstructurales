package Flyweight;

public class ArbolConcreto implements Arbol {
    private final String tipo;
    private final String color;
    private final String textura;

    public ArbolConcreto(String tipo, String color, String textura) {
        this.tipo = tipo;
        this.color = color;
        this.textura = textura;
    }

    @Override
    public void dibujar(int x, int y) {
        System.out.println("Dibujando " + tipo + " en (" + x + "," + y + ")");
    }
}
