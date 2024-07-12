import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Insira o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Insira o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            Contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }

        terminal.close();
    }

    static void Contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        } else {
            int contagem = parametroDois - parametroUm;
            for (int cont = 0; cont <= contagem; cont++) {
                System.out.println("Imprimindo o número " + cont);
            }
        }
    }
}
