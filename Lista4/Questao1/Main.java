package Lista4.Questao1;

public class Main {
    public static void main(String[] args) {
        Fatura fatura1 = new Fatura("Serviço de manutenção", 350.00);
        Fatura fatura2 = new Fatura("Compra de materiais", 1200.00);

        fatura1.imprimir(3); 
        fatura2.imprimir(7);
    }
}
