package Lista4.Questao2;

public abstract class Funcionario {
  protected String nome;
  protected int codigoCargo;
  protected double salarioBase;

  public Funcionario(String nome, int codigoCargo, double salarioBase) {
    this.nome = nome;
    this.codigoCargo = codigoCargo;
    this.salarioBase = salarioBase;
  }

  public abstract double calcularBonificacao();

  public void exibirDados() {
    System.out.println("Nome: " + nome);
    System.out.println("Código do Cargo: " + codigoCargo);
    System.out.println("Salário Base: R$ " + salarioBase);
    System.out.println("Bônus anual: " + calcularBonificacao());
  }
}