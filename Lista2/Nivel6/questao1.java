// Questao1.java
import java.util.Scanner;

public class questao1 {

    public static double REAJUSTE(double salario, double indice) {
        return salario + (salario * indice / 100.0);
    }

    public static void run() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o salário atual: ");
        double salario = sc.nextDouble();

        System.out.print("Digite o índice de reajuste (%): ");
        double indice = sc.nextDouble();

        double salarioReajustado = REAJUSTE(salario, indice);

        System.out.printf("\nSalário reajustado: R$ %.2f\n", salarioReajustado);
    }
}
