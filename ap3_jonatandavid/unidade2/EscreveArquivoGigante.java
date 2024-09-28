package unidade2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

import unidade2.Salvando_Livros.Livro;

public class EscreveArquivoGigante {
    public static void main(String[] args) {
        String nomeDoArquivo = "Livros.csv";

        String[] titulo = { "Entre Sombras e Luzes","O Eterno Recomeço","A Última Aurora",};
        String[] autor = { "Gabriel García Márquez ", "Haruki Murakami", "Clarice Lispector" };

        Random random = new Random();
        boolean append = false;

        try {
            BufferedWriter arquivoCSV = new BufferedWriter(new FileWriter(nomeDoArquivo, append));
            for (long controle = 1; controle <= 9871035; controle++) {
                long idLivro = controle;
                String umLivro = titulo[random.nextInt(titulo.length)];
                String umAutor = autor[random.nextInt(autor.length)];
                double preco = 10 + (568 - 10) * random.nextDouble();

                Livro Livro = new Livro(idLivro, umLivro, umAutor, preco);
                arquivoCSV.write(Livro.toString());
                arquivoCSV.newLine();

                if (controle % 1000 == 0) {
                    System.out.println("Progresso: " + controle + " Livros escritos.");
                }
            }
            arquivoCSV.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("\nAcabou!");
    }
}
