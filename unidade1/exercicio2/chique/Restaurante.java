package unidade1.exercicio2.chique;

import java.time.LocalDateTime;
import java.util.List;

import java.time.LocalDateTime;
import java.util.List;

public class Restaurante {

    private String nome;
    private List<Mesa> mesas;

    public Restaurante(String nome, List<Mesa> mesas) {
        this.nome = nome;
        this.mesas = mesas;
    }

    public void fazerReserva(int numero, LocalDateTime horario, Cliente cliente) {
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Mesa> getMesas() {
        return mesas;
    }

    public void setMesas(List<Mesa> mesas) {
        this.mesas = mesas;
    }

    @Override
    public String toString() {
        return "Restaurante [nome=" + nome + ", mesas=" + mesas + "]";
    }
}

class Mesa {
    public int mesa;
}

class Cliente {
    public String cliente;
}
