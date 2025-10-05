package Questao5;

public class Main {
    public static void main(String[] args) {
        ProdutoEletronico produto = new ProdutoEletronico("Sony", "SoundBox", 800.0, "Bivolt");
        Smartphone celular = new Smartphone("Samsung", "Galaxy S22", 3500.0, "Bivolt", 6.5, 4500);
        Notebook notebook = new Notebook("Dell", "Inspiron 15", 4500.0, "Bivolt", "Intel i7", 16);

        System.out.println("--- Produto Eletrônico ---");
        produto.exibirEspecificacoes();
        System.out.println();

        System.out.println("--- Smartphone ---");
        celular.exibirEspecificacoes();
        System.out.println();

        System.out.println("--- Notebook ---");
        notebook.exibirEspecificacoes();
    }
}
