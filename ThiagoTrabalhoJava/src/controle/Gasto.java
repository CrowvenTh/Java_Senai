package controle;

import java.util.Date;

public class Gasto {
    private String descricao;
    private double valor;
    private Date data;

    public Gasto(String descricao, double valor, Date data) {
        this.descricao = descricao;
        this.valor = valor;
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    public Date getData() {
        return data;
    }

    @Override
    public String toString() {
        return String.format("Descrição: %s\nValor: %.2f\nData: %s\n", descricao, valor, data);
    }
}
