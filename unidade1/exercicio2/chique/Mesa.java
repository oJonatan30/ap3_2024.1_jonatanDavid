package unidade1.exercicio2.chique;

public class Mesa {
    public Mesa(String numero, int quantCadeiras, boolean ocupada) {
        this.numero = numero;
        this.quantCadeiras = quantCadeiras;
        this.ocupada = ocupada;
    }

    private String numero;
    private int quantCadeiras;
    private boolean ocupada;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getQuantCadeiras() {
        return quantCadeiras;
    }

    public void setQuantCadeiras(int quantCadeiras) {
        this.quantCadeiras = quantCadeiras;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }

    @Override
    public String toString() {
        return "mesa [numero=" + numero + ", quantCadeiras=" + quantCadeiras + ", ocupada=" + ocupada + "]";
    }
}
