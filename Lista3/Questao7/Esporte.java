package Questao7;

public class Esporte {
    protected String nome;
    protected int numeroJogadores;
    protected double duracaoPartida;
    protected String popularidade;

    public Esporte(String nome, int numeroJogadores, double duracaoPartida, String popularidade) {
        this.nome = nome;
        this.numeroJogadores = numeroJogadores;
        this.duracaoPartida = duracaoPartida;
        this.popularidade = popularidade;
    }

    public double calcularCustoEquipamento() {
        return 500.00; 
    }

    public void exibirRegras() {
        System.out.println("Esporte: " + nome);
        System.out.println("Número de jogadores: " + numeroJogadores);
        System.out.println("Duração da partida: " + duracaoPartida + " minutos");
        System.out.println("Popularidade: " + popularidade);
        System.out.println("Custo de equipamento: R$ " + calcularCustoEquipamento());
    }
}
