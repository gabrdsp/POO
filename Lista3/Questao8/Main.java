package Questao8;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        PratoVegano pratoVegano = new PratoVegano(
                "Salada Tropical",
                35.0,
                15,
                Arrays.asList("alface", "manga", "nozes", "molho cítrico"),
                "Certificado Vegan Society"
        );

        PratoGourmet pratoGourmet = new PratoGourmet(
                "Risoto de Camarão",
                120.0,
                40,
                Arrays.asList("arroz arbório", "camarão", "creme de leite", "queijo parmesão"),
                "Chef Alexandre R.F.S"
        );
      
        pratoVegano.exibirCardapio();
        pratoGourmet.exibirCardapio();
    }
}
