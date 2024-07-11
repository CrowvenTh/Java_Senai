package visao;
import javax.swing.JOptionPane;

public class cadastraVeiculo extends Veiculo {
    public String CadastroVeiculo() {
        Veiculo onibus = new Veiculo();

        onibus.setCor(JOptionPane.showInputDialog(getCor()));
        JOptionPane.showMessageDialog(null, onibus.getCor());

        return null;
    
    }
}
