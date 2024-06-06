import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

    /*  -------------------------------------------------
        | Tipos de variáveis |
        -------------------------------------------------
        int = 1; - inteiro
        double = 1; - decimal 
        String = "Texto longo"; - texto 
        float f = 1.0f; 
        char = 'A'; - único caracter
        boolean VOUF = false; - falso ou verdadeiro
        byte meuByte= 00110; - de 0 a 256  
        long numeroGrande = 999999999; - números grandes 
        -------------------------------------------------
    */

//------------------------------------------------------------------------------------------------------------------------    
   
    /*

    int idade = 17;

    if (idade < 18) {
        System.out.println("Menor de idade");
        // JOptionPane.showMessageDialog(null,"Menor de idade");
    }else{
        System.out.println("Maior de idade");
        // JOptionPane.showMessageDialog(null,"Maior de idade");
    }

    printf x println
    
    */

//------------------------------------------------------------------------------------------------------------------------    

    int numero1;
    int numero2;
    int resultado;

    numero1=Integer.parseInt(JOptionPane.showInputDialog("Insira o numero 1"));
    numero2=Integer.parseInt(JOptionPane.showInputDialog("Insira o numero 2"));

    resultado = numero1*numero2;

    if (resultado < 0) {
        JOptionPane.showMessageDialog(null, resultado+ " é número negativo");
    }else{
        JOptionPane.showMessageDialog(null, resultado+ " é número positivo");
        }
    }
}
