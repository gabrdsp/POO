package Lista4.Questao3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
      String[] dadosCSV = {
            "ID, Nome, Idade",
            "1, Gabriel, 21",
            "2, Alex, 27",
            "3, Lucas, 22"
        };

        List<IProcessadorDeDados> processadores = new ArrayList<>();
        processadores.add(new ProcessadorCSV());

        for (IProcessadorDeDados p : processadores) {
            p.processar(dadosCSV);
        }
    }
}
