package Lista4.Questao4;

public abstract class TarefaBase {

  protected boolean concluida = false;

    public void marcarConcluida() {
        concluida = true;
        System.out.println("Tarefa marcada como concluída!");
    }
}
