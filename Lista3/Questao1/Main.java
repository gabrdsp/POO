package Questao1;

public class Main {
    public static void main(String[] args) {
        Veiculo carro = new Veiculo("Toyota", "Corolla", 2020, 90000);
        Moto moto = new Moto("Honda", "CB 500", 2021, 35000, 500);
        Caminhao caminhao = new Caminhao("Volvo", "FH 540", 2019, 450000, 25);

        System.out.println("=== Carro ===");
        carro.exibirDetalhes();

        System.out.println("\n=== Moto ===");
        moto.exibirDetalhes();

        System.out.println("\n=== Caminhão ===");
        caminhao.exibirDetalhes();
    }
}
