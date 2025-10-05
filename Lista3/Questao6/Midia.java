package Questao6;

public class Midia {
    protected String titulo;
    protected int anoLancamento;
    protected double duracao;
    protected double preco;

    public Midia(String titulo, int anoLancamento, double duracao, double preco) {
        this.titulo = titulo;
        this.anoLancamento = anoLancamento;
        this.duracao = duracao;
        this.preco = preco;
    }

    public double calcularPrecoAluguel() {
        return preco * 0.10;
    }

    public void exibirInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Ano de lançamento: " + anoLancamento);
        System.out.println("Duração: " + duracao + " horas");
        System.out.println("Preço: R$ " + preco);
        System.out.println("Preço do aluguel: R$ " + calcularPrecoAluguel());
    }
}
