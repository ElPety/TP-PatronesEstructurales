package Proxy;

import java.util.ArrayList;

public class ArchivoProxy implements Archivo {
    private ArchivoReal archivo;
    private String nombreUsuario;
    private String nombreArchivo;
    private ArrayList<String> usuariosPermitidos = new ArrayList<>();


    public ArchivoProxy(String nombreUsuario, String nombreArchivo) {
        this.nombreUsuario=nombreUsuario;
        this.nombreArchivo=nombreArchivo;
    }
    public void leerArchivo(){
        if(this.getUsuariosPermitidos().contains(nombreUsuario)){
            archivo = new ArchivoReal(this.nombreArchivo);
            archivo.leerArchivo();
        }else {
            System.out.println("No se tiene permisos para leer el archivo");
        }
    }

    public ArrayList<String> getUsuariosPermitidos() {
        usuariosPermitidos.add("Mati");
        return usuariosPermitidos;
    }
}
