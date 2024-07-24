package controle.Testes.visao;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

public class Veiculo{
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
    private List<Despesa> despesas;

    private static final DecimalFormat decimalFormat = new DecimalFormat("0.0");

    public Veiculo() {
        despesas = new ArrayList<>();
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca.toUpperCase();
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo.toUpperCase();
    }

    public String getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(String anoModelo) {
        this.anoModelo = anoModelo.toUpperCase();
    }

    public String getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(String anoFabricacao) {
        this.anoFabricacao = anoFabricacao.toUpperCase();
    }

    public double getMotorizacao() {
        return motorizacao;
    }

    public void setMotorizacao(double motorizacao) {
        this.motorizacao = Math.round(motorizacao * 10.0) / 10.0;
    }

    public String getMotorizacaoFormatada() {
        return decimalFormat.format(motorizacao);
    }

    public double getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(double capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public String getCapacidadeTanqueFormatada() {
        return ((int) capacidadeTanque) + "L";
    }

    public TipoCombustivel getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(TipoCombustivel tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor.toUpperCase();
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa.toUpperCase();
    }

    public int getRenavam() {
        return renavam;
    }

    public void setRenavam(int renavam) {
        this.renavam = renavam;
    }

    public int getNumeroPneus() {
        return numeroPneus;
    }

    public void setNumeroPneus(int numeroPneus) {
        this.numeroPneus = numeroPneus;
    }

    public int getNumeroPassageiros() {
        return numeroPassageiros;
    }

    public void setNumeroPassageiros(int numeroPassageiros) {
        this.numeroPassageiros = numeroPassageiros;
    }

    public void adicionarDespesa(Despesa despesa) {
        despesas.add(despesa);
    }

    public List<Despesa> getDespesas() {
        return despesas;
    }

    public double getTotalDespesas() {
        double total = 0.0;
        for (Despesa despesa : despesas) {
            total += despesa.getPreco();
        }
        return total;
    }

    public static void main(String[] args) {
        menuPrincipal();
    }

    public static void menuPrincipal() {
        List<Veiculo> Veiculos = new ArrayList<>();

        while (true) {
            String escolha = (String) JOptionPane.showInputDialog(
                    null,
                    "Escolha uma opção:",
                    "Menu Principal",
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    new String[] { "Cadastrar Veículo", "Mostrar Veículo", "Cadastrar Despesa", "Gestão de Gastos", "Abastecer Veículo", "Sair" },
                    "Cadastrar Veículo");

            if (escolha == null) {
                
                continue;
            }

            switch (escolha) {
                case "Cadastrar Veículo":
                    cadastrarVeiculo(Veiculos);
                    break;
                case "Mostrar Veículo":
                    mostrarVeiculo(selecionarVeiculo(Veiculos));
                    break;
                case "Cadastrar Despesa":
                    cadastrarDespesa(selecionarVeiculo(Veiculos));
                    break;
                case "Gestão de Gastos":
                    gestaoGastos(selecionarVeiculo(Veiculos));
                    break;
                case "Abastecer Veículo":
                    abastecerVeiculo(selecionarVeiculo(Veiculos));
                    break;
                case "Sair":
                    System.exit(0);
                    break;
            }
        }
    }

    public static void cadastrarVeiculo(List<Veiculo> Veiculos) {
        Veiculo Veiculo = new Veiculo();

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JTextField marcaField = new JTextField(10);
        JTextField modeloField = new JTextField(10);
        JTextField anoModeloField = new JTextField(10);
        JTextField anoFabricacaoField = new JTextField(10);
        JTextField motorizacaoField = new JTextField(10);
        JTextField capacidadeTanqueField = new JTextField(10);
        JComboBox<TipoCombustivel> tipoCombustivelCombo = new JComboBox<>(TipoCombustivel.values());
        JTextField corField = new JTextField(10);
        JTextField placaField = new JTextField(10);
        JTextField renavamField = new JTextField(10);
        JTextField numeroPneusField = new JTextField(10);
        JTextField numeroPassageirosField = new JTextField(10);

        panel.add(new JLabel("Marca:"));
        panel.add(marcaField);
        panel.add(new JLabel("Modelo:"));
        panel.add(modeloField);
        panel.add(new JLabel("Ano do Modelo:"));
        panel.add(anoModeloField);
        panel.add(new JLabel("Ano de Fabricação:"));
        panel.add(anoFabricacaoField);
        panel.add(new JLabel("Motorização (0.0):"));
        panel.add(motorizacaoField);
        panel.add(new JLabel("Capacidade do Tanque (em litros):"));
        panel.add(capacidadeTanqueField);
        panel.add(new JLabel("Tipo de Combustível:"));
        panel.add(tipoCombustivelCombo);
        panel.add(new JLabel("Cor:"));
        panel.add(corField);
        panel.add(new JLabel("Placa:"));
        panel.add(placaField);
        panel.add(new JLabel("Renavam:"));
        panel.add(renavamField);
        panel.add(new JLabel("Número de Pneus:"));
        panel.add(numeroPneusField);
        panel.add(new JLabel("Número de Passageiros:"));
        panel.add(numeroPassageirosField);

        int option = JOptionPane.showConfirmDialog(null, panel, "Cadastrar Veículo", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        if (option == JOptionPane.OK_OPTION) {
            Veiculo.setMarca(marcaField.getText());
            Veiculo.setModelo(modeloField.getText());
            Veiculo.setAnoModelo(anoModeloField.getText());
            Veiculo.setAnoFabricacao(anoFabricacaoField.getText());
            Veiculo.setMotorizacao(Double.parseDouble(motorizacaoField.getText()));
            Veiculo.setCapacidadeTanque(Double.parseDouble(capacidadeTanqueField.getText()));
            Veiculo.setTipoCombustivel((TipoCombustivel) tipoCombustivelCombo.getSelectedItem());
            Veiculo.setCor(corField.getText());
            Veiculo.setPlaca(placaField.getText());
            Veiculo.setRenavam(Integer.parseInt(renavamField.getText()));
            Veiculo.setNumeroPneus(Integer.parseInt(numeroPneusField.getText()));
            Veiculo.setNumeroPassageiros(Integer.parseInt(numeroPassageirosField.getText()));

            Veiculos.add(Veiculo);

            JOptionPane.showMessageDialog(null, "Veículo cadastrado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void mostrarVeiculo(Veiculo Veiculo) {
        if (Veiculo != null) {
            JPanel panel = new JPanel();
            panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

            panel.add(new JLabel("Marca: " + Veiculo.getMarca()));
            panel.add(new JLabel("Modelo: " + Veiculo.getModelo()));
            panel.add(new JLabel("Ano do Modelo: " + Veiculo.getAnoModelo()));
            panel.add(new JLabel("Ano de Fabricação: " + Veiculo.getAnoFabricacao()));
            panel.add(new JLabel("Motorização: " + Veiculo.getMotorizacaoFormatada()));
            panel.add(new JLabel("Capacidade do Tanque: " + Veiculo.getCapacidadeTanqueFormatada()));
            panel.add(new JLabel("Tipo de Combustível: " + Veiculo.getTipoCombustivel()));
            panel.add(new JLabel("Cor: " + Veiculo.getCor()));
            panel.add(new JLabel("Placa: " + Veiculo.getPlaca()));
            panel.add(new JLabel("Renavam: " + Veiculo.getRenavam()));
            panel.add(new JLabel("Número de Pneus: " + Veiculo.getNumeroPneus()));
            panel.add(new JLabel("Número de Passageiros: " + Veiculo.getNumeroPassageiros()));

            JOptionPane.showMessageDialog(null, panel, "Veículo Cadastrado", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void cadastrarDespesa(Veiculo Veiculo) {
        if (Veiculo != null) {
            JPanel panel = new JPanel();
            panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

            JComboBox<TipoDespesa> tipoDespesaCombo = new JComboBox<>(TipoDespesa.values());
            JTextField descricaoField = new JTextField(20);
            JTextField precoField = new JTextField(10);

            panel.add(new JLabel("Tipo de Despesa:"));
            panel.add(tipoDespesaCombo);
            panel.add(new JLabel("Descrição:"));
            panel.add(descricaoField);
            panel.add(new JLabel("Preço:"));
            panel.add(precoField);

            int option = JOptionPane.showConfirmDialog(null, panel, "Cadastrar Despesa", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
            if (option == JOptionPane.OK_OPTION) {
                TipoDespesa tipoDespesa = (TipoDespesa) tipoDespesaCombo.getSelectedItem();
                String descricao = descricaoField.getText();
                double preco = Double.parseDouble(precoField.getText());

                Despesa despesa = new Despesa(tipoDespesa, descricao, preco);
                Veiculo.adicionarDespesa(despesa);

                JOptionPane.showMessageDialog(null, "Despesa cadastrada com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    public static void gestaoGastos(Veiculo Veiculo) {
        if (Veiculo != null) {
            JPanel panel = new JPanel();
            panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

            double totalDespesas = Veiculo.getTotalDespesas();
            String mensagem = String.format("Total de despesas do veículo: R$ %.2f", totalDespesas);

            JOptionPane.showMessageDialog(null, mensagem, "Gestão de Gastos", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void abastecerVeiculo(Veiculo Veiculo) {
        if (Veiculo != null) {
            JPanel panel = new JPanel();
            panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

            JComboBox<TipoCombustivel> tipoCombustivelCombo = new JComboBox<>(TipoCombustivel.values());
            JTextField capacidadeTanqueField = new JTextField(10);

            panel.add(new JLabel("Tipo de Combustível:"));
            panel.add(tipoCombustivelCombo);
            panel.add(new JLabel("Capacidade do Tanque (em litros):"));
            panel.add(capacidadeTanqueField);

            int option = JOptionPane.showConfirmDialog(null, panel, "Abastecer Veículo", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
            if (option == JOptionPane.OK_OPTION) {
                TipoCombustivel tipoCombustivel = (TipoCombustivel) tipoCombustivelCombo.getSelectedItem();
                double capacidadeTanque = Double.parseDouble(capacidadeTanqueField.getText());

                double precoPorLitro = 0.0;
                switch (tipoCombustivel) {
                    case GASOLINA:
                        precoPorLitro = 5.0; 
                        break;
                    case ALCOOL:
                        precoPorLitro = 3.5; 
                        break;
                    case FLEX:
                        precoPorLitro = 4.0; 
                        break;
                    case ETANOL:
                        precoPorLitro = 3.0; 
                        break;
                    case ADITIVADO:
                        precoPorLitro = 5.5; 
                        break;
                    case DIESEL:
                        precoPorLitro = 4.5; 
                        break;
                    case GNV:
                        precoPorLitro = 2.0; 
                        break;
                }

                double precoTotal = capacidadeTanque * precoPorLitro;
                String capacidadeFormatada = Veiculo.getCapacidadeTanqueFormatada();
                String mensagem = String.format("O custo para abastecer %s é: R$ %.2f", capacidadeFormatada, precoTotal);
                JOptionPane.showMessageDialog(null, mensagem, "Abastecimento", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
}

class Despesa {
    private TipoDespesa tipoDespesa;
    private String descricao;
    private double preco;

    public Despesa(TipoDespesa tipoDespesa, String descricao, double preco) {
        this.tipoDespesa = tipoDespesa;
        this.descricao = descricao.toUpperCase();
        this.preco = preco;
    }

    public TipoDespesa getTipoDespesa() {
        return tipoDespesa;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }
}

enum TipoCombustivel {
    GASOLINA, ALCOOL, FLEX, ETANOL, ADITIVADO, DIESEL, GNV;
}

enum TipoDespesa {
    MANUTENCAO("Manutenção"),
    MULTA("Multa"),
    PEDAGIO("Pedágio"),
    BALSA("Balsa"),
    OUTROS("Outros");

    private final String descricao;

    TipoDespesa(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
