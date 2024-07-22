package escola.secretaria.Enum;

public enum Disciplina {
    MATEMATICA("Matemática"),
    PORTUGUES("Português"),
    HISTORIA("História"),
    CIENCIA("Ciências"),
    GEOGRAFIA("Geografia");

    private String disciplina;
    private Disciplina(String disciplina){
        this.disciplina = disciplina;
    }
}
