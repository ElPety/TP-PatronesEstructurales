package Adapter;

public class AdaptadorImpresoras implements ImpresoraInterface {
    private ImpresoraMejorada impresoraMejorada;
    public AdaptadorImpresoras() {
        impresoraMejorada = new ImpresoraMejorada();
    }
    @Override
    public void imprimir(String fileName){
        String fileType = fileName.substring(fileName.lastIndexOf(".") + 1);
        impresoraMejorada.imprimirTextoPlano(fileName,fileType);
    }


}
