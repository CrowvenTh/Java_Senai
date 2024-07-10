import java.text.ParseException;

import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

public class App {
    public static void main(String[] args) throws Exception {
        String padraoCep = "##.###-###";
        String padraoCpf = "###-###.###-##";
        String padraoTel = "(##)#.####-####";
  
        
        String cep;
        String cpf;
        String telefone;
        /*
        cep = (JOptionPane.showInputDialog("Insira seu CEP"));
        JOptionPane.showMessageDialog(null, FormataCep(cep, padraoCep));

        cpf = JOptionPane.showInputDialog("Insira seu cpf");
        JOptionPane.showMessageDialog(null, FormataCpf(cpf, padraoCpf));

        telefone = JOptionPane.showInputDialog("Insira seu telefone com DDD");
        JOptionPane.showMessageDialog(null, FormataTelefone(telefone, padraoTel));
        */

        JTextField getCep = new JTextField();
        JTextField getCpf = new JTextField();
        JTextField getTelefone = new JTextField();

        final JComponent[] campo = new JComponent[] {
            // new JLabel("CEP:"), cep,
            // new JLabel("CPF:"), cpf,
            // new JLabel("Telefone:"), telefone
        };

        int resultado = JOptionPane.showConfirmDialog(
            null,
            campo,
            "Exercicio de JOptionpane",
            JOptionPane.DEFAULT_OPTION
        );

        if (resultado == JOptionPane.OK_OPTION) {
            // JOptionPane.showMessageDialog(null, "Você digitou: \n" +FormataCep(cep, padraoCep) + "\n" +FormataCpf(cpf, padraoCpf) + "\n"+ FormataTelefone(telefone, padraoTel));
            
            
        //  JOptionPane.showMessageDialog(null, "Você digitou: \n" +cep.getText() + ", \n" +cpf.getText() + ", \n" +telefone.getText());
        } else {
            System.out.println("Usuário cancelou ou fechou a caixa de diálogo.");
        }

    }

    static String FormataCep(JTextField cep, String padraoCep) {

        MaskFormatter mascara;
        try {
            mascara = new MaskFormatter(padraoCep);
            mascara.setValueContainsLiteralCharacters(false);
            return mascara.valueToString(cep);

        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    static String FormataCpf(JTextField cpf, String padraoCpf){
            try {
                MaskFormatter mascara = new MaskFormatter(padraoCpf);
                mascara.setValueContainsLiteralCharacters(false);
                return mascara.valueToString(cpf);
            } catch (ParseException e) {
                throw new RuntimeException(e);
        }
    }
        static String FormataTelefone(JTextField telefone, String padraoTel){
            try {
                MaskFormatter mascara = new MaskFormatter(padraoTel);
                mascara.setValueContainsLiteralCharacters(false);
                return mascara.valueToString(telefone);
            } catch (Exception e) {
                throw new RuntimeException(e);
        }
        /* 
          
         try {
             String cep = FormataCep("12345678");
             System.out.println(cep);
 
         } catch(CepInvalido e) {
             System.err.println(e.getMessage());
         }
     }
     static String FormataCep(String cep)throws CepInvalido{
         if (cep.length() < 8) {
             throw new CepInvalido("Aquantidade de caracteres é insuficiente");
         } else if (cep.length() > 8) {
             throw new CepInvalido("Aquantidade de caracteres foi execida");
          } return cep;
         */ 
     }
}
