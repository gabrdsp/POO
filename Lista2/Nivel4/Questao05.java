// Questao5.java
public class Questao05 {

    public static void run() {
        System.out.println("Tabuadas de 1 até 10:\n");

        for (int i = 1; i <= 10; i++) {
            System.out.println("Tabuada do " + i + ":");

            for (int j = 1; j <= 10; j++) {
                int resultado = i * j;
                System.out.println(i + " x " + j + " = " + resultado);
            }

            System.out.println();
        }
    }
}
