import javax.swing.JOptionPane;

public class MenuPrincipal {

    Veiculo veiculo = new Veiculo();
    Gastos gasto = new Gastos();

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
                    options[0]);

            switch (escolha) {
                case 0:

                    veiculo.cadastrarVeiculo();
                    break;
                case 1:
                    // veiculo.veiculosCadastrados();
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
                    exibirMenu();
                default:
                    throw new AssertionError();
            }
        }
    }
}
