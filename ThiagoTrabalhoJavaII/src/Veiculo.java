
import java.util.ArrayList;
import java.util.List;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Veiculo {
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
    private int assentos;

    private static List<Veiculo> veiculos = new ArrayList<>();

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

    public void setMotorizacao(double motorizacao) {
        this.motorizacao = motorizacao;
    }

    public double getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(double capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
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

    public int getNumerAssentos() {
        return assentos;
    }

    public void setNumerAssentos(int assentos) {
        this.assentos = assentos;
    }

    public void cadastrarVeiculo() {
        JPanel painel = new JPanel();
        painel.setLayout(new BoxLayout(painel, BoxLayout.Y_AXIS));

        JTextField campoMarca = new JTextField(20);
        JTextField campoModelo = new JTextField(20);
        JTextField campoAnoModelo = new JTextField(20);
        JTextField campoAnoFabricacao = new JTextField(20);
        JTextField campoMotorizacao = new JTextField(20);
        JTextField campoCapacidadeTanque = new JTextField(20);
        JTextField campoTipoCombustivel = new JTextField(20);
        JTextField campoCor = new JTextField(20);
        JTextField campoPlaca = new JTextField(20);
        JTextField campoRenavam = new JTextField(20);
        JTextField campoNumeroPneus = new JTextField(20);
        JTextField campoNumerAssentos = new JTextField(20);

        painel.add(new JLabel("Marca:"));
        painel.add(campoMarca);
        painel.add(new JLabel("Modelo:"));
        painel.add(campoModelo);
        painel.add(new JLabel("Ano Modelo:"));
        painel.add(campoAnoModelo);
        painel.add(new JLabel("Ano Fabricação:"));
        painel.add(campoAnoFabricacao);
        painel.add(new JLabel("Motorização:"));
        painel.add(campoMotorizacao);
        painel.add(new JLabel("Capacidade do Tanque (em litros):"));
        painel.add(campoCapacidadeTanque);
        painel.add(new JLabel("Tipo de Combustível:"));
        painel.add(campoTipoCombustivel);
        painel.add(new JLabel("Cor:"));
        painel.add(campoCor);
        painel.add(new JLabel("Placa:"));
        painel.add(campoPlaca);
        painel.add(new JLabel("Renavam:"));
        painel.add(campoRenavam);
        painel.add(new JLabel("Número de Pneus:"));
        painel.add(campoNumeroPneus);
        painel.add(new JLabel("Número de Assentos:"));
        painel.add(campoNumerAssentos);

        int resultado = JOptionPane.showConfirmDialog(null, painel, "Cadastro de Veículo", JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.PLAIN_MESSAGE);
        if (resultado == JOptionPane.OK_CANCEL_OPTION) {
            try {
                this.marca = campoMarca.getText();
                this.modelo = campoModelo.getText();
                this.anoModelo = campoAnoModelo.getText();
                this.anoFabricacao = campoAnoFabricacao.getText();
                this.motorizacao = Double.parseDouble(campoMotorizacao.getText());
                this.capacidadeTanque = Double.parseDouble(campoCapacidadeTanque.getText());
                this.tipoCombustivel = campoTipoCombustivel.getText();
                this.cor = campoCor.getText();
                this.placa = campoPlaca.getText();
                this.renavam = Integer.parseInt(campoRenavam.getText());
                this.numeroPneus = Integer.parseInt(campoNumeroPneus.getText());
                this.assentos = Integer.parseInt(campoNumerAssentos.getText());

                veiculos.add(this);

                JOptionPane.showMessageDialog(null, "Veículo cadastrado com sucesso!", "Sucesso",
                        JOptionPane.INFORMATION_MESSAGE);

                System.out.println("Veículo cadastrado com sucesso!");
                System.out.println("Marca: " + this.marca);
                System.out.println("Modelo: " + this.modelo);
                System.out.println("Ano Modelo: " + this.anoModelo);
                System.out.println("Ano Fabricação: " + this.anoFabricacao);
                System.out.println("Motorização: " + this.motorizacao);
                System.out.println("Capacidade do Tanque: " + this.capacidadeTanque);
                System.out.println("Tipo de Combustível: " + this.tipoCombustivel);
                System.out.println("Cor: " + this.cor);
                System.out.println("Placa: " + this.placa);
                System.out.println("Renavam: " + this.renavam);
                System.out.println("Número de Pneus: " + this.numeroPneus);
                System.out.println("Número de Passageiros: " + this.assentos);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,
                        "Erro ao processar os dados. Verifique se todos os campos numéricos estão corretos.", "Erro",
                        JOptionPane.ERROR_MESSAGE);
            }
        } else {
            System.out.println("Operação cancelada");
        }
    }

    public void veiculosCadastrados() {
        String mensagem = String.format("Veículo cadastrado:\n" +
                "Marca: %s\nModelo: %s\nAno Modelo: %s\nAno Fabricação: %s\n" +
                "Motorização: %.2f\nCapacidade do Tanque: %.2f\nTipo de Combustível: %s\n" +
                "Cor: %s\nPlaca: %s\nRenavam: %d\nNúmero de Pneus: %d\nNúmero de Assentos: %d",
                this.marca, this.modelo, this.anoModelo, this.anoFabricacao,
                this.motorizacao, this.capacidadeTanque, this.tipoCombustivel,
                this.cor, this.placa, this.renavam, this.numeroPneus, this.assentos);
        JOptionPane.showMessageDialog(null, mensagem, "Dados do Veículo", JOptionPane.INFORMATION_MESSAGE);
    }

}
