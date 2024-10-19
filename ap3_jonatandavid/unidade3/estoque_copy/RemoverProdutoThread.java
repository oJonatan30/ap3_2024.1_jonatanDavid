package unidade3.estoque_copy;

public class RemoverProdutoThread extends Thread{
    private final ControleEstoque controleEstoque;
    private final String codigo;
    
    public RemoverProdutoThread(ControleEstoque controleEstoque, String codigo) {
        this.controleEstoque = controleEstoque;
        this.codigo = codigo;
    }

    @Override
    public void run() {
        try {
            controleEstoque.remover(codigo);
        } catch (ProdutoNaoEncontradoException e) {
            System.out.println(e.getMessage());
    }
}
}