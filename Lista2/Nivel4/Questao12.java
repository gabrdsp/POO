// Questao12.java
import java.util.Scanner;

public class Questao12 {

    public static void run() {
        Scanner sc = new Scanner(System.in);
        String resposta;

        do {
            System.out.print("Digite o índice de poluição (0,0 para encerrar): ");
            double indice = sc.nextDouble();

            if (indice == 0.0) {
                System.out.println("Encerrando programa...");
                break;
            }

            if (indice >= 0.05 && indice <= 0.25) {
                System.out.println("Índice dentro do aceitável.");
            } else if (indice >= 0.30 && indice < 0.40) {
                System.out.println("Notificação: Indústrias do 1º grupo devem suspender suas atividades!");
            } else if (indice >= 0.40 && indice < 0.50) {
                System.out.println("Notificação: Indústrias do 1º e 2º grupos devem suspender suas atividades!");
            } else if (indice >= 0.50) {
                System.out.println("Notificação: Todos os grupos devem paralisar suas atividades!");
            } else {
                System.out.println("Índice inválido! Digite um valor positivo.");
            }

            System.out.print("Deseja encerrar o programa? (S/N): ");
            resposta = sc.next();

        } while (!resposta.equalsIgnoreCase("S"));

        System.out.println("Programa finalizado.");
    }
}
