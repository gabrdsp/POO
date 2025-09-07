import java.util.Scanner;

public class lista1 {

    public static void main(String[] args) {
        questao4();
    }

    public static void questao1() {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a quantidade mínima da sua peça: ");
        int qMinima = input.nextInt();

        System.out.print("Digite a quantidade máxima da sua peça: ");
        int qMaxima = input.nextInt();

        double qMedia = (qMinima + qMaxima) / 2;

        System.out.printf("%nO estoque médio da peça é: %.2f%n", qMedia);

        input.close();
    }

    public static void questao2() {
        Scanner input = new Scanner(System.in);

        System.out.print("Qual é a atual cotação do dólar? ");
        float cotacao = input.nextFloat();

        System.out.print("Digite o seu saldo em dólares: ");
        float saldoUSS = input.nextFloat();

        float saldoBRL = cotacao * saldoUSS;

        System.out.printf("Seu montante em dólares vale R$%f.", saldoBRL);

        input.close();
    }

    public static void questao3() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o código ID do vendedor: ");
        int idVendedor = scanner.nextInt();

        System.out.print("Informe o código do produto: ");
        int idProduto = scanner.nextInt();

        System.out.print("Informe o preço unitário do produto: ");
        float precoUnitario = scanner.nextFloat();

        System.out.print("Informe a quantidade vendida: ");
        int quantidadeVendida = scanner.nextInt();

        float valorVenda = precoUnitario * quantidadeVendida;

        System.out.printf("%nO valor total da venda do produto %d é R$ %.2f%n", idProduto, valorVenda);
        System.out.printf("Vendedor %d, sua comissão será de R$ %.2f%n", idVendedor, (valorVenda * 0.05));

        scanner.close();
    }

    public static void questao4() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor (A): ");
        int a = scanner.nextInt();

        System.out.print("Digite o segundo valor (B): ");
        int b = scanner.nextInt();

        System.out.print("Digite o terceiro valor (C): ");
        int c = scanner.nextInt();

        System.out.print("Digite o quarto valor (D): ");
        int d = scanner.nextInt();

        System.out.println("\n--- Resultados das adições ---");
        System.out.println("A + B = " + (a + b));
        System.out.println("A + C = " + (a + c));
        System.out.println("A + D = " + (a + d));
        System.out.println("B + C = " + (b + c));
        System.out.println("B + D = " + (b + d));
        System.out.println("C + D = " + (c + d));

        System.out.println("\n--- Resultados das multiplicações ---");
        System.out.println("A * B = " + (a * b));
        System.out.println("A * C = " + (a * c));
        System.out.println("A * D = " + (a * d));
        System.out.println("B * C = " + (b * c));
        System.out.println("B * D = " + (b * d));
        System.out.println("C * D = " + (c * d));

        scanner.close();
    }

    public static void questao5() {
        Scanner input = new Scanner(System.in);

        System.out.print("Quantas horas levou a viagem? ");
        float tempo = input.nextFloat();

        System.out.print("Qual era a velocidade média durante a viagem, em km/h? ");
        float velocidade = input.nextFloat();
        float distancia = tempo * velocidade;
        float litros = distancia / 12;

        System.out.printf("\nVelocidade média: %.2f km/h\n", velocidade);
        System.out.printf("Tempo total: %.2f horas.\n", tempo);
        System.out.printf("Distância total: %.2f km.\n", distancia);
        System.out.printf("Combustível gasto durante a viagem: %.2f L. \n", litros);

        input.close();
    }

    public static void questao6() {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a temperatura em Graus Celsius? ");
        float temperatura = input.nextFloat();

        System.out.printf("Essa temperatura em Fahrenheit é %.2f ºF.", ((9 * temperatura + 160) / 5));

        input.close();

    }

    public static void questao7() {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a temperatura atual em Graus Fahrenheit? ");
        float temperatura = input.nextFloat();

        System.out.printf("A temperatura em Celsius é %.2f ºC.", ((temperatura - 32) * 5 / 9));

        input.close();
    }

    public static void questao8() {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe em centímetros o raio da lata: ");
        float raio = input.nextFloat();

        System.out.print("Informe em centímetros a medida da altura da lata: ");
        float altura = input.nextFloat();

        double volume = 3.14159 * raio * raio * altura;

        System.out.printf("%nO volume da lata de óleo é: %.2f em centímetros quadrados.", volume);

        input.close();
    }

    public static void questao9() {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe sua idade em anos: ");
        int idadeAnos = input.nextInt();

        System.out.print("Informe quantos meses: ");
        int idadeMeses = input.nextInt();

        System.out.print("Informe quantos dias: ");
        int idadeDiasExtras = input.nextInt();
        
        int idadeTotalEmDias = (idadeAnos * 365) + (idadeMeses * 30) + idadeDiasExtras;

        System.out.printf("%nVocê já viveu %d dias.%n", idadeTotalEmDias);

        input.close();
    }

    public static void questao10() {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o primeiro número inteiro: ");
        int numero1 = input.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int numero2 = input.nextInt();

        System.out.println("\n--- Relacionamentos entre os números ---");

        if (numero1 == numero2) {
            System.out.println("Igual");
        } else {
            System.out.println("Não igual");
        }

        if (numero1 > numero2) {
            System.out.println("Maior");
        }

        if (numero1 < numero2) {
            System.out.println("Menor");
        }

        if (numero1 >= numero2) {
            System.out.println("Maior ou igual");
        }

        if (numero1 <= numero2) {
            System.out.println("Menor ou igual");
        }

        input.close();
    }
}
