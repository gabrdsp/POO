// Questao1.java
import java.util.Scanner;

public class Questao001 {

    public static void run() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números deseja digitar? ");
        int n = sc.nextInt();

        int[] numeros = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("\nNúmeros na ordem inversa:");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();
    }
}
