package Questao3;

public class Main {
    public static void main(String[] args) {
        CursoPresencial cursoPresencial = new CursoPresencial(
            "Java Básico", 40, 800, "Básico", "São Paulo - SP"
        );

        CursoOnline cursoOnline = new CursoOnline(
            "Java Avançado", 60, 1200, "Avançado", "Udemy"
        );

        cursoPresencial.exibirInformacoes();
        System.out.println();
        cursoOnline.exibirInformacoes();
    }
}
