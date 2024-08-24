//Xico - corrigindo: o formato deveria ser javadoc

/**
Exercicio 1/q4 = Nome + Telefone
@author jonatanDavid
@version 1.0
@since 2024-08-18
@codigo-secreto 947969652
*/
package unidade1.execicio1;

public class Questao4 { // Xico - corrigindo: o nome da classe está incorreto.

    public String Nome; // Xico - corrigindo: atributos são em minusculo.
    public String Telefone;

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String telefone) {
        Telefone = telefone;
    }

    public Questao4(String nome, String telefone) {
        Nome = nome;
        Telefone = telefone;
    }

    @Override
    public String toString() {
        return "Questao4 [Nome=" + Nome + ", Telefone=" + Telefone + "]"; // Xico - corrigindo: o to string deve exibir
                                                                          // o nome em maiuscula
    }

}
