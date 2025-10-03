package Questao4;

public class Main {
    public static void main(String[] args) {
        Imovel imovel = new Imovel("Rua A, 123", 80.5, 2, 250000);
        Apartamento apto = new Apartamento("Av. Central, 456", 60.0, 2, 200000, 5, 500);
        Casa casa = new Casa("Rua das Flores, 789", 120.0, 3, 350000, 50.0, true);

        System.out.println("--- Detalhes Imóvel ---");
        imovel.exibirCaracteristicas();
        System.out.println();

        System.out.println("--- Detalhes Apartamento ---");
        apto.exibirCaracteristicas();
        System.out.println();

        System.out.println("--- Detalhes Casa ---");
        casa.exibirCaracteristicas();
    }
}
