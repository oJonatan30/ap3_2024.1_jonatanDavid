/**
Exercicio 1/q1 = Correção de Erros 
@author jonatanDavid
@version 1.0
@since 2024-08-18
@codigo-secreto 947969652
*/
package unidade1.execicio1;

import java.util.Scanner;

public class Questao1 {
  double x1, y1, x2, y2, distancia = 1.0, amplitude = 1.0;

  public double getDistancia() {

    Scanner teclado = new Scanner(System.in);

    System.out.println("Entre com as coordenadas x e y dos pontos nesta ordem:");
    x1 = teclado.nextFloat();
    y1 = teclado.nextFloat();
    x2 = teclado.nextFloat();
    y2 = teclado.nextFloat();

    teclado.close();

    distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

    System.out.println("A distância é: " + distancia);
    return distancia;
  }

  public double getAmplitude() {

    double xc1 = this.x1;
    double xc2 = this.x2;
    double yc1 = this.y1;
    double yc2 = this.y2;

    double aX = Math.abs(xc2 - xc1);
    double aY = Math.abs(yc2 - yc1);

    System.out.println("A amplitude X é: " + aX);
    System.out.println("A amplitude Y é: " + aY);

    return aX + aY;

  }

  public static void main(String[] args) {
    Questao1 questao1 = new Questao1();
    questao1.getDistancia();
    questao1.getAmplitude();
  }
}
