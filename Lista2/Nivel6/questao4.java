// Questao4.java
import java.util.Scanner;

public class questao4 {

    public static boolean isEquilatero(int a, int b, int c) {
        return (a == b && b == c);
    }

    public static boolean isIsosceles(int a, int b, int c) {
        return (a == b || a == c || b == c) && !isEquilatero(a, b, c);
    }

    public static boolean isEscaleno(int a, int b, int c) {
        return (a != b && a != c && b != c);
    }

    public static void run() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Classificação de Triângulos por Lados");

        System.out.print("Digite o lado A: ");
        int a = sc.nextInt();

        System.out.print("Digite o lado B: ");
        int b = sc.nextInt();

        System.out.print("Digite o lado C: ");
        int c = sc.nextInt();

        if (a < b + c && b < a + c && c < a + b) {
            if (isEquilatero(a, b, c)) {
                System.out.println("\nO triângulo é equilátero.");
            } else if (isIsosceles(a, b, c)) {
                System.out.println("\nO triângulo é isósceles.");
            } else if (isEscaleno(a, b, c)) {
                System.out.println("\nO triângulo é escaleno.");
            }
        } else {
            System.out.println("\nOs valores informados não formam um triângulo válido!");
        }
    }
}
