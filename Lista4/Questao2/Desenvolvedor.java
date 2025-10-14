package Lista4.Questao2;

public class Desenvolvedor extends Funcionario {

    public Desenvolvedor(String nome, int codigoCargo, double salarioBase) {
        super(nome, codigoCargo, salarioBase);
    }

    @Override
    public double calcularBonificacao() {
        double bonus;

        switch (codigoCargo) {
            case 1: // Desenvolvedor Júnior
                bonus = salarioBase * 0.10;
                break;
            case 2: // Desenvolvedor Pleno
                bonus = salarioBase * 0.15;
                break;
            case 3: // Desenvolvedor Sênior
                bonus = salarioBase * 0.20;
                break;
            default: // Outros cargos
                bonus = salarioBase * 0.05;
                break;
        }

        return bonus;
    }
}
