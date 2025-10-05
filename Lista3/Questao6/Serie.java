package Questao6;

public class Serie extends Midia {
    private int numeroTemporadas;
    private int episodiosPorTemporada;

    public Serie(String titulo, int anoLancamento, double duracao, double preco, int numeroTemporadas, int episodiosPorTemporada) {
        super(titulo, anoLancamento, duracao, preco);
        this.numeroTemporadas = numeroTemporadas;
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    @Override
    public double calcularPrecoAluguel() {
        return preco * 0.12;
    }

    @Override
    public void exibirInfo() {
        System.out.println("=== SÉRIE ===");
        super.exibirInfo();
        System.out.println("Temporadas: " + numeroTemporadas);
        System.out.println("Episódios por temporada: " + episodiosPorTemporada);
    }
}
