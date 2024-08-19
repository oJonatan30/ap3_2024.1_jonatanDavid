/**
Exercicio 1/q4 = Teste Nome + Telefone
@author jonatanDavid
@version 1.0
@since 2024-08-18
@codigo-secreto 947969652
*/

package unidade1.execicio1;

public class Testequestao4 {
    public static void main(String[] args) {
        Questao4 contact01 = new Questao4("Leonardo Da´Vinci", "996543798");
        Questao4 contact02 = new Questao4("Rafael", "996879560");
        Questao4 contact03 = new Questao4("Donatelo", "996874690");

        System.out.println("contact01 = " + contact01.getNome() + ", Numero:" + contact01.getTelefone());
        System.out.println("contact02 = " + contact02.getNome() + ", Numero:" + contact02.getTelefone());
        System.out.println("contact03 = " + contact03.getNome() + ", Numero:" + contact03.getTelefone());
    }
}