package Questao7;

public class Basquete extends Esporte {
    private double alturaCesta;

    public Basquete(String nome, int numeroJogadores, double duracaoPartida, String popularidade, double alturaCesta) {
        super(nome, numeroJogadores, duracaoPartida, popularidade);
        this.alturaCesta = alturaCesta;
    }

    @Override
    public double calcularCustoEquipamento() {
        return 400.00;
    }

    @Override
    public void exibirRegras() {
        System.out.println("=== BASQUETE ===");
        super.exibirRegras();
        System.out.println("Altura da cesta: " + alturaCesta + " metros");
    }
}
