package Questao9;

public class Main {
    public static void main(String[] args) {
        LivroDidatico livro1 = new LivroDidatico(
                "Matemática Essencial",
                "Helena Alves",
                2020,
                89.90,
                "Matemática"
        );

        LivroRaro livro2 = new LivroRaro(
                "Percy Jackson e o Ladrão de Raios - Edição de Aniversário",
                "Rick Riordan",
                2023,
                1500.00,
                true
        );

        livro1.exibirFichaCatalografica();
        System.out.println("Multa por 3 dias de atraso: R$ " + livro1.calcularMultaAtraso(3));
        System.out.println();

        livro2.exibirFichaCatalografica();
        System.out.println("Multa por 3 dias de atraso: R$ " + livro2.calcularMultaAtraso(3));
    }
}
