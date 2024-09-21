package unidade2.lanchonete_polimorfismo;

public class DoceDeFruta extends Produto {
    private String nomeFruta;

    public DoceDeFruta(String nome, double preco, String nomeFruta) {
        super(nome, preco);
        this.nomeFruta = nomeFruta;
    }

    public void consumir() {
        System.out.println("doce de frutas");
    }

    public String getNomeFruta() {
        return nomeFruta;
    }

    public void setNomeFruta(String nomeFruta) {
        this.nomeFruta = nomeFruta;
    }

    @Override
    public String toString() {
        return "DoceDeFruta [nomeFruta=" + nomeFruta + "]";
    }
}
