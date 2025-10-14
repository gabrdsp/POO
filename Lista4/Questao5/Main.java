package Lista4.Questao5;

public class Main {
    public static void main(String[] args) {

        ValidadorSeguranca validador = new ValidadorSeguranca();

        String senha1 = "Admin2025A";
        validador.validarAcesso(senha1);

        String senha2 = "segura123";
        validador.validarAcesso(senha2);

        String senha3 = "Abc12A";
        validador.validarAcesso(senha3);
    }
}
