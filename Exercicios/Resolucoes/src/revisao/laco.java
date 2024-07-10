package revisao;

import java.util.Scanner;

public class laco {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int i;
        int x;
        String nome;

        System.out.println("Insira quantas vezes o programa irá rodar");
        x = scanner.nextInt();

        for (i = 0; i < x; i++) {
            System.out.println("Diga seu nome");
            nome = scanner.next();
            System.out.println("Nome: "+ nome +" = "+ i);
            scanner.close();
        }
    }
}
