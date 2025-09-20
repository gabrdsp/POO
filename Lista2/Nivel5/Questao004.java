// Questao4.java - Nível 5
import java.util.Scanner;

public class Questao004 {

    public static void run() {
        Scanner sc = new Scanner(System.in);

        String[] nomes = new String[20];
        int[] idades = new int[20];

        System.out.println("Cadastro das 20 candidatas:");

        for (int i = 0; i < 20; i++) {
            System.out.print("Nome da candidata " + (i + 1) + ": ");
            nomes[i] = sc.next();

            System.out.print("Idade da candidata " + (i + 1) + ": ");
            idades[i] = sc.nextInt();
        }

        System.out.println("\nCandidatas aptas (idade entre 18 e 20 anos):");
        boolean encontrou = false;

        for (int i = 0; i < 20; i++) {
            if (idades[i] >= 18 && idades[i] <= 20) {
                System.out.println(nomes[i] + " (" + idades[i] + " anos)");
                encontrou = true;
            }
        }

        if (!encontrou) {
            System.out.println("Nenhuma candidata apta encontrada.");
        }
    }
}
