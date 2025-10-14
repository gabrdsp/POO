package Lista4.Questao2;

public class Main {
    public static void main(String[] args) {
        Desenvolvedor devJunior = new Desenvolvedor("Gabriel", 1, 4000);
        Desenvolvedor devPleno = new Desenvolvedor("Lucas", 2, 7000);
        Desenvolvedor devSenior = new Desenvolvedor("Alex", 3, 10000);
        Desenvolvedor devOutro = new Desenvolvedor("Ana", 4, 5000);

        devJunior.exibirDados();
        devPleno.exibirDados();
        devSenior.exibirDados();
        devOutro.exibirDados();
    }
}
