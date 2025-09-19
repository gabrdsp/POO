// Questao6.java
import java.util.Scanner;

public class Questao06 {

    public static void run() {
        Scanner sc = new Scanner(System.in);

        int somaPares = 0;
        int somaImpares = 0;

        System.out.println("Digite números positivos (um número negativo encerra o programa):");

        while (true) {
            int n = sc.nextInt();

            if (n < 0) {
                break;
            }

            if (n % 2 == 0) {
                System.out.println(n + " é PAR");
                somaPares += n;
            } else {
                System.out.println(n + " é ÍMPAR");
                somaImpares += n;
            }
        }

        System.out.println("\nPreparando para encerrar o programa...");
        System.out.println("Soma dos números pares: " + somaPares);
        System.out.println("Soma dos números ímpares: " + somaImpares);

        sc.close();
    }
}
