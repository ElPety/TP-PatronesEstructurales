package Bridge;

public class Sms implements TipoNotificacionInterface {
    @Override
    public String usarMedio(){
        System.out.println("Enviando SMS");
        return "SMS";
    }
}
