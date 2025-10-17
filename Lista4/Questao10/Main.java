package Lista4.Questao10;

public class Main {
    public static void main(String[] args) {
        ITransferencia download = new TransferenciaHTTP();

        download.iniciarDownload(100);
    }
}