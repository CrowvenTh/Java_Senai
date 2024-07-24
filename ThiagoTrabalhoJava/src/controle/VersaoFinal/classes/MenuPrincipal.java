package controle.VersaoFinal.classes;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class MenuPrincipal {
    private List<Veiculo> veiculos;

    public MenuPrincipal() {
        veiculos = new ArrayList<>();
    }

    public void exibirMenu() {
        while (true) {
            String escolha = (String) JOptionPane.showInputDialog(
                    null,
                    "Escolha uma opção:",
                    "Menu Principal",
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    new String[] { "Cadastrar Veículo", "Mostrar Veículo", "Cadastrar Despesa", "Gestão de Gastos",
                            "Abastecer Veículo", "Sair" },
                    "Cadastrar Veículo");

            if (escolha == null) {
                continue;
            }

            switch (escolha) {
                case "Cadastrar Veículo":
                    cadastrarNovoVeiculo();
                    break;
                case "Mostrar Veículo":
                    mostrarVeiculo();
                    break;
                case "Cadastrar Despesa":
                    // cadastrarDespesa();
                    break;
                case "Gestão de Gastos":
                    gestaoGastos();
                    break;
                case "Abastecer Veículo":
                    // abastecerVeiculo();
                    break;
                case "Sair":
                    System.exit(0);
                    break;
            }
        }
    }

    private void cadastrarNovoVeiculo() {
        Veiculo veiculo = new Veiculo();
        veiculo.cadastrarVeiculo();
        veiculos.add(veiculo);
    }

    private void mostrarVeiculo() {
        if (!veiculos.isEmpty()) {
            Veiculo veiculoSelecionado = selecionarVeiculo();
            if (veiculoSelecionado != null) {
                veiculoSelecionado.mostrarVeiculo();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Não há veículos cadastrados.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    /*
     * private void cadastrarDespesa() {
     * if (!veiculos.isEmpty()) {
     * Veiculo veiculoSelecionado = selecionarVeiculo();
     * if (veiculoSelecionado != null) {
     * veiculoSelecionado.cadastrarDespesa();
     * }
     * } else {
     * JOptionPane.showMessageDialog(null, "Não há veículos cadastrados.", "Erro",
     * JOptionPane.ERROR_MESSAGE);
     * }
     * }
     */
    private void gestaoGastos() {
        if (!veiculos.isEmpty()) {
            Veiculo veiculoSelecionado = selecionarVeiculo();
            if (veiculoSelecionado != null) {
                double totalDespesas = veiculoSelecionado.getTotalDespesas();
                JOptionPane.showMessageDialog(null,
                        String.format("Total de despesas do veículo: R$ %.2f", totalDespesas), "Gestão de Gastos",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Não há veículos cadastrados.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    /*
     * private void abastecerVeiculo() {
     * if (!veiculos.isEmpty()) {
     * Veiculo veiculoSelecionado = selecionarVeiculo();
     * if (veiculoSelecionado != null) {
     * veiculoSelecionado.abastecerVeiculo();
     * }
     * } else {
     * JOptionPane.showMessageDialog(null, "Não há veículos cadastrados.", "Erro",
     * JOptionPane.ERROR_MESSAGE);
     * }
     * }
     */

    private Veiculo selecionarVeiculo() {
        String[] opcoes = veiculos.stream()
                .map(veiculo -> veiculo.getMarca() + " " + veiculo.getModelo() + " (" + veiculo.getPlaca() + ")")
                .toArray(String[]::new);

        String escolha = (String) JOptionPane.showInputDialog(
                null,
                "Selecione um veículo:",
                "Selecionar Veículo",
                JOptionPane.PLAIN_MESSAGE,
                null,
                opcoes,
                opcoes[0]);

        if (escolha != null) {
            for (Veiculo veiculo : veiculos) {
                if (escolha.contains(veiculo.getPlaca())) {
                    return veiculo;
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        MenuPrincipal menuPrincipal = new MenuPrincipal();
        menuPrincipal.exibirMenu();
    }
}
