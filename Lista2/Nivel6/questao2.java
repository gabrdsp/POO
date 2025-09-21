// Questao2.java
import java.util.Scanner;

public class questao2 {

    public static String VERIFICA(int n) {
        if (n % 2 == 0) {
            return "Par";
        } else {
            return "Ímpar";
        }
    }

    public static void run() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();

        String resultado = VERIFICA(numero);

        System.out.println("\nO número " + numero + " é: " + resultado);
    }
}
