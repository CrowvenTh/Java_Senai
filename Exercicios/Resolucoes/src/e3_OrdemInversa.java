import java.util.Scanner;

public class e3_OrdemInversa {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner (System.in);
        
            int numA;
            int numB;

            System.out.println("insira numA");
            numA = entrada.nextInt();
            System.out.println("insira numB");
            numB = entrada.nextInt();
            
            entrada.close();
            
            System.out.println("numB = "+ numB +"\n"+ "numA = "+ numA );
        
    }
}
