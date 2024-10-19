package unidade3.estoque_copy;

public class ProdutoNaoEncontradoException extends Exception {
    public ProdutoNaoEncontradoException   (String nomeDoProduto) {
        super("Oooops, produto " + nomeDoProduto + " não encontrado!");
    }
}

