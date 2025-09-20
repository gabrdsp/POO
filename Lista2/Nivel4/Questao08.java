// Questao8.java
import java.util.Scanner;

public class Questao08 {

    public static void run() {
        Scanner sc = new Scanner(System.in);

        int matricula;
        double nota;
        double somaNotas = 0;
        int totalAlunos = 0;

        System.out.println("Digite os dados dos alunos. Para encerrar, digite matrícula negativa.");

        while (true) {
            System.out.print("\nNúmero de matrícula: ");
            matricula = sc.nextInt();

            if (matricula < 0) {
                break;
            }

            System.out.print("Nota do aluno: ");
            nota = sc.nextDouble();

            somaNotas += nota;
            totalAlunos++;
        }

        if (totalAlunos > 0) {
            double media = somaNotas / totalAlunos;
            System.out.println("\nTotal de alunos: " + totalAlunos);
            System.out.println("Média da turma: " + media);
        } else {
            System.out.println("\nNenhum aluno foi registrado.");
        }

        sc.close();
    }
}
