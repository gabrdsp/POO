// Questao2.java
import java.util.Scanner;

public class Questao02 {

    public static void run() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de números a processar: ");
        int qtd = sc.nextInt();

        for (int i = 1; i <= qtd; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int n = sc.nextInt();

            long fatorial = 1;
            for (int j = 1; j <= n; j++) {
                fatorial *= j;
            }

            System.out.println("Fatorial de " + n + " = " + fatorial);
        }

        sc.close();
    }
}
