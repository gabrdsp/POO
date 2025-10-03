package Questao3;

public class CursoPresencial extends Curso {
    private String local;

    public CursoPresencial(String nome, int cargaHoraria, double preco, String nivel, String local) {
        super(nome, cargaHoraria, preco, nivel);
        this.local = local;
    }

    @Override
    public double calcularDesconto() {
        return preco * 0.05;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("=== Curso Presencial ===");
        super.exibirInformacoes();
        System.out.println("Local: " + local);
        System.out.println("Desconto Presencial: R$ " + calcularDesconto());
    }
}
