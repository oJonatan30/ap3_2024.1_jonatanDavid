package unidade3.estoque;

import java.util.Arrays;

public class ControleEstoque {
private int capacidade;
private Produto[] produtos = new Produto[30];
private int contador = 0;

    public void adicionar(Produto produto) {
        if (contador < capacidade) {
            produtos[contador] = produto;
            contador++;
            System.out.println("Produto adicionado: " + produto.getCodigo());
        } else {
            System.out.println("Capacidade máxima atingida. Não é possível adicionar mais produtos.");
        }
    }
public void remover (String nomeDoProduto) throws ProdutoNaoEncontradoException {
    for (int i = 0; i < contador; i++) {
        if (produtos[i].getCodigo().equals(nomeDoProduto)) {
            produtos[i] = produtos[contador - 1];
            produtos[contador - 1] = null;
            contador--;
            System.out.println("Produto removido: " + nomeDoProduto);
            return;
        }
    }
    throw new ProdutoNaoEncontradoException(nomeDoProduto);
}
public ControleEstoque(int capacidade, Produto[] produtos) {
    this.capacidade = capacidade;
    this.produtos = produtos;
}
public int getCapacidade() {
    return capacidade;
}
public void setCapacidade(int capacidade) {
    this.capacidade = capacidade;
}
public Produto[] getProdutos() {
    return produtos;
}
public void setProdutos(Produto[] produtos) {
    this.produtos = produtos;
}

@Override
public String toString() {
    return "ControleEstoque [capacidade=" + capacidade + ", produtos=" + Arrays.toString(produtos) + "]";
}
}
