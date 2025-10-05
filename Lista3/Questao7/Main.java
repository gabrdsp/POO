package Questao7;

public class Main {
    public static void main(String[] args) {
        Futebol futebol = new Futebol("Futebol", 11, 90, "Muito popular", 105.0);
        Basquete basquete = new Basquete("Basquete", 5, 48, "Popular", 3.05);

        futebol.exibirRegras();
        basquete.exibirRegras();
    }
}