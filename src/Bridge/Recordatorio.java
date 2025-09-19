package Bridge;

public class Recordatorio extends Mensaje{
    public Recordatorio(TipoNotificacionInterface tipoMensaje){
        super(tipoMensaje);
    }
    @Override
    public void enviarMensaje(){
        System.out.println("Recordatorio enviado mediante "+ tipoMensaje.usarMedio());
    }

}
