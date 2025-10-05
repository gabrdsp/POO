package Questao7;

public class Futebol extends Esporte {
    private double tamanhoCampo;

    public Futebol(String nome, int numeroJogadores, double duracaoPartida, String popularidade, double tamanhoCampo) {
        super(nome, numeroJogadores, duracaoPartida, popularidade);
        this.tamanhoCampo = tamanhoCampo;
    }

    @Override
    public double calcularCustoEquipamento() {
        return 300.00;
    }

    @Override
    public void exibirRegras() {
        System.out.println("=== FUTEBOL ===");
        super.exibirRegras();
        System.out.println("Tamanho do campo: " + tamanhoCampo + " metros");
    }
}
