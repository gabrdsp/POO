// Questao9.java
import java.util.Scanner;

public class Questao09 {

    public static void run() {
        Scanner sc = new Scanner(System.in);

        int numero;
        int menor = Integer.MAX_VALUE;
        int maior = Integer.MIN_VALUE;

        System.out.println("Digite números positivos (digite um número negativo para encerrar):");

        while (true) {
            System.out.print("Número: ");
            numero = sc.nextInt();

            if (numero < 0) {
                break;
            }

            if (numero < menor) {
                menor = numero;
            }
            if (numero > maior) {
                maior = numero;
            }
        }

        if (menor != Integer.MAX_VALUE && maior != Integer.MIN_VALUE) {
            System.out.println("\nMenor número digitado: " + menor);
            System.out.println("Maior número digitado: " + maior);
        } else {
            System.out.println("\nNenhum número positivo foi digitado.");
        }

        sc.close();
    }
}
