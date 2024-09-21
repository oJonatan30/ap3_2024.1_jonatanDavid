package unidade2;

import unidade2.lanchonete_polimorfismo.Bebida;
import unidade2.lanchonete_polimorfismo.DoceDeFruta;
import unidade2.lanchonete_polimorfismo.Produto;
import unidade2.lanchonete_polimorfismo.Salgado;

public class MainLanchonete {
    public static void main(String[] args) {
        comPolimorfismo();
        semPolimorfismo();
    }

    public static void comPolimorfismo() {
        Produto refrigerante = new Bebida("refrigerante",1.2,100);
        Produto coxinha = new Salgado("coxinha", 2.5 , "frango");
        Produto sobremesa = new DoceDeFruta("sobremesa", 3.5 , "caju");

        refrigerante.consumir();
        coxinha.consumir();
        sobremesa.consumir();
    }

    public static void semPolimorfismo(){
        Produto refrigerante = new Bebida ("refrigerante", 1.2, 100 );
        Produto coxinha = new Salgado ("coxinha", 2.5, "frango");
        Produto sobremesa = new DoceDeFruta ("sobremesa", 3.5, "caju");

        refrigerante.consumir();
        coxinha.consumir();
        sobremesa.consumir();
}
}