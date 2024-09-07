package unidade2;

import java.time.LocalDateTime;

import unidade2.mercado_heranca.Produto;
import unidade2.mercado_heranca.ProdutoPerecivel;

public class MainMercado {
    public static void main(String[] args) {
        Produto umproduto = new Produto("copo", 10);
        Produto doisproduto = new Produto("cadeira", 20);
        Produto tresproduto = new Produto("bolsa", 7);
        ProdutoPerecivel umperecivel = new ProdutoPerecivel("Queijo", 10, LocalDateTime.now());
        ProdutoPerecivel doisperecivel = new ProdutoPerecivel("Manteiga", 6, LocalDateTime.now());
        System.out.println(umproduto);
        System.out.println(doisproduto);
        System.out.println(tresproduto);
        System.out.println(umperecivel);
        System.out.println(doisperecivel);
    }

}
