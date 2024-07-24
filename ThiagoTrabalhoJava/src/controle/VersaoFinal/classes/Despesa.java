package controle.VersaoFinal.classes;

import controle.VersaoFinal.enums.TipoDespesa;

public class Despesa {

    private TipoDespesa tipoDespesa;
    private String descricao;
    private double preco;

    public Despesa(TipoDespesa tipoDespesa, String descricao, double preco) {
        this.tipoDespesa = tipoDespesa;
        this.descricao = descricao;
        this.preco = preco;
    }

    public TipoDespesa getTipoDespesa() {
        return tipoDespesa;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;

    }

}
