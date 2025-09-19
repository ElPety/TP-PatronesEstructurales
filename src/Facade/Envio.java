package Facade;
import java.time.LocalDate;


public class Envio {
    private String direccion;
    private LocalDate fechaLlegadaEstimada;
    private LocalDate fechaPedido;
    public Envio(String direccion) {
        this.direccion = direccion;
        this.fechaPedido = LocalDate.now();
        this.fechaLlegadaEstimada = LocalDate.now().plusDays(15);
    }
    public void enviar(int id) {
        System.out.println("Envio del carrito "+ id +" procesado correctamente. Fecha de entrega estimada: " + this.fechaLlegadaEstimada);
    }
}
