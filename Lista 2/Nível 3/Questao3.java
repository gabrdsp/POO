// Questao3.java
import java.util.Locale;
import java.util.Scanner;

public class Questao3 {

    public static void run() {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US); // <- aceita ponto como separador decimal

        System.out.println("Cálculo do Peso Ideal");
        System.out.print("Digite sua altura (em metros, ex: 1.75): ");
        double altura = sc.nextDouble();

        System.out.print("Digite seu sexo (M para masculino, F para feminino): ");
        char sexo = sc.next().toUpperCase().charAt(0);

        double pesoIdeal;

        if (sexo == 'M') {
            pesoIdeal = (72.7 * altura) - 58;
            System.out.println("Seu peso ideal é: " + pesoIdeal + " kg");
        } else if (sexo == 'F') {
            pesoIdeal = (62.1 * altura) - 44;
            System.out.println("Seu peso ideal é: " + pesoIdeal + " kg");
        } else {
            System.out.println("Sexo inválido! Digite apenas M ou F.");
        }

        sc.close();
    }
}