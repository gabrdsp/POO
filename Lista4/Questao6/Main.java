package Lista4.Questao6;

public class Main {
    public static void main(String[] args) {
        Logger logger = new Logger();

        System.out.println("=== Salvando log local ===");
        logger.salvarLocal("Erro ao carregar configuração.");

        System.out.println("\n=== Salvando log remoto ===");
        logger.salvarRemoto("Usuário autenticado com sucesso.");
    }
}