package Lista4.Questao9;

public abstract class Produto {
    protected int quantidadeEstoque;

    public Produto(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }
    
    public abstract void verificarDisponibilidade(int quantidadeSolicitada);
}