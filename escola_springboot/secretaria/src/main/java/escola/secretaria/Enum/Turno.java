package escola.secretaria.Enum;

public enum Turno {
    MATUTINO("Matutino"),
    VESPERTINO("Vespertino"),
    NOTURNO("Noturno"),
    Integral("Integral");

    private String turno;

    private Turno(String turno){
        this.turno = turno;
    }
}
