package Lista4.Questao4;

public class TarefaLonga extends implements IExecutavel {
  
  @Override
    public void executar() {
        int progresso = 0;

        System.out.println("Iniciando tarefa longa...");

        while (progresso < 100) {
            progresso += 10; 
            System.out.println("Progresso: " + progresso + "%");

            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                System.out.println("Erro na execução da tarefa: " + e.getMessage());
            }
        }

        marcarConcluida();
    }
}