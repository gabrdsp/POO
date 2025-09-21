// Questao3.java
import java.util.Scanner;

public class questao3 {

    static int[] vetor = new int[0]; 

    // 1 - Carregar Vetor
    public static void carregarVetor(Scanner sc) {
        System.out.print("Digite o tamanho do vetor: ");
        int n = sc.nextInt();
        vetor = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Vetor[" + i + "]: ");
            vetor[i] = sc.nextInt();
        }
        System.out.println("Vetor carregado com sucesso!\n");
    }

    // 2 - Listar Vetor
    public static void listarVetor() {
        if (vetor.length == 0) {
            System.out.println("Vetor vazio! Carregue primeiro.\n");
            return;
        }
        System.out.print("Vetor: ");
        for (int v : vetor) {
            System.out.print(v + " ");
        }
        System.out.println("\n");
    }

    // 3 - Exibir apenas números pares
    public static void exibirPares() {
        if (vetor.length == 0) {
            System.out.println("Vetor vazio!\n");
            return;
        }
        System.out.print("Números pares: ");
        for (int v : vetor) {
            if (v % 2 == 0) {
                System.out.print(v + " ");
            }
        }
        System.out.println("\n");
    }

    // 4 - Exibir apenas números ímpares
    public static void exibirImpares() {
        if (vetor.length == 0) {
            System.out.println("Vetor vazio!\n");
            return;
        }
        System.out.print("Números ímpares: ");
        for (int v : vetor) {
            if (v % 2 != 0) {
                System.out.print(v + " ");
            }
        }
        System.out.println("\n");
    }

    // 5 - Quantidade de números pares nas posições ímpares
    public static void paresEmPosicoesImpares() {
        if (vetor.length == 0) {
            System.out.println("Vetor vazio!\n");
            return;
        }
        int count = 0;
        for (int i = 1; i < vetor.length; i += 2) {
            if (vetor[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println("Quantidade de números pares em posições ímpares: " + count + "\n");
    }

    // 6 - Quantidade de números ímpares nas posições pares
    public static void imparesEmPosicoesPares() {
        if (vetor.length == 0) {
            System.out.println("Vetor vazio!\n");
            return;
        }
        int count = 0;
        for (int i = 0; i < vetor.length; i += 2) {
            if (vetor[i] % 2 != 0) {
                count++;
            }
        }
        System.out.println("Quantidade de números ímpares em posições pares: " + count + "\n");
    }

    public static void run() {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Opções Disponíveis:");
            System.out.println("1 - Carregar Vetor");
            System.out.println("2 - Listar Vetor");
            System.out.println("3 - Exibir apenas os números pares do vetor");
            System.out.println("4 - Exibir apenas os números ímpares do vetor");
            System.out.println("5 - Exibir a quantidade de números pares nas posições ímpares");
            System.out.println("6 - Exibir a quantidade de números ímpares nas posições pares");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    carregarVetor(sc);
                    break;
                case 2:
                    listarVetor();
                    break;
                case 3:
                    exibirPares();
                    break;
                case 4:
                    exibirImpares();
                    break;
                case 5:
                    paresEmPosicoesImpares();
                    break;
                case 6:
                    imparesEmPosicoesPares();
                    break;
                case 0:
                    System.out.println("Saindo...\n");
                    break;
                default:
                    System.out.println("Opção inválida!\n");
            }
        } while (opcao != 0);
    }
}
