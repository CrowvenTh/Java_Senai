
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Gastos {
    private String tipo;
    private String descricao;
    private double valor;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void cadastrarGasto() {
        JPanel painel = new JPanel();
        painel.setLayout(new BoxLayout(painel, BoxLayout.Y_AXIS));

        JTextField campoTipo = new JTextField(20);
        JTextField campoDescricao = new JTextField(20);
        JTextField campoValor = new JTextField(20);

        painel.add(new JLabel("Tipo: "));
        painel.add(campoTipo);
        painel.add(new JLabel("Descrição: "));
        painel.add(campoDescricao);
        painel.add(new JLabel("Valor: "));
        painel.add(campoValor);

        this.tipo = campoTipo.getText();
        this.tipo = campoDescricao.getText();
        this.tipo = campoValor.getText();

        JOptionPane.showMessageDialog(null, "cadastro realizado com sucesso");
    }

    public void mostrarGasto() {
        String mensagem = String.format("Despesa Cadastrada:\n" +
                "Tipo: %s\nDescrição:%s\n" +
                "Valor: %.2f", this.tipo, this.descricao, this.valor);
                JOptionPane.showMessageDialog(null, mensagem,"Dados da Despesa",JOptionPane.INFORMATION_MESSAGE);
    }

}
