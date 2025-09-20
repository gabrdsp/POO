// Questao6.java
import java.util.Scanner;
import java.util.Random;

public class Questao006 {

    public static void run() {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int numeroSorteado = random.nextInt(101); 
        int tentativa;
        int tentativas = 0;

        System.out.println("Jogo da adivinhação: tente acertar o número de 0 a 100!");

        do {
            System.out.print("Digite sua tentativa: ");
            tentativa = sc.nextInt();
            tentativas++;

            if (tentativa < numeroSorteado) {
                System.out.println("O número sorteado é MAIOR.");
            } else if (tentativa > numeroSorteado) {
                System.out.println("O número sorteado é MENOR.");
            }
        } while (tentativa != numeroSorteado);

        System.out.println("\nParabéns! Você acertou o número " 
                        + numeroSorteado 
                        + " em " + tentativas + " tentativas.");
    }
}