package Lista4.Questao10;

public class TransferenciaHTTP implements ITransferencia {

    @Override
    public void iniciarDownload(int tamanhoTotal) {
        int bytesRecebidos = 0;
        boolean continuar = true;

        System.out.println("Iniciando download HTTP de " + tamanhoTotal + " bytes...\n");

        while (bytesRecebidos < tamanhoTotal && continuar) {
            bytesRecebidos += 10; 
            System.out.println("Progresso: " + bytesRecebidos + " / " + tamanhoTotal + " bytes");

            if (bytesRecebidos >= tamanhoTotal / 2 && continuar) {
                continuar = false;
                System.out.println("\nDownload Pausado Automaticamente.\n");
            }
        }

        if (bytesRecebidos >= tamanhoTotal) {
            System.out.println("Download Completo!");
        } else {
            System.out.println("⏸Download Pausado/Interrompido.");
        }
    }
}