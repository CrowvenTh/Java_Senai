package controle.VersaoFinal.enums;

public enum TipoDespesa {
    MANUTENCAO("Manutenção"),
    MULTA("Multa"),
    PEDAGIO("Pedágio"),
    BALSA("Balsa"),
    OUTROS("Outros");

    private final String descricao;

    TipoDespesa(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
