// Questao11.java
import java.util.Scanner;

public class Questao11 {

    public static void run() {
        Scanner sc = new Scanner(System.in);

        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int soma = 0;

        System.out.println("Digite 10 valores inteiros e positivos:");

        for (int i = 1; i <= 10; i++) {
            int valor;

            do {
                System.out.print("Valor " + i + ": ");
                valor = sc.nextInt();
                if (valor <= 0) {
                    System.out.println("Por favor, digite apenas valores positivos!");
                }
            } while (valor <= 0);

            if (valor > maior) {
                maior = valor;
            }
            if (valor < menor) {
                menor = valor;
            }

            soma += valor;
        }

        double media = soma / 10.0;

        System.out.println("\nMaior valor: " + maior);
        System.out.println("Menor valor: " + menor);
        System.out.println("Média dos valores: " + media);
    }
}
