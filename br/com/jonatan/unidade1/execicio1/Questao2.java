/**
Exercicio 1/q2 = numeros aleatorios
@author jonatanDavid
@version 1.0
@since 2024-08-18
@codigo-secreto 947969652
*/
package unidade1.execicio1;

import java.util.LinkedList;
import java.util.Random;

public class Questao2 {
    public static void main(String[] args) {
        Random nRandom = new Random();
        LinkedList<Integer> numbers = new LinkedList<Integer>();
        for (int i = 0; i < 9999; i++) {
            int num = nRandom.nextInt();
            numbers.add(num);

        }
        int menorPositivo = Integer.MAX_VALUE;
        for (int nCorreto : numbers) {
            if ((nCorreto > 0) && (nCorreto < menorPositivo)) {
                menorPositivo = nCorreto;
            }

        }
        System.out.println(menorPositivo);
    }
}
