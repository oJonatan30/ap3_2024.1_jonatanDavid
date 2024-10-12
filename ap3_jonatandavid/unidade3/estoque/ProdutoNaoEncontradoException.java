package unidade3.estoque;

public class ProdutoNaoEncontradoException extends Exception {
    public ProdutoNaoEncontradoException   (String nomeDoProduto) {
        super("Oooops, produto " + nomeDoProduto + " não encontrado!");
    }
}

