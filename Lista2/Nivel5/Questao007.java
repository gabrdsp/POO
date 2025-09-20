// Questao7.java
import java.util.Scanner;

public class Questao007 {

    public static void run() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o 1º caractere (A-Z): ");
        char c1 = sc.next().toLowerCase().charAt(0);

        System.out.print("Digite o 2º caractere (A-Z): ");
        char c2 = sc.next().toLowerCase().charAt(0);

        if (c1 < 'a' || c1 > 'z' || c2 < 'a' || c2 > 'z') {
            System.out.println("Erro: os caracteres devem estar entre A e Z.");
            return;
        }

        if (c1 >= c2) {
            System.out.println("Erro: o primeiro caractere deve vir antes do segundo na ordem alfabética.");
            return;
        }

        int distancia = (c2 - c1) - 1;

        System.out.println("\n" + c1 + " " + c2 + 
            " → O número de caracteres entre eles é: " + distancia);
    }
}
