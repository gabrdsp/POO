package Questao5;

public class Smartphone extends ProdutoEletronico {
    private double tamanhoTela;
    private int capacidadeBateria;

    public Smartphone(String marca, String modelo, double preco, String voltagem, double tamanhoTela, int capacidadeBateria) {
        super(marca, modelo, preco, voltagem);
        this.tamanhoTela = tamanhoTela;
        this.capacidadeBateria = capacidadeBateria;
    }

    @Override
    public double calcularGarantiaEstendida() {
        return preco * 0.20;
    }

    @Override
    public void exibirEspecificacoes() {
        System.out.println("=== Smartphone ===");
        super.exibirEspecificacoes();
        System.out.println("Tamanho da Tela: " + tamanhoTela + " polegadas");
        System.out.println("Capacidade da Bateria: " + capacidadeBateria + " mAh");
    }
}
