package controle.Testes.visao;

import java.util.Scanner;

public class Gastos extends PrototipoVeiculo{
    public void cadastroDespesa() {
        Scanner entrada = new Scanner(System.in);

        boolean controlador = true;

        while (controlador) {
            System.out.println("Selecione a opção:");
            int alt = entrada.nextInt();
            System.out.println("1 - Calcular Km por litro\n" 
                              +"2 - Abastecer veiculo\n"
                              +"3 - Inserir despesa"
                              +"0 - Encerrar");
            int opcao = entrada.nextInt();
            switch (opcao) {
                case 1:
                    CalcularConsumo();
                    break;
                case 2:

                    break;
                default:
                    System.out.println("Opção não disponivel");
            }

        }
    }
}
