package unidade3.estoque;

public class MainEstoque {
public static void main(String[] args) {
    ControleEstoque controleEstoque = new ControleEstoque(0, null);
    Produto produto1 = new Produto("123","CG TITAN 160", 5);
    Produto produto2 = new Produto("456","XTZ CROSSER 150", 5);
    Produto produto3 = new Produto("789","XRE SAHARA 300", 5);

    try {
        System.out.println("Adicionando...");
        controleEstoque.adicionar(produto1);
        controleEstoque.adicionar(produto2);
        controleEstoque.adicionar(produto3);
        System.out.println("3 produtos adicionados.");

        System.out.println("Removendo...");
        controleEstoque.remover("CG TITAN 160");
        controleEstoque.remover("XTZ CROSSER");
        System.out.println("1 produto removido.");
    } catch (ProdutoNaoEncontradoException e) {
        System.out.println(e.getMessage());
    }
}
}

