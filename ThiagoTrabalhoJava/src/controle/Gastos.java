package controle;

import java.util.Scanner;

public class Gastos {
    public void cadastroDespesa() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira o tipo de despesa");
        String nomeDespesa = entrada.next();
        System.out.println("Descrição da despesa");
        String descDespesa = entrada.next();
        System.out.println("Insira o valor da despesa");
        Double valorDespesa = entrada.nextDouble();
        System.out.println("=== Extrato: ===\n"+ "Tipo: "+ nomeDespesa +"\nDescrição:"+ descDespesa +"\nValor total: R$"+ valorDespesa +"\n");
    }
}

