package Questao2;

public class ContaCorrente extends ContaBancaria {
    private double limiteChequeEspecial;

    public ContaCorrente(String numeroConta, String titular, double saldoInicial, double limiteChequeEspecial) {
        super(numeroConta, titular, saldoInicial);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0 && valor <= (saldo + limiteChequeEspecial)) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso (cheque especial disponível).");
        } else {
            System.out.println("Saldo + Cheque Especial insuficientes ou valor inválido.");
        }
    }

    @Override
    public void consultarSaldo() {
        System.out.println("Conta Corrente - Conta: " + numeroConta + " | Titular: " + titular + 
                           " | Saldo: R$ " + saldo + " | Limite Cheque Especial: R$ " + limiteChequeEspecial);
    }
}