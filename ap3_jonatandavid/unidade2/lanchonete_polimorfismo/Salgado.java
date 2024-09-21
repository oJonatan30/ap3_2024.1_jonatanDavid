package unidade2.lanchonete_polimorfismo;

public class Salgado extends Produto {
    private String proteina;


    public Salgado(String nome, double preco, String proteina) {
        super(nome, preco);
        this.proteina = proteina;
    }

    public void consumir() {
System.out.println("coxinha");
    }

    public String getProteina() {
        return proteina;
    }

    public void setProteina(String proteina) {
        this.proteina = proteina;
    }

    @Override
    public String toString() {
        return "Salgado [proteina=" + proteina + "]";
    }

}
