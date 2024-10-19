package unidade3.estoque_copy;


public class AdicionarProdutoThread extends Thread {
    private final ControleEstoque controleestoque;
    private final Produto produto;

public AdicionarProdutoThread(ControleEstoque controleestoque, Produto produto) {
        this.controleestoque = controleestoque;
        this.produto = produto;
    }

@Override
public void run(){
    controleestoque.adicionar(produto);
}
}

