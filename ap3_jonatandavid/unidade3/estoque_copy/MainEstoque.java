package unidade3.estoque_copy;

public class MainEstoque {
    public static void main(String[] args) {
        ControleEstoque controleestoque = new ControleEstoque();
        int quantOperacoes = 7951387;

        for (int i = 1; i <= quantOperacoes; i++) {
            String codigo = "PROD-" + (i % 1000);
            String nome = "Produto" + (i % 100);
            Produto oProduto = new Produto(codigo, nome);
            System.out.println("Adicionando produto; " + oProduto);
            new Thread(new AdicionarProdutoThread(null, oProduto)).start();
        }
        for (int i = 1; i <= quantOperacoes; i++) {
            String codigo = "PROD-" + (i % 1000);
            System.out.println("Removendo produto; " + codigo);
            new Thread(new RemoverProdutoThread(null, codigo)).start();

        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Erro ao aguardar as threads:" + e.getMessage());
        }
    }
}