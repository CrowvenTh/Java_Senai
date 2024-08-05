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
                    veiculo.listarVeiculosCadastrados();
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
            String[] options = new String[] { "Cadastrar Despesa", "Abastecer Veículo", "Mostrar Despesas Cadastradas", "Voltar" };
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
                    gasto.cadastrarGasto(veiculo);
                    break;
                case 1:
                    gasto.abastecerVeiculo(veiculo);
                    break;
                case 2:
                    gasto.mostrarGastos();
                    break;
                case 3:
                    exibirMenu();
                    break;
                default:
                    throw new AssertionError();
            }
        }
    }
}
