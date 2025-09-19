package Bridge;

public class Email implements TipoNotificacionInterface {
    @Override
    public String usarMedio(){
        System.out.println("Enviando email");
        return "Email";
    }
}
