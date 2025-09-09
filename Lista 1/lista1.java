//     Aluno: Paulo Gabriel Vieira De Souza Paiva
//     Professor: Bruno Borges da Silva
//     Turma: Programação Orientada a Objetos (PEX0130)
//     Curso: Bacharelado em Tecnologia da Informação - BTI
//     Lista 1 - Exercícios de Fixação

import java.util.Scanner;
public class lista1 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        questao1();
    }

    // --- Nível 1 ---

    public static void questao1() {
        System.out.print("Digite a quantidade mínima da sua peça: ");
        int qMinima = input.nextInt();

        System.out.print("Digite a quantidade máxima da sua peça: ");
        int qMaxima = input.nextInt();

        double qMedia = (qMinima + qMaxima) / 2.0;

        System.out.printf("%nO estoque médio da peça é: %.2f%n", qMedia);
    }

    public static void questao2() {
        System.out.print("Qual é a atual cotação do dólar? ");
        float cotacao = input.nextFloat();

        System.out.print("Digite o seu saldo em dólares: ");
        float saldoUSS = input.nextFloat();

        float saldoBRL = cotacao * saldoUSS;

        System.out.printf("Seu montante em dólares vale R$%.2f.%n", saldoBRL);
    }

    public static void questao3() {
        System.out.print("Informe o código ID do vendedor: ");
        int idVendedor = input.nextInt();

        System.out.print("Informe o código do produto: ");
        int idProduto = input.nextInt();

        System.out.print("Informe o preço unitário do produto: ");
        float precoUnitario = input.nextFloat();

        System.out.print("Informe a quantidade vendida: ");
        int quantidadeVendida = input.nextInt();

        float valorVenda = precoUnitario * quantidadeVendida;

        System.out.printf("%nO valor total da venda do produto %d é R$ %.2f%n", idProduto, valorVenda);
        System.out.printf("Vendedor %d, sua comissão será de R$ %.2f%n", idVendedor, (valorVenda * 0.05));
    }

    public static void questao4() {
        System.out.print("Digite o primeiro valor (A): ");
        int a = input.nextInt();

        System.out.print("Digite o segundo valor (B): ");
        int b = input.nextInt();

        System.out.print("Digite o terceiro valor (C): ");
        int c = input.nextInt();

        System.out.print("Digite o quarto valor (D): ");
        int d = input.nextInt();

        System.out.println("\n--- Resultados das adições ---");
        System.out.println("A + B = " + (a + b));
        System.out.println("A + C = " + (a + c));
        System.out.println("A + D = " + (a + d));
        System.out.println("B + C = " + (b + c));
        System.out.println("B + D = " + (b + d));
        System.out.println("C + D = " + (c + d));

        System.out.println("\n--- Resultados das multiplicações ---");
        System.out.println("A * B = " + (a * b));
        System.out.println("A * C = " + (a * c));
        System.out.println("A * D = " + (a * d));
        System.out.println("B * C = " + (b * c));
        System.out.println("B * D = " + (b * d));
        System.out.println("C * D = " + (c * d));
    }

    public static void questao5() {
        System.out.print("Quantas horas levou a viagem? ");
        float tempo = input.nextFloat();

        System.out.print("Qual era a velocidade média durante a viagem, em km/h? ");
        float velocidade = input.nextFloat();
        float distancia = tempo * velocidade;
        float litros = distancia / 12;

        System.out.printf("\nVelocidade média: %.2f km/h\n", velocidade);
        System.out.printf("Tempo total: %.2f horas.\n", tempo);
        System.out.printf("Distância total: %.2f km.\n", distancia);
        System.out.printf("Combustível gasto durante a viagem: %.2f L. \n", litros);
    }

    public static void questao6() {
        System.out.print("Digite a temperatura em Graus Celsius? ");
        float temperatura = input.nextFloat();

        System.out.printf("Essa temperatura em Fahrenheit é %.2f ºF.%n", ((9 * temperatura + 160) / 5));
    }

    public static void questao7() {
        System.out.print("Digite a temperatura atual em Graus Fahrenheit? ");
        float temperatura = input.nextFloat();

        System.out.printf("A temperatura em Celsius é %.2f ºC.%n", ((temperatura - 32) * 5 / 9));
    }

    public static void questao8() {
        System.out.print("Informe em centímetros o raio da lata: ");
        float raio = input.nextFloat();

        System.out.print("Informe em centímetros a medida da altura da lata: ");
        float altura = input.nextFloat();

        double volume = 3.14159 * raio * raio * altura;

        System.out.printf("%nO volume da lata de óleo é: %.2f em centímetros cúbicos.%n", volume);
    }

    public static void questao9() {
        System.out.print("Informe sua idade em anos: ");
        int idadeAnos = input.nextInt();

        System.out.print("Informe quantos meses: ");
        int idadeMeses = input.nextInt();

        System.out.print("Informe quantos dias: ");
        int idadeDiasExtras = input.nextInt();

        int idadeTotalEmDias = (idadeAnos * 365) + (idadeMeses * 30) + idadeDiasExtras;

        System.out.printf("%nVocê já viveu %d dias.%n", idadeTotalEmDias);
    }

    public static void questao10() {
        System.out.print("Digite o primeiro número inteiro: ");
        int numero1 = input.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int numero2 = input.nextInt();

        System.out.println("\n--- Relacionamentos entre os números ---");

        if (numero1 == numero2) {
            System.out.println("Igual");
        } else {
            System.out.println("Não igual");
        }

        if (numero1 > numero2) {
            System.out.println("Maior");
        }

        if (numero1 < numero2) {
            System.out.println("Menor");
        }

        if (numero1 >= numero2) {
            System.out.println("Maior ou igual");
        }

        if (numero1 <= numero2) {
            System.out.println("Menor ou igual");
        }
    }

    // --- Nível 1 ---

    public static void questao11() {
        System.out.print("Digite o primeiro e o segundo valor: ");
        int valor1 = input.nextInt();
        int valor2 = input.nextInt();

        System.out.printf("Valores antes da troca:\nValor1 = %d\nValor2 = %d\n", valor1, valor2);

        int auxiliar = valor1;
        valor1 = valor2;
        valor2 = auxiliar;

        System.out.printf("Valores após a troca:\nValor1 = %d\nValor2 = %d\n", valor1, valor2);
    }

    public static void questao12() {
        System.out.print("Digite um número inteiro: ");
        int numero = input.nextInt();

        int modulo = (numero >= 0) ? numero : -numero;

        System.out.printf("O módulo do número %d é: %d%n", numero, modulo);
    }

    public static void questao13() {
        int[] numeros = new int[5];
        System.out.println("Digite cinco números inteiros:");
        for (int i = 0; i < 5; i++) {
            numeros[i] = input.nextInt();
        }

        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] > numeros[j]) {
                    int temp = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = temp;
                }
            }
        }

        System.out.printf("Ordem crescente: %d %d %d %d %d%n", numeros[0], numeros[1], numeros[2], numeros[3], numeros[4]);
        System.out.printf("Ordem decrescente: %d %d %d %d %d%n", numeros[4], numeros[3], numeros[2], numeros[1], numeros[0]);
    }

    public static void questao14() {
        System.out.print("Informe o primeiro valor: ");
        int x = input.nextInt();
        System.out.print("Informe o segundo valor: ");
        int y = input.nextInt();

        int dif = Math.abs(x - y);
        System.out.printf("A diferença entre eles é: %d%n", dif);
    }

    public static void questao15() {
        System.out.print("Nota 1: ");
        float n1 = input.nextFloat();

        System.out.print("Nota 2: ");
        float n2 = input.nextFloat();

        System.out.print("Nota 3: ");
        float n3 = input.nextFloat();

        System.out.print("Nota 4: ");
        float n4 = input.nextFloat();

        float mediaParcial = (n1 + n2 + n3 + n4) / 4;

        if (mediaParcial >= 7) {
            System.out.printf("Média %.2f → aprovado!%n", mediaParcial);
        } else {
            System.out.printf("Média %.2f → recuperação.%n", mediaParcial);
            System.out.print("Digite a nota extra: ");
            float rec = input.nextFloat();

            float mediaFinal = (mediaParcial + rec) / 2;

            if (mediaFinal >= 7) {
                System.out.printf("Nova média %.2f → aprovado na recuperação!%n", mediaFinal);
            } else {
                System.out.printf("Nova média %.2f → reprovado!%n", mediaFinal);
            }
        }
    }

    public static void questao16() {
        System.out.print("Primeiro número: ");
        float v1 = input.nextFloat();

        System.out.print("Segundo número: ");
        float v2 = input.nextFloat();

        if (v1 == v2) {
            System.out.println("Os dois valores são iguais.");
        } else if (v1 > v2) {
            System.out.printf("Maior: %.2f | Menor: %.2f%n", v1, v2);
        } else {
            System.out.printf("Maior: %.2f | Menor: %.2f%n", v2, v1);
        }
    }

    public static void questao17() {
        System.out.print("Digite um número entre 0 e 9: ");
        int valor = input.nextInt();

        if (valor >= 0 && valor <= 9) {
            System.out.println("valor válido");
        } else if (valor >= -1000 && valor <= 1000) {
            System.out.println("valor inválido");
        } else {
            System.out.println("erro");
        }
    }

    public static void questao18() {
        System.out.print("Informe o código: ");
        int cod = input.nextInt();

        switch (cod) {
            case 1:
                System.out.println("um");
                break;
            case 2:
                System.out.println("dois");
                break;
            case 3:
                System.out.println("três");
                break;
            default:
                System.out.println("Código inválido!");
        }
    }

    public static void questao19() {
        System.out.print("Lado A: ");
        float la = input.nextFloat();
        System.out.print("Lado B: ");
        float lb = input.nextFloat();
        System.out.print("Lado C: ");
        float lc = input.nextFloat();

        if ((la < lb + lc) && (lb < la + lc) && (lc < la + lb)) {
            if (la == lb && lb == lc) {
                System.out.println("Equilátero");
            } else if (la == lb || la == lc || lb == lc) {
                System.out.println("Isósceles");
            } else {
                System.out.println("Escaleno");
            }
        } else {
            System.out.println("Não é um triângulo válido.");
        }
    }

    public static void questao20() {
        int a, b, c;
        do {
            System.out.print("Digite o valor de A (>0): ");
            a = input.nextInt();
        } while (a <= 0);
        do {
            System.out.print("Digite o valor de B (>0): ");
            b = input.nextInt();
        } while (b <= 0);
        do {
            System.out.print("Digite o valor de C (>0): ");
            c = input.nextInt();
        } while (c <= 0);

        int menor = Math.min(a, Math.min(b, c));
        int maior = Math.max(a, Math.max(b, c));

        System.out.printf("Menor * Maior = %d%n", (menor * maior));
        System.out.printf("Maior / Menor = %.2f%n", (float) maior / menor);
    }

    public static void questao21() {
        System.out.print("Informe um número: ");
        int entrada = input.nextInt();

        if (entrada >= 0) {
            System.out.printf("%d é positivo.%n", entrada);
        } else {
            System.out.printf("%d é negativo.%n", entrada);
        }
    }

    public static void questao22() {
        int pos = 0;
        int neg = 0;

        System.out.print("Forneça um número: ");
        int entrada = input.nextInt();

        if (entrada >= 0) {
            pos = entrada;
        } else {
            neg = entrada;
        }

        System.out.printf("Positivo: %d | Negativo: %d%n", pos, neg);
    }
}
