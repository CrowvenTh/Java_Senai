package revisao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double n1 = 0, n2 = 0;
        
        for (int x = 0; x < 3; x++) {
            System.out.println("Insira o nome do aluno");
            @SuppressWarnings("unused")
            String nome = scanner.next();
            System.out.println("Insira a primeira nota");
            n1 = scanner.nextDouble();
            System.out.println("Insira a segunda nota");
            n2 = scanner.nextDouble();
            double notaFinal = (n1 + n2) / 2;
            System.out.println("Nota final: " + notaFinal + "\n");

            if (notaFinal >= 6.5) {
                System.out.println("O aluno foi aprovado \n");
            } else if (notaFinal <= 6 && notaFinal >= 5) {
                System.out.println("O aluno está de ecuperação \n");
            } else {
                System.out.println("O aluno foi reprovado \n");
            }
            notaFinal = (notaFinal + notaFinal / 3);
            System.out.println("média das notas de :" + notaFinal / 3);
        }
    }
}
