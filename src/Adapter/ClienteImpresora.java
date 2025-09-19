package Adapter;

public class ClienteImpresora implements ImpresoraInterface{
    private ImpresoraInterface impresora;

    public ClienteImpresora(){
    }

    @Override
    public void imprimir(String fileName) {
        String fileType = fileName.substring(fileName.lastIndexOf(".") + 1);
        switch (fileType) {
            case "pdf":
                this.impresora = new ImpresoraPDF();
                break;
            case "txt":
                this.impresora = new AdaptadorImpresoras();
                break;
        }
        impresora.imprimir(fileName);
    }
}
