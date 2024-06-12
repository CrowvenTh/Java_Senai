package Escola;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Escola {
    public static void main(String[] args) {
        Aluno fulano = new Aluno();

        fulano.setNome("Damarcones Porto");
        fulano.setIdade(29);

        System.out.println("O nome do aluno é: "+fulano.getNome());
        System.out.println("A idade do aluno é: "+fulano.getIdade());
        
        // 
        
        String nome;
        int n1;
        int n2;
        double mediaNota;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira o nome do Aluno");
            nome = entrada.nextLine();
        System.out.println("Insira a primeira nota");
            n1 = entrada.nextInt();
        System.out.println("Insira a segunda nota");
            n2 = entrada.nextInt();
        mediaNota = (n1+n2)/2;

        System.out.println("A média do " +fulano.getNome()+" é de: "+mediaNota);
    }
}
