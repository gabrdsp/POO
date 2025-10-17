package Lista4.Questao8;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<IComando> comandos = new ArrayList<>();
        comandos.add(new ComandoRede());
        comandos.add(new ComandoArquivo());

        String[] parametrosRede = {"Servidor1", "Porta8080"};
        String[] parametrosArquivo = {"documento.txt", "backup.zip"};

        for (IComando comando : comandos) {
            if (comando instanceof ComandoRede) {
                comando.executar(parametrosRede);
            } else if (comando instanceof ComandoArquivo) {
                comando.executar(parametrosArquivo);
            }
        }
    }
}