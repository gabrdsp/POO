package Questao8;

import java.util.List;

public class Prato {
    protected String nome;
    protected double preco;
    protected int tempoPreparo;
    protected List<String> ingredientes;

    public Prato(String nome, double preco, int tempoPreparo, List<String> ingredientes) {
        this.nome = nome;
        this.preco = preco;
        this.tempoPreparo = tempoPreparo;
        this.ingredientes = ingredientes;
    }

    public double calcularTaxaServico() {
        return preco * 0.10;
    }

    public void exibirCardapio() {
        System.out.println("Prato: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Tempo de preparo: " + tempoPreparo + " minutos");
        System.out.println("Ingredientes: " + String.join(", ", ingredientes));
        System.out.println("Taxa de serviço: R$ " + calcularTaxaServico());
    }
}
