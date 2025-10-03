package Questao2;

public class Main {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente("12345", "João", 1000, 500);
        ContaPoupanca cp = new ContaPoupanca("67890", "Maria", 2000, 0.05);

        System.out.println("=== Conta Corrente ===");
        cc.consultarSaldo();
        cc.sacar(1200);
        cc.consultarSaldo();
        cc.depositar(300);
        cc.consultarSaldo();

        System.out.println("\n=== Conta Poupança ===");
        cp.consultarSaldo();
        cp.aplicarRendimento();
        cp.consultarSaldo();
    }
}