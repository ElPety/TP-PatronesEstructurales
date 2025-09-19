package Adapter;

public class ImpresoraMejorada {
    void imprimirTextoPlano(String fileName, String fileType) {
        if (fileType.equalsIgnoreCase("txt")) {
            System.out.println("Imprimindo texto plano del archivo: " + fileName);
        }else {
            System.out.println("Tipo de archivo incompatible");
        }
    }

}
