package Lista4.Questao8;

public class ComandoRede implements IComando {

    @Override
    public void executar(String[] parametros) {
        System.out.println("Executando Comando de Rede...");
        if (parametros != null) {
            for (String p : parametros) {
                System.out.println("Parâmetro de rede: " + p);
            }
        }
    }
}
