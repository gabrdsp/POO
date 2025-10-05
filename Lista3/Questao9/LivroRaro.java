package Questao9;

public class LivroRaro extends Livro {
    private boolean edicaoLimitada;

    public LivroRaro(String titulo, String autor, int anoPublicacao, double preco, boolean edicaoLimitada) {
        super(titulo, autor, anoPublicacao, preco);
        this.edicaoLimitada = edicaoLimitada;
    }

    @Override
    public double calcularMultaAtraso(int diasAtraso) {
        return diasAtraso * 5.0; // 5 reais por dia
    }

    @Override
    public void exibirFichaCatalografica() {
        System.out.println("=== LIVRO RARO ===");
        super.exibirFichaCatalografica();
        System.out.println("Edição Limitada: " + (edicaoLimitada ? "Sim" : "Não"));
    }
}
