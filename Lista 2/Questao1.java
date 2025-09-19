// Questao1.java
import java.util.Scanner;

public class Questao1 {

    public static void run() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha a operação: ");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");

        int opcao = sc.nextInt();

        System.out.print("Digite o primeiro número: ");
        double n1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        double n2 = sc.nextDouble();

        double resultado = 0;

        switch (opcao) {
            case 1:
                resultado = n1 + n2;
                System.out.println("Resultado da Adição: " + resultado);
                break;
            case 2:
                resultado = n1 - n2;
                System.out.println("Resultado da Subtração: " + resultado);
                break;
            case 3:
                resultado = n1 * n2;
                System.out.println("Resultado da Multiplicação: " + resultado);
                break;
            case 4:
                if (n2 != 0) {
                    resultado = n1 / n2;
                    System.out.println("Resultado da Divisão: " + resultado);
                } else {
                    System.out.println("Não é possível a divisão por zero.");
                }
                break;
            default:
                System.out.println("Opção inválida!");
        }

        sc.close();
    }
}
