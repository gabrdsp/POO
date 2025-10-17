package Lista4.Questao9;

public class Main {
    public static void main(String[] args) {

        ProdutoAlimenticio arroz = new ProdutoAlimenticio(10);

        // Testes de disponibilidade
        System.out.println("Solicitando 12 unidades:");
        arroz.verificarDisponibilidade(12);  

        System.out.println("\nSolicitando 10 unidades:");
        arroz.verificarDisponibilidade(10);  

        System.out.println("\nSolicitando 5 unidades:");
        arroz.verificarDisponibilidade(5); 
    }
}