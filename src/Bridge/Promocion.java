package Bridge;

public class Promocion extends Mensaje{
    public Promocion(TipoNotificacionInterface tipoMensaje){
        super(tipoMensaje);
    }
    @Override
    public void enviarMensaje(){
        System.out.println("Promo enviada mediante "+ tipoMensaje.usarMedio());
    }

}
