package Bridge;

public class Alerta extends Mensaje {
    public Alerta(TipoNotificacionInterface tipoMensaje) {
        super(tipoMensaje);
    }
    @Override
    public void enviarMensaje(){
        System.out.println("Alerta enviada mediante "+ tipoMensaje.usarMedio());
    }
}
