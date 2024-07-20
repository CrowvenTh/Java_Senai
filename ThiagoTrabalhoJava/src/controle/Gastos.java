package controle;

import java.util.Scanner;

public class Gastos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean controlador = true;
        System.out.println("Escolha a opção");
        int opcao = entrada.nextInt();
        if (opcao == 0) {
            controlador = false;
        }

        while (controlador) {

            switch (opcao) {
                case 1:
                    System.out.println("1 - Cadastrar Veiculo");
                    break;
                case 2:
                    System.out.println("2 - Veiculos cadastrados");
                    break;
                case 3:
                    System.out.println("3 - relatório de gastos gerais");
                    break;
                case 4:
                    System.out.println("0 - Encerrar programa");
                    controlador = false;
            }
        }
    }
}
