import java.util.Scanner;

public class lista1 {

    public static void main(String[] args) {
        questao1();
    }

    public static void questao1() {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a quantidade mínima da sua peça: ");
        int qMinima = input.nextInt();

        System.out.print("Digite a quantidade máxima da sua peça: ");
        int qMaxima = input.nextInt();

        double qMedia = (qMinima + qMaxima)/2;

        System.out.printf("%nO estoque médio da peça é: %.2f%n", qMedia);

        input.close();
    }

    public static void questao2(){
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
}
