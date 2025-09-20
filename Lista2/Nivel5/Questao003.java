// Questao3.java
import java.util.Scanner;

public class Questao003 {

    public static void run() {
        Scanner sc = new Scanner(System.in);

        int[] vetor = new int[10];

        System.out.println("Digite 10 números inteiros positivos:");
        for (int i = 0; i < 10; i++) {
            do {
                System.out.print("Vetor[" + i + "]: ");
                vetor[i] = sc.nextInt();
                if (vetor[i] <= 0) {
                    System.out.println("Digite apenas valores positivos maiores que zero!");
                }
            } while (vetor[i] <= 0);
        }

        int x;
        do {
            System.out.print("\nDigite o valor de X (positivo e > 0): ");
            x = sc.nextInt();
            if (x <= 0) {
                System.out.println("Digite apenas valores positivos maiores que zero!");
            }
        } while (x <= 0);

        int maiores = 0, menores = 0, iguais = 0;

        for (int valor : vetor) {
            if (valor > x) {
                maiores++;
            } else if (valor < x) {
                menores++;
            } else {
                iguais++;
            }
        }

        System.out.println("\nResultados:");
        System.out.println("Maiores que X: " + maiores);
        System.out.println("Menores que X: " + menores);
        System.out.println("Iguais a X: " + iguais);
    }
}
