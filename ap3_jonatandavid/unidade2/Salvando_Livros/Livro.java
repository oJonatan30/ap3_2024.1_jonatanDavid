package unidade2.Salvando_Livros;

import java.text.NumberFormat;
import java.util.Locale;

public class Livro {
    private long idLivro;
    private String titulo;
    private String autor;
    private double preco;

    public Livro(long idLivro, String titulo, String autor, double preco) {
        this.idLivro = idLivro;
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }

    @Override
    public String toString() {
        NumberFormat formatador = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        return idLivro + ";" + titulo + ";" + autor + ";" + formatador.format(preco);

    }
}
