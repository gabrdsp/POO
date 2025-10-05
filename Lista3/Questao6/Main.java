package Questao6;

public class Main {
    public static void main(String[] args) {
        Filme filme = new Filme("O Senhor dos Anéis", 2001, 3.5, 35.99, "Peter Jackson", "Fantasia");
        Serie serie = new Serie("Breaking Bad", 2008, 50.0, 29.99, 5, 13);

        filme.exibirInfo();
        serie.exibirInfo();
    }
}
