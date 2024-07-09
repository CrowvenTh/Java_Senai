import java.util.Scanner;

public class metodo1 {
    public String nome;
    private int idade, anoNasc;

    Scanner scanner = new Scanner(System.in);

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getAnoNasc() {
        return anoNasc;
    }

    public void setAnoNasc(int anoNasc) {
        this.anoNasc = anoNasc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String NomeTodo(){
        return nome;
    }
    public int CalculdaIdade(){
        System.out.println("Insira seu ano de nascimento");
        anoNasc = scanner.nextInt();
        idade = 2024 - anoNasc;
        System.out.println("Você tem "+ idade +" de idade");
        return  0;
    }
}
