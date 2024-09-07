package unidade2.mercado_heranca;

import java.time.LocalDateTime;

public class ProdutoPerecivel extends Produto{
    private LocalDateTime validade;

    public ProdutoPerecivel(String nome, int quantidade, LocalDateTime validade) {
        super(nome, quantidade);
        this.validade = validade;
    }

    public LocalDateTime getValidade() {
        return validade;
    }

    public void setValidade(LocalDateTime validade) {
        this.validade = validade;
    }

    @Override
    public String toString() {
        return "ProdutoPerecivel [validade=" + validade + ", toString()=" + super.toString() + "]";
    }

}
