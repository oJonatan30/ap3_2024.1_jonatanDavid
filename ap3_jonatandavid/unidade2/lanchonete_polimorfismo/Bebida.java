package unidade2.lanchonete_polimorfismo;

public class Bebida extends Produto {

    private double volume;


    public Bebida(String nome, double preco, double volume) {
        super(nome, preco);
        this.volume = volume;
    }

    public void consumir(){
        System.out.println("Recipiente com um Litro.");
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Bebida [volume=" + volume + "]";
    }
}
