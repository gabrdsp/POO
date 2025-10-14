package Lista4.Questao1;

public class Fatura implements IImprimivel {
    private String descricao;
    private double valor;

    public Fatura(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    @Override
    public void imprimir(int copias) {
        if (copias > 5) {
            System.out.println("Imprimindo " + copias + " cópias em modo rascunho.");
        } else {
            System.out.println("Imprimindo " + copias + " cópias em modo alta qualidade.");
        }

        System.out.println("Fatura: " + descricao + " | Valor: R$ " + valor);
    }
}
