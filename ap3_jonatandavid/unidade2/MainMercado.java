package unidade2;

import java.time.LocalDateTime;

import unidade2.mercado_heranca.Produto;
import unidade2.mercado_heranca.ProdutoPerecivel;

public class MainMercado {
    public static void main(String[] args) {
        Produto produto = new Produto("copo", 10);
        ProdutoPerecivel perecivel = new ProdutoPerecivel("Queijo", 10, LocalDateTime.now());
        System.out.println(produto);
        System.out.println(perecivel);
    }

}
