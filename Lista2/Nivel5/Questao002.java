// Questao2.java
import java.util.Scanner;

public class Questao002 {

    public static void run() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tamanho dos vetores: ");
        int n = sc.nextInt();

        int[] x = new int[n];
        int[] y = new int[n];

        System.out.println("Digite os elementos do vetor X:");
        for (int i = 0; i < n; i++) {
            System.out.print("X[" + i + "]: ");
            x[i] = sc.nextInt();
        }

        System.out.println("\nDigite os elementos do vetor Y:");
        for (int i = 0; i < n; i++) {
            System.out.print("Y[" + i + "]: ");
            y[i] = sc.nextInt();
        }

        int produtoEscalar = 0;
        for (int i = 0; i < n; i++) {
            produtoEscalar += x[i] * y[i];
        }

        System.out.println("\nProduto escalar dos vetores X e Y: " + produtoEscalar);
    }
}
