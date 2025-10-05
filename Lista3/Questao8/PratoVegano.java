package Questao8;

import java.util.List;

public class PratoVegano extends Prato {
    private String certificacaoVegan;

    public PratoVegano(String nome, double preco, int tempoPreparo, List<String> ingredientes, String certificacaoVegan) {
        super(nome, preco, tempoPreparo, ingredientes);
        this.certificacaoVegan = certificacaoVegan;
    }

    @Override
    public double calcularTaxaServico() {
        return preco * 0.05;
    }

    @Override
    public void exibirCardapio() {
        System.out.println("=== PRATO VEGANO ===");
        super.exibirCardapio();
        System.out.println("Certificação Vegana: " + certificacaoVegan);
    }
}
