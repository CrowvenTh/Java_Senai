import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner (System.in);
        int primeiro = 0, segundo = 0;
        int resultado;
        double resDiv;
        int opcao = -1;
        
        /*
         * 1 = +
         * 2 = -
         * 3 = *
         * 4 = /
         */

         while (opcao != 0) {
            System.out.println("Escolha a operação:");
            opcao = entrada.nextInt();
           
            if (opcao != 0) {
                
            System.out.println("Insira o primeiro número: ");
            primeiro = entrada.nextInt();

            System.out.println("Insira o segundo número: ");
            segundo = entrada.nextInt();

            }
        switch (opcao) {
            case 1: //soma
                resultado = primeiro + segundo;
                    System.out.println("resultado igual a: "+resultado);
                    System.out.println("-------------------------------");
                    System.out.println("");
                break;

                case 2: // subtração
                resultado = primeiro - segundo;
                    System.out.println("resultado igual a: "+resultado);
                    System.out.println("-------------------------------");
                    System.out.println("");
                break;

                case 3: //multiplicação
                resultado = primeiro * segundo;
                    System.out.println("resultado igual a: "+resultado);
                    System.out.println("-------------------------------");
                    System.out.println("");
                break;

                case 4: //divisão
                resDiv = primeiro / segundo;
                    System.out.println("resultado igual a: "+resDiv);
                    System.out.println("-------------------------------");
                    System.out.println("");
                break;

                case 0:
                    System.out.println("Encerrando...");
                break;
        
            default:
                break;

            }
        }
    }
}
