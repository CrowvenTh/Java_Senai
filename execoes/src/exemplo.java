import javax.swing.*;

public class exemplo extends App {
    public static void main(String[] args) {
        JTextField cep = new JTextField();
        JTextField cpf = new JTextField();
        JTextField telefone = new JTextField();

        final JComponent[] inputs = new JComponent[] {
            new JLabel("CEP:"), cep,
            new JLabel("CPF:"), cpf,
            new JLabel("Telefone:"), telefone
        };

        int result = JOptionPane.showConfirmDialog(
            null,
            inputs,
            "Exercicio de JOptionpane",
            JOptionPane.PLAIN_MESSAGE
        );

        if (result == JOptionPane.OK_OPTION) {
            JOptionPane.showMessageDialog(null, "Você digitou: \n" +cep.getText() + ", \n" +cpf.getText() + ", \n" +telefone.getText());
        } else {
            System.out.println("Usuário cancelou ou fechou a caixa de diálogo.");
        }
    }
}
