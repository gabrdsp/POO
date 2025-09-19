// Questao2.java
import java.util.Scanner;

public class Questao2 {

    public static void run() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int n1 = sc.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int n2 = sc.nextInt();

        System.out.println("Escolha a operação: ");
        System.out.println("1 - Verificar se um dos números é múltiplo do outro");
        System.out.println("2 - Verificar se os dois números são pares");
        System.out.println("3 - Verificar se a média dos dois números é >= 7");
        System.out.println("4 - Sair");
        System.out.print("Escolha uma opção: ");

        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                if (n1 % n2 == 0 || n2 % n1 == 0) {
                    System.out.println("Um dos números é múltiplo do outro.");
                } else {
                    System.out.println("Nenhum dos números é múltiplo do outro.");
                }
                break;

            case 2:
                if (n1 % 2 == 0 && n2 % 2 == 0) {
                    System.out.println("Os dois números são pares.");
                } else {
                    System.out.println("Nem todos os números são pares.");
                }
                break;

            case 3:
                double media = (n1 + n2) / 2.0;
                if (media >= 7) {
                    System.out.println("A média (" + media + ") é maior ou igual a 7.");
                } else {
                    System.out.println("A média (" + media + ") é menor que 7.");
                }
                break;

            case 4:
                System.out.println("Saindo...");
                break;

            default:
                System.out.println("Opção inválida!");
        }

        sc.close();
    }
}
