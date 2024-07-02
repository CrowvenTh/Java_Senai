import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        
        String Nome, Sobrenome;
        int idade;

        System.out.println("Qual seu nome ?");
            Nome = entrada.nextLine();
        System.out.println("Qual seu sobrenome ?");
            Sobrenome = entrada.nextLine();
        System.out.println("Quantos anos você tem ?");
            idade = entrada.nextInt();

        if (idade > 18) {
            System.out.println("Seu nome é " + Nome + " " + Sobrenome + " ,tem " + idade +" anos e é maior de idade." );
        } else {
            System.out.println("Seu nome é " + Nome + " " + Sobrenome + " ,tem " + idade +" anos e é menor de idade." );
        }

    }
}
