import javax.swing.JOptionPane;

public class MenuPrincipal {
    public void exibirMenu() {

        while (true) {
            String[] options = new String[] { "Cadastrar Veículo", "Veículos Cadastrados", "Gestão de Gastos", "Sair" };
            int escolha = JOptionPane.showOptionDialog(
                    null,
                    "Escolha uma opção",
                    "Bem-vindo à Turistando",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    options,
                    options[1]);

            switch (escolha) {
                case 1:
                    Veiculo veiculo = new Veiculo();
                    veiculo.cadastrarVeiculo();
                    break;
                case 2:
                    // veiculo.veiculosCadastrados();
                    break;
                case 3:
                    // Lógica para "Gestão de Gastos"
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        }
    }

    public void menuGastos() {
        Gastos gasto = new Gastos();
        while (true) {
            String[] options = new String[] { "Cadastrar Despesa", "Mostrar Despesas Cadastradas", "Voltar" };
            int escolha = JOptionPane.showOptionDialog(
                    null,
                    "Selecione",
                    "Gestão de Gastos",
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
                    System.exit(0);
                default:
                    throw new AssertionError();
            }
        }
    }
}
