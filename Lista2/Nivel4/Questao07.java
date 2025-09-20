// Questao7.java
import java.util.Scanner;

public class Questao07 {

    public static void run() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número entre 1 e 9: ");
        int inicio = sc.nextInt();

        if (inicio <= 0 || inicio >= 10) {
            System.out.println("Número inválido! Deve ser maior que 0 e menor que 10.");
            sc.close();
            return;
        }

        int contador = 0;
        int numeroAtual = inicio;
        long somaQuadrados = 0;

        System.out.println("Calculando os 20 primeiros números ímpares a partir de " + inicio + ":");

        while (contador < 20) {
            if (numeroAtual % 2 != 0) {
                somaQuadrados += (numeroAtual * numeroAtual);
                contador++;
                System.out.println(numeroAtual + "² = " + (numeroAtual * numeroAtual));
            }
            numeroAtual++;
        }

        System.out.println("\nSoma dos quadrados dos 20 primeiros ímpares = " + somaQuadrados);

        sc.close();
    }
}
