package controle.Testes;

import java.util.ArrayList;
import javax.swing.*;

enum TipoCombustivel {
    GASOLINA, ALCOOL, FLEX, DIESEL, GNV;

    public static TipoCombustivel fromString(String text) {
        for (TipoCombustivel tipo : TipoCombustivel.values()) {
            if (tipo.name().equalsIgnoreCase(text)) {
                return tipo;
            }
        }
        return null;
    }
}

class VeiculoTeste {
    private String marca;
    private String modelo;
    private String anoModelo;
    private String anoFabricacao;
    private double motorizacao;
    private double capacidadeTanque;
    private TipoCombustivel tipoCombustivel;
    private String cor;
    private String placa;
    private int renavam;
    private int numeroPneus;
    private int numeroPassageiros;
    private ArrayList<Despesa> despesas;

    public VeiculoTeste(String marca, String modelo, String anoModelo, String anoFabricacao, double motorizacao, double capacidadeTanque, TipoCombustivel tipoCombustivel, String cor, String placa, int renavam, int numeroPneus, int numeroPassageiros) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoModelo = anoModelo;
        this.anoFabricacao = anoFabricacao;
        this.motorizacao = motorizacao;
        this.capacidadeTanque = capacidadeTanque;
        this.tipoCombustivel = tipoCombustivel;
        this.cor = cor;
        setPlaca(placa); // Utiliza o método para definir a placa corretamente
        this.renavam = renavam;
        this.numeroPneus = numeroPneus;
        this.numeroPassageiros = numeroPassageiros;
        this.despesas = new ArrayList<>();
    }

    public void setPlaca(String placa) {
        if (placa == null || !placa.matches("[A-Z]{3}-\\d{4}")) {
            throw new IllegalArgumentException("Formato de placa inválido. Use o formato AAA-1234.");
        }
        this.placa = placa.toUpperCase();
    }

    @Override
    public String toString() {
        return "MARCA: " + marca.toUpperCase() + "\nMODELO: " + modelo.toUpperCase() + "\nANO MODELO: " + anoModelo.toUpperCase() + "\nANO FABRICAÇÃO: " + anoFabricacao.toUpperCase() +
                "\nMOTORIZAÇÃO: " + motorizacao + "\nCAPACIDADE DO TANQUE: " + capacidadeTanque + "\nTIPO DE COMBUSTÍVEL: " + tipoCombustivel +
                "\nCOR: " + cor.toUpperCase() + "\nPLACA: " + placa.toUpperCase() + "\nRENAVAM: " + renavam + "\nNÚMERO DE PNEUS: " + numeroPneus + "\nNÚMERO DE PASSAGEIROS: " + numeroPassageiros;
    }

    public double calcularConsumoMedio() {
        // Exemplo de cálculo de consumo médio (ajuste conforme necessário)
        return motorizacao * capacidadeTanque / 100;
    }

    public void abastecerVeiculo() throws Exception {
        // Supondo que o tanque seja preenchido até a capacidade máxima
        System.out.println("Veículo abastecido com sucesso.");
    }

    public void inserirDespesa(String nome, String descricao, double valor) {
        Despesa novaDespesa = new Despesa(nome, descricao, valor);
        despesas.add(novaDespesa);
    }

    public double calcularDespesas() {
        double totalDespesas = 0;
        for (Despesa d : despesas) {
            totalDespesas += d.getValor();
        }
        return totalDespesas;
    }

    public String getPlaca() {
        return placa;
    }

    public ArrayList<Despesa> getDespesas() {
        return despesas;
    }
}

class Despesa {
    String nome;
    String descricao;
    double valor;

    public Despesa(String nome, String descricao, double valor) {
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
}

public class CadastroVeiculosTeste {
    private static ArrayList<VeiculoTeste> veiculoTestes = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            String[] options = {"Cadastrar Veículo", "Mostrar Veículos", "Manutenção", "Sair"};
            int choice = JOptionPane.showOptionDialog(null, "Escolha uma opção", "Menu Principal",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

            switch (choice) {
                case 0:
                    cadastrarVeiculoTeste();
                    break;
                case 1:
                    mostrarVeiculoTestes();
                    break;
                case 2:
                    menuManutencao();
                    break;
                case 3:
                    System.exit(0);
            }
        }
    }

    private static void cadastrarVeiculoTeste() {
        JTextField marcaField = new JTextField();
        JTextField modeloField = new JTextField();
        JTextField anoModeloField = new JTextField();
        JTextField anoFabricacaoField = new JTextField();
        JTextField motorizacaoField = new JTextField();
        JTextField capacidadeTanqueField = new JTextField();
        JComboBox<TipoCombustivel> tipoCombustivelBox = new JComboBox<>(TipoCombustivel.values());
        JTextField corField = new JTextField();
        JTextField placaField = new JTextField();
        JTextField renavamField = new JTextField();
        JTextField numeroPneusField = new JTextField();
        JTextField numeroPassageirosField = new JTextField();
        Object[] message = {
            "Marca:", marcaField,
            "Modelo:", modeloField,
            "Ano Modelo:", anoModeloField,
            "Ano Fabricação:", anoFabricacaoField,
            "Motorização:", motorizacaoField,
            "Capacidade do Tanque:", capacidadeTanqueField,
            "Tipo de Combustível:", tipoCombustivelBox,
            "Cor:", corField,
            "Placa (AAA-1234):", placaField,
            "Renavam:", renavamField,
            "Número de Pneus:", numeroPneusField,
            "Número de Passageiros:", numeroPassageirosField
        };

        int option = JOptionPane.showConfirmDialog(null, message, "Cadastrar Veículo", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) {
            try {
                String marca = marcaField.getText();
                String modelo = modeloField.getText();
                String anoModelo = anoModeloField.getText();
                String anoFabricacao = anoFabricacaoField.getText();
                double motorizacao = Double.parseDouble(motorizacaoField.getText());
                double capacidadeTanque = Double.parseDouble(capacidadeTanqueField.getText());
                TipoCombustivel tipoCombustivel = (TipoCombustivel) tipoCombustivelBox.getSelectedItem();
                String cor = corField.getText();
                String placa = placaField.getText();
                int renavam = Integer.parseInt(renavamField.getText());
                int numeroPneus = Integer.parseInt(numeroPneusField.getText());
                int numeroPassageiros = Integer.parseInt(numeroPassageirosField.getText());

                VeiculoTeste veiculoTeste = new VeiculoTeste(marca, modelo, anoModelo, anoFabricacao, motorizacao, capacidadeTanque, tipoCombustivel, cor, placa, renavam, numeroPneus, numeroPassageiros);
                veiculoTestes.add(veiculoTeste);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Erro: Certifique-se de que os campos numéricos contêm apenas números.", "Erro de Formato", JOptionPane.ERROR_MESSAGE);
            } catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage(), "Erro de Formato de Placa", JOptionPane.ERROR_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private static void mostrarVeiculoTestes() {
        StringBuilder sb = new StringBuilder();
        for (VeiculoTeste veiculoTeste : veiculoTestes) {
            sb.append(veiculoTeste).append("\n\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString(), "VEÍCULOS CADASTRADOS", JOptionPane.INFORMATION_MESSAGE);
    }

    private static void menuManutencao() {
        while (true) {
            String[] manutencaoOptions = {"Calcular e Abastecer Veículo", "Mostrar Despesas do Veículo", "Calcular Despesas Individuais", "Calcular Despesas Gerais", "Voltar"};
            int manutencaoChoice = JOptionPane.showOptionDialog(null, "Escolha uma opção de manutenção", "Menu de Manutenção",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, manutencaoOptions, manutencaoOptions[0]);

            switch (manutencaoChoice) {
                case 0:
                    calcularEAbastecer();
                    break;
                case 1:
                    mostrarDespesasVeiculo();
                    break;
                case 2:
                    calcularDespesasIndividuais();
                    break;
                case 3:
                    calcularDespesasGerais();
                    break;
                case 4:
                    return;
            }
        }
    }

    private static void calcularEAbastecer() {
        if (veiculoTestes.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhum veículo cadastrado.", "Calcular e Abastecer", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        String placaVeiculo = JOptionPane.showInputDialog("Digite a placa do veículo:");
        VeiculoTeste veiculo = null;

        for (VeiculoTeste v : veiculoTestes) {
            if (v.getPlaca().equalsIgnoreCase(placaVeiculo)) {
                veiculo = v;
                break;
            }
        }

        if (veiculo == null) {
            JOptionPane.showMessageDialog(null, "Veículo não encontrado.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            veiculo.abastecerVeiculo();
            JOptionPane.showMessageDialog(null, "Veículo abastecido com sucesso.", "Abastecimento", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private static void mostrarDespesasVeiculo() {
        if (veiculoTestes.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhum veículo cadastrado.", "Mostrar Despesas do Veículo", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        String placaVeiculo = JOptionPane.showInputDialog("Digite a placa do veículo:");
        VeiculoTeste veiculo = null;

        for (VeiculoTeste v : veiculoTestes) {
            if (v.getPlaca().equalsIgnoreCase(placaVeiculo)) {
                veiculo = v;
                break;
            }
        }

        if (veiculo == null) {
            JOptionPane.showMessageDialog(null, "Veículo não encontrado.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        StringBuilder sb = new StringBuilder();
        sb.append("Despesas do Veículo ").append(veiculo.getPlaca()).append(":\n\n");
        for (Despesa d : veiculo.getDespesas()) {
            sb.append("Nome: ").append(d.nome).append("\n");
            sb.append("Descrição: ").append(d.descricao).append("\n");
            sb.append("Valor: ").append(d.valor).append("\n\n");
        }

        JOptionPane.showMessageDialog(null, sb.toString(), "Despesas do Veículo", JOptionPane.INFORMATION_MESSAGE);
    }

    private static void calcularDespesasIndividuais() {
        if (veiculoTestes.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhum veículo cadastrado.", "Calcular Despesas Individuais", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        String placaVeiculo = JOptionPane.showInputDialog("Digite a placa do veículo:");
        VeiculoTeste veiculo = null;

        for (VeiculoTeste v : veiculoTestes) {
            if (v.getPlaca().equalsIgnoreCase(placaVeiculo)) {
                veiculo = v;
                break;
            }
        }

        if (veiculo == null) {
            JOptionPane.showMessageDialog(null, "Veículo não encontrado.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        double totalDespesas = veiculo.calcularDespesas();
        JOptionPane.showMessageDialog(null, String.format("Total de Despesas do Veículo %s: %.2f", veiculo.getPlaca(), totalDespesas), "Despesas Individuais", JOptionPane.INFORMATION_MESSAGE);
    }

    private static void calcularDespesasGerais() {
        if (veiculoTestes.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhum veículo cadastrado.", "Calcular Despesas Gerais", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        double totalDespesasGerais = 0;
        for (VeiculoTeste v : veiculoTestes) {
            totalDespesasGerais += v.calcularDespesas();
        }

        JOptionPane.showMessageDialog(null, String.format("Total de Despesas Gerais de Todos os Veículos: %.2f", totalDespesasGerais), "Despesas Gerais", JOptionPane.INFORMATION_MESSAGE);
    }
}
