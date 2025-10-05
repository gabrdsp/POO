package Questao10;

public class Main {
    public static void main(String[] args) {
        Onibus onibus = new Onibus(45, 120.0, 3.5, 350000.0, 3);
        Metro metro = new Metro(300, 90.0, 8.0, 1200000.0, true);

        double distancia = 150.0;

        onibus.exibirDados();
        System.out.println("Custo da viagem de " + distancia + " km: R$ " + onibus.calcularCustoViagem(distancia));
        System.out.println();

        metro.exibirDados();
        System.out.println("Custo da viagem de " + distancia + " km: R$ " + metro.calcularCustoViagem(distancia));
    }
}
