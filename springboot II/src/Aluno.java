
import java.util.Scanner;

public class Aluno {
    private String nome;
    private int idade;
    private String sexo;
    private int matricula;
    private String turno;
    private String turma;
    private double nota1, nota2;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public int getmatricula() {
        return matricula;
    }

    public void setmatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public String CadastraAluno() {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Escolha o número de alunos a serem cadastrados");
        int alunoQtd = entrada.nextInt();
        
        for(alunoQtd = 0; (alunoQtd = entrada.nextInt()) > 0;){
            System.out.println(alunoQtd++);
            /*
            * 
            System.out.println("Insira os dados do aluno\n");
            System.out.println("Insira o nome do aluno");
            nome = entrada.next();
            System.out.println("Insira o sexo do aluno");
            sexo = entrada.next();
            System.out.println("Insira a idade do aluno");
            idade = entrada.nextInt();
            System.out.println("Insira a matrícula do aluno");
            matricula = entrada.nextInt();
            System.out.println("Insira a turma do aluno");
            turma = entrada.next();
            System.out.println("Insira o turno do aluno");
            turno = entrada.next();
            */
        }
        return null;
    }
    
    public String MostrarCadastros() {
        System.out.println("Aluno\n");
        System.out.println("Nome: " + nome);
        System.out.println("Sexo: " + sexo);
        System.out.println("Idade: " + idade);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Turma: " + turma);
        System.out.println("turno: " + turno);
        return null;
    }
}
