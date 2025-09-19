package Adapter;



public class ImpresoraPDF implements ImpresoraInterface{
    @Override
    public void imprimir(String fileName){
        System.out.println("Imprimiendo el documento: "+ fileName);
    }
}
