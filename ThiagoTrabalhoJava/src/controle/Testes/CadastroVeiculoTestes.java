package controle.Testes;

import java.util.ArrayList;
import javax.swing.*;

class VeiculoTeste {
    private String marca;
    private String modelo;
    private String anoModelo;
    private String anoFabricacao;
    private double motorizacao;
    private double capacidadeTanque;
    private String tipoCombustivel;
    private String cor;
    private String placa;
    private int renavam;
    private int numeroPneus;
    private int numeroPassageiros;

    public VeiculoTeste(String marca, String modelo, String anoModelo, String anoFabricacao, double motorizacao, double capacidadeTanque, String tipoCombustivel, String cor, String placa, int renavam, int numeroPneus, int numeroPassageiros) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoModelo = anoModelo;
        this.anoFabricacao = anoFabricacao;
        this.motorizacao = motorizacao;
        this.capacidadeTanque = capacidadeTanque;
        this.tipoCombustivel = tipoCombustivel;
        this.cor = cor;
        this.placa = placa;
        this.renavam = renavam;
        this.numeroPneus = numeroPneus;
        this.numeroPassageiros = numeroPassageiros;
    }

    @Override
    public String toString() {
        return "Marca: " + marca + "\nModelo: " + modelo + "\nAno Modelo: " + anoModelo + "\nAno Fabricação: " + anoFabricacao +
                "\nMotorização: " + motorizacao + "\nCapacidade do Tanque: " + capacidadeTanque + "\nTipo de Combustível: " + tipoCombustivel +
                "\nCor: " + cor + "\nPlaca: " + placa + "\nRenavam: " + renavam + "\nNúmero de Pneus: " + numeroPneus + "\nNúmero de Passageiros: " + numeroPassageiros;
    }

    public double calcularConsumoMedio() {
        // Exemplo de cálculo de consumo médio (ajuste conforme necessário)
        return motorizacao * capacidadeTanque / 100;
    }
}

public class CadastroVeiculoTestes {
    private static ArrayList<VeiculoTeste> veiculoTestes = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            String[] options = {"Cadastrar Veículo", "Mostrar Veículos", "Calcular Média de Consumo", "Sair"};
            int choice = JOptionPane.showOptionDialog(null, "Escolha uma opção", "Menu",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

            switch (choice) {
                case 0:
                    cadastrarVeiculoTeste();
                    break;
                case 1:
                    mostrarVeiculoTestes();
                    break;
                case 2:
                    calcularMediaConsumo();
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
        JTextField tipoCombustivelField = new JTextField();
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
            "Tipo de Combustível:", tipoCombustivelField,
            "Cor:", corField,
            "Placa:", placaField,
            "Renavam:", renavamField,
            "Número de Pneus:", numeroPneusField,
            "Número de Passageiros:", numeroPassageirosField
        };

        int option = JOptionPane.showConfirmDialog(null, message, "Cadastrar Veículo", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) {
            String marca = marcaField.getText();
            String modelo = modeloField.getText();
            String anoModelo = anoModeloField.getText();
            String anoFabricacao = anoFabricacaoField.getText();
            double motorizacao = Double.parseDouble(motorizacaoField.getText());
            double capacidadeTanque = Double.parseDouble(capacidadeTanqueField.getText());
            String tipoCombustivel = tipoCombustivelField.getText();
            String cor = corField.getText();
            String placa = placaField.getText();
            int renavam = Integer.parseInt(renavamField.getText());
            int numeroPneus = Integer.parseInt(numeroPneusField.getText());
            int numeroPassageiros = Integer.parseInt(numeroPassageirosField.getText());

            VeiculoTeste veiculoTeste = new VeiculoTeste(marca, modelo, anoModelo, anoFabricacao, motorizacao, capacidadeTanque, tipoCombustivel, cor, placa, renavam, numeroPneus, numeroPassageiros);
            veiculoTestes.add(veiculoTeste);
        }
    }

    private static void mostrarVeiculoTestes() {
        StringBuilder sb = new StringBuilder();
        for (VeiculoTeste veiculoTeste : veiculoTestes) {
            sb.append(veiculoTeste).append("\n\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString(), "Veículos Cadastrados", JOptionPane.INFORMATION_MESSAGE);
    }

    private static void calcularMediaConsumo() {
        if (veiculoTestes.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhum veículo cadastrado.", "Média de Consumo", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        double somaConsumo = 0;
        for (VeiculoTeste veiculoTeste : veiculoTestes) {
            somaConsumo += veiculoTeste.calcularConsumoMedio();
        }

        double mediaConsumo = somaConsumo / veiculoTestes.size();
        String relatorio = String.format("Média de Consumo dos Veículos: %.2f", mediaConsumo);
        JOptionPane.showMessageDialog(null, relatorio, "Média de Consumo", JOptionPane.INFORMATION_MESSAGE);
    }
}