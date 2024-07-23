package Model;

import escola.secretaria.Enum.Turma;
import escola.secretaria.Enum.Turno;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "Alunos")
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Matricula")
    @Size(min = 5, max = 50, message = "A matricula deve conter entre 5 a 50 caracteres")
    @NotNull
    private Long matricula;
    
    @Column(name = "Nome")
    @NotNull
    @Size(min = 3, max = 50, message = "O nome deve conter entre 3 e 50 caracteres")
    @NotBlank(message = "O nome não pode ser vazio")
    private String nome;

    @Column(name = "Disciplina")
    @Enumerated(EnumType.STRING)
    @NotNull
    private String disciplina;

    @Column(name = "Turno")
    @Enumerated(EnumType.STRING)
    @NotNull
    private Turno turno;

    @Column(name = "Turma")
    @Enumerated(EnumType.STRING)
    @NotNull
    private Turma turma;

    @Column(name = "Idade")
    @NotNull
    @NotBlank(message = "forneça a idade")
    private int idade;

    @Column(name = "Sexo")
    @NotNull
    @NotBlank(message = "Insira o sexo")
    private String sexo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getMatricula() {
        return matricula;
    }

    public void setMatricula(Long matricula) {
        this.matricula = matricula;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

}
