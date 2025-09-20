// Questao5.java - Nível 5
import java.util.Scanner;

public class Questao005 {

    public static void run() {
        Scanner sc = new Scanner(System.in);

        int N;
        do {
            System.out.print("Digite o tamanho dos vetores (máx 50): ");
            N = sc.nextInt();
            if (N <= 0 || N > 50) {
                System.out.println("Valor inválido! Digite entre 1 e 50.");
            }
        } while (N <= 0 || N > 50);

        int[] V1 = new int[N];
        int[] V2 = new int[N];

        System.out.println("\nDigite os elementos do vetor V1:");
        for (int i = 0; i < N; i++) {
            System.out.print("V1[" + i + "]: ");
            V1[i] = sc.nextInt();
        }

        System.out.println("\nDigite os elementos do vetor V2:");
        for (int i = 0; i < N; i++) {
            System.out.print("V2[" + i + "]: ");
            V2[i] = sc.nextInt();
        }

        int iguais = 0;
        for (int i = 0; i < N; i++) {
            if (V1[i] == V2[i]) {
                iguais++;
            }
        }

        System.out.println("\nQuantidade de posições com valores idênticos: " + iguais);
    }
}
