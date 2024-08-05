package controle;

import javax.swing.*;

public class MenuPrincipal {

    Veiculo veiculo = new Veiculo();
    Gastos gasto = new Gastos();

    public void exibirMenu() {

        while (true) {
            String[] options = new String[] { "Cadastrar Veículo", "Veículos Cadastrados", "Gestão de controle", "Sair" };
            int escolha = JOptionPane.showOptionDialog(
                    null,
                    "Escolha uma opção",
                    "Bem-vindo à Turistando",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    options,
                    options[0]);

            switch (escolha) {
                case 0:

                    veiculo.cadastrarVeiculo();
                    break;
                case 1:
                    veiculo.mostrarVeiculos();
                    break;
                case 2:
                    menuGastos();
                    break;
                case 3:
                    System.exit(0);
                    break;
            }
        }
    }

    public void menuGastos() {

        while (true) {
            String[] options = new String[] { "Cadastrar Despesa", "Mostrar Despesas Cadastradas","Abastecer veiculo", "Voltar" };
            int escolha = JOptionPane.showOptionDialog(
                    null,
                    "Selecione",
                    "Gestão de controle.MenuPrincipal.Gastos",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    options,
                    options[0]);

            switch (escolha) {
                case 0:
                    gasto.cadastrarGasto();
                    break;
                case 1:
                    gasto.mostrarGasto();
                    break;
                case 2:
                    // abastecimento do veculo
                default:
                    throw new AssertionError();
            }
        }
    }

    public static class Gastos {
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
}
