package unidade1.exercicio2.chique;

import java.time.LocalDateTime;
import java.util.List;

public class Restaurante {

    private String cliente;
    private List<Mesa> mesas;

    public Restaurante(String nome, List<Mesa> mesas) {
        this.cliente = cliente;
        this.mesas = mesas;
    }

    public void fazerReserva(int numero, LocalDateTime horario, String cliente) {
        
    }

    public void listarMesas() {
        for (Mesa mesa : mesas) {
            System.out.println(mesa);
        }
    }
}
