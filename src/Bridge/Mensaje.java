package Bridge;

abstract public class Mensaje {
    protected TipoNotificacionInterface tipoMensaje;
    public Mensaje(TipoNotificacionInterface tipoMensaje) {
        this.tipoMensaje = tipoMensaje;
    }
    abstract public void enviarMensaje();
}
