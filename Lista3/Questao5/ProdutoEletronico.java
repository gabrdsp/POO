package Questao5;

public class ProdutoEletronico {
    protected String marca;
    protected String modelo;
    protected double preco;
    protected String voltagem;

    public ProdutoEletronico(String marca, String modelo, double preco, String voltagem) {
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
        this.voltagem = voltagem;
    }

    public double calcularGarantiaEstendida() {
        return preco * 0.15;
    }

    public void exibirEspecificacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Voltagem: " + voltagem);
        System.out.println("Garantia Estendida: R$ " + calcularGarantiaEstendida());
    }
}
