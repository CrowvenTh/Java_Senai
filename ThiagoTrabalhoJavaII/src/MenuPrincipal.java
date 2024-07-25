import javax.swing.JOptionPane;

public class MenuPrincipal {
    public void exibirMenu() {
        Veiculo veiculo = new Veiculo();
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
                    veiculo.veiculosCadastrados();
                    break;
                case 2:
                    // Lógica para "Gestão de Gastos"
                    break;
                case 3:
                    System.exit(0);
                    break;
            }
        }
    }
}
