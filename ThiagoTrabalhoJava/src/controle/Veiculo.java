// package controle;

import java.util.ArrayList;
import javax.swing.*;

public class Veiculo {
    private String marca;
    private String modelo;
    private String anoModelo;
    private String anoFabricacao;
    private double motorizacao;
    private double capacidadeTanque;
    private String tipoCombustível;
    private String cor;
    private String placa;
    private int renavan;

    // Getters e Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(String anoModelo) {
        this.anoModelo = anoModelo;
    }

    public String getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(String anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public double getMotorizacao() {
        return motorizacao;
    }

    public void setMotorizacao(Double motorizacao) {
        this.motorizacao = motorizacao;
    }

    public double getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(double capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public String getTipoCombustível() {
        return tipoCombustível;
    }

    public void setTipoCombustível(String tipoCombustível) {
        this.tipoCombustível = tipoCombustível;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getRenavan() {
        return renavan;
    }

    public void setRenavan(int renavan) {
        this.renavan = renavan;
    }

    @Override
    public String toString() {
        return "Marca: " + marca + "\nModelo: " + modelo + "\nAno Modelo: " + anoModelo + 
                "\nAno Fabricação: " + anoFabricacao + "\nMotorização: " + motorizacao + 
                "\nCapacidade do Tanque: " + capacidadeTanque + "\nTipo de Combustível: " + tipoCombustível + 
                "\nCor: " + cor + "\nPlaca: " + placa + "\nRenavam: " + renavan + "\n";
    }

    public static void main(String[] args) {
        ArrayList<Veiculo> listaVeiculos = new ArrayList<>();

        while (true) {
            String[] opcoes = {"Cadastrar novo veículo", "Exibir cadastros", "Sair"};
            int escolha = JOptionPane.showOptionDialog(null, "Escolha uma opção", "Menu - Turistando",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);

            if (escolha == 0) {
                // Cadastro de um novo veículo
                JTextField marcaField = new JTextField();
                JTextField modeloField = new JTextField();
                JTextField anoModeloField = new JTextField();
                JTextField anoFabricacaoField = new JTextField();
                JTextField motorizacaoField = new JTextField();
                JTextField capacidadeTanqueField = new JTextField();
                JTextField tipoCombustivelField = new JTextField();
                JTextField corField = new JTextField();
                JTextField placaField = new JTextField();
                JTextField renavanField = new JTextField();

                JPanel panel = new JPanel(new java.awt.GridLayout(0, 2));
                panel.add(new JLabel("Marca:"));
                panel.add(marcaField);
                panel.add(new JLabel("Modelo:"));
                panel.add(modeloField);
                panel.add(new JLabel("Ano Modelo:"));
                panel.add(anoModeloField);
                panel.add(new JLabel("Ano Fabricação:"));
                panel.add(anoFabricacaoField);
                panel.add(new JLabel("Motorização:"));
                panel.add(motorizacaoField);
                panel.add(new JLabel("Capacidade do Tanque:"));
                panel.add(capacidadeTanqueField);
                panel.add(new JLabel("Tipo de Combustível:"));
                panel.add(tipoCombustivelField);
                panel.add(new JLabel("Cor:"));
                panel.add(corField);
                panel.add(new JLabel("Placa:"));
                panel.add(placaField);
                panel.add(new JLabel("Renavam:"));
                panel.add(renavanField);

                int result = JOptionPane.showConfirmDialog(null, panel, "Cadastro de Veículo",
                        JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

                if (result == JOptionPane.OK_OPTION) {
                    Veiculo veiculo = new Veiculo();
                    veiculo.setMarca(marcaField.getText());
                    veiculo.setModelo(modeloField.getText());
                    veiculo.setAnoModelo(anoModeloField.getText());
                    veiculo.setAnoFabricacao(anoFabricacaoField.getText());
                    veiculo.setMotorizacao(Double.parseDouble(motorizacaoField.getText()));
                    veiculo.setCapacidadeTanque(Double.parseDouble(capacidadeTanqueField.getText()));
                    veiculo.setTipoCombustível(tipoCombustivelField.getText());
                    veiculo.setCor(corField.getText());
                    veiculo.setPlaca(placaField.getText());
                    veiculo.setRenavan(Integer.parseInt(renavanField.getText()));

                    listaVeiculos.add(veiculo);
                }

            } else if (escolha == 1) {
                // Exibir cadastros
                StringBuilder sb = new StringBuilder();
                for (Veiculo veiculo : listaVeiculos) {
                    sb.append(veiculo.toString()).append("\n");
                }
                JOptionPane.showMessageDialog(null, sb.toString(), "Cadastros", JOptionPane.INFORMATION_MESSAGE);

            } else {
                // Sair
                break;
            }
        }
    }
}
