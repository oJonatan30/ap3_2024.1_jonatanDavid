//Xico - corrigindo: o formato deveria ser javadoc

/**
Exercicio 1/q3 = Zinco mais Cobre 
@author jonatanDavid
@version 1.0
@since 2024-08-18
@codigo-secreto 947969652
*/
package unidade1.execicio1;

import java.util.Scanner;

public class Questao3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Quantos quilos de latão você precisa? ");
        double quilos = teclado.nextDouble();

        double cobre = quilos * (0.7);
        double zinco = quilos * (0.3);

        System.out.println("Para " + quilos + " quilos de latão, temos: ");

        System.out.println("70% de cobre: " + cobre);
        System.out.println("30% de zinco: " + zinco);
        teclado.close();
    }

}
