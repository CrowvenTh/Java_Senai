import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

public class Gastos extends Veiculo {
    private String tipo;
    private String descricao;
    private double valor;

    private List<Gastos> gastos = new ArrayList<>();
    private String categoria;

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

    public void adicionarGasto(Gastos gasto) {
        gastos.add(gasto);
    }

    public void cadastrarGasto(Veiculo veiculo) {
        JPanel painel = new JPanel();
        painel.setLayout(new BoxLayout(painel, BoxLayout.Y_AXIS));

        JComboBox<String> comboBoxCategorias = new JComboBox<>();
        comboBoxCategorias.addItem("Manutenção");
        comboBoxCategorias.addItem("Imposto");
        comboBoxCategorias.addItem("Pedágio");
        comboBoxCategorias.addItem("Balsa");
        comboBoxCategorias.addItem("Outros");
        comboBoxCategorias.addItem("Abastecer Veículo");

        JTextField campoDescricao = new JTextField(20);
        JTextField campoValor = new JTextField(20);

        painel.add(new JLabel("Categoria de Gasto:"));
        painel.add(comboBoxCategorias);
        painel.add(new JLabel("Descrição: "));
        painel.add(campoDescricao);
        painel.add(new JLabel("Valor: "));
        painel.add(campoValor);

        int resultado = JOptionPane.showConfirmDialog(null, painel, "Cadastro de Gasto", JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.PLAIN_MESSAGE);

        if (resultado == JOptionPane.OK_OPTION) {
            String selectedCategoria = (String) comboBoxCategorias.getSelectedItem();
            if (selectedCategoria.equals("Abastecer Veículo")) {
                abastecerVeiculo(veiculo);
            } else {
                this.categoria = selectedCategoria;
                this.descricao = campoDescricao.getText();
                this.valor = Double.parseDouble(campoValor.getText());

                veiculo.adicionarGasto(this);

                JOptionPane.showMessageDialog(null, "Cadastro de gasto realizado com sucesso!");
            }
        }
    }

    public void mostrarGastos() {
        StringBuilder sb = new StringBuilder();
        sb.append("Relatório de Gastos do Veículo:\n");
        sb.append("Marca: ").append(getMarca()).append("\n");
        sb.append("Modelo: ").append(getModelo()).append("\n\n");

        if (gastos.isEmpty()) {
            sb.append("Nenhum gasto cadastrado para este veículo.");
        } else {

            gastos.sort((g1, g2) -> {
                int compareTipo = g1.getTipo().compareTo(g2.getTipo());
                if (compareTipo != 0)
                    return compareTipo;

                int compareDescricao = g1.getDescricao().compareTo(g2.getDescricao());
                if (compareDescricao != 0)
                    return compareDescricao;

                return Double.compare(g1.getValor(), g2.getValor());
            });

            for (Gastos gasto : gastos) {
                sb.append("Tipo: ").append(gasto.getTipo()).append("\n");
                sb.append("Descrição: ").append(gasto.getDescricao()).append("\n");
                sb.append("Valor: ").append(gasto.getValor()).append("\n\n");
            }
        }

        JOptionPane.showMessageDialog(null, sb.toString(), "Relatório de Gastos", JOptionPane.INFORMATION_MESSAGE);
    }

    public void abastecerVeiculo(Veiculo veiculo) {
        JPanel painel = new JPanel();
        painel.setLayout(new BoxLayout(painel, BoxLayout.Y_AXIS));

        JComboBox<String> comboBoxCombustivel = new JComboBox<>();
        comboBoxCombustivel.addItem("Álcool");
        comboBoxCombustivel.addItem("Gasolina");
        comboBoxCombustivel.addItem("Diesel");
        comboBoxCombustivel.addItem("GNV");

        JTextField campoQuantidade = new JTextField(20);

        painel.add(new JLabel("Tipo de Combustível:"));
        painel.add(comboBoxCombustivel);
        painel.add(new JLabel("Quantidade (litros):"));
        painel.add(campoQuantidade);

        int resultado = JOptionPane.showConfirmDialog(null, painel, "Abastecimento de Veículo", JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.PLAIN_MESSAGE);

        if (resultado == JOptionPane.OK_OPTION) {
            String tipoCombustivel = (String) comboBoxCombustivel.getSelectedItem();
            double quantidade = Double.parseDouble(campoQuantidade.getText());

            double valorAbastecimento = calcularValorAbastecimento(tipoCombustivel, quantidade);

            veiculo.setCapacidadeTanque(veiculo.getCapacidadeTanque() + quantidade);

            Gastos gastoAbastecimento = new Gastos();
            gastoAbastecimento.setTipo("Abastecimento");
            gastoAbastecimento.setDescricao("Abastecimento de " + tipoCombustivel + " (" + quantidade + " litros)");
            gastoAbastecimento.setValor(valorAbastecimento);

            veiculo.adicionarGasto(gastoAbastecimento);

            JOptionPane.showMessageDialog(null, "Abastecimento realizado com sucesso!");
        }
    }

    private double calcularValorAbastecimento(String tipoCombustivel, double quantidade) {
        switch (tipoCombustivel) {
            case "Álcool":
                return quantidade * 5.50;
            case "Gasolina":
                return quantidade * 6.00;
            case "Diesel":
                return quantidade * 5.20;
            case "GNV":
                return quantidade * 3.50;
            default:
                return 0.0;
        }
    }
}
