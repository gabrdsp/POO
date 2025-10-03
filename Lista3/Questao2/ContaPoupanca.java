package Questao2;

public class ContaPoupanca extends ContaBancaria {
    private double taxaRendimento; // Exemplo: 0.05 = 5%

    public ContaPoupanca(String numeroConta, String titular, double saldoInicial, double taxaRendimento) {
        super(numeroConta, titular, saldoInicial);
        this.taxaRendimento = taxaRendimento;
    }

    public void aplicarRendimento() {
        double rendimento = saldo * taxaRendimento;
        saldo += rendimento;
        System.out.println("Rendimento de R$ " + rendimento + " aplicado. Novo saldo: R$ " + saldo);
    }

    @Override
    public void consultarSaldo() {
        System.out.println("Conta Poupança - Conta: " + numeroConta + " | Titular: " + titular +
                           " | Saldo: R$ " + saldo + " | Taxa Rendimento: " + (taxaRendimento * 100) + "%");
    }
}