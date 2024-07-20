package controle;

import java.util.Scanner;

public class Gastos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean controlador = true;
        Veiculo veiculo = new Veiculo();

        while (controlador) {
            System.out.println("=== Escolha a opção ===");
            System.out.println("1 - Cadastrar Veículo");
            System.out.println("2 - Veículos Cadastrados");
            System.out.println("3 - Relatório de gastos");
            System.out.println("0 - Encerrar Programa\n");
            int opcao = entrada.nextInt();

            if (opcao == 0) {
                System.out.println("Programa Encerrado");
                controlador = false;
            }
            switch (opcao) {
                case 1:
                    veiculo.cadastrarVeiculo();
                    break;
                case 2:
                    veiculo.veiculoCadastrado();
                    break;
                case 3:
                    break;
                case 0:
                    controlador = false;
            }
        }
    }
}