import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

public class Veiculo {
    protected String marca;
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
        this.tipoCombustivel = tipoCombustivel.toUpperCase();
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

    public int getAssentos() {
        return assentos;
    }

    public void setAssentos(int assentos) {
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
        if (resultado == JOptionPane.OK_OPTION) {
            Veiculo novoVeiculo = new Veiculo();
            novoVeiculo.setMarca(campoMarca.getText());
            novoVeiculo.setModelo(campoModelo.getText());
            novoVeiculo.setAnoModelo(campoAnoModelo.getText());
            novoVeiculo.setAnoFabricacao(campoAnoFabricacao.getText());
            novoVeiculo.setMotorizacao(Double.parseDouble(campoMotorizacao.getText()));
            novoVeiculo.setCapacidadeTanque(Double.parseDouble(campoCapacidadeTanque.getText()));
            novoVeiculo.setTipoCombustivel(campoTipoCombustivel.getText());
            novoVeiculo.setCor(campoCor.getText());
            novoVeiculo.setPlaca(campoPlaca.getText());
            novoVeiculo.setRenavam(Integer.parseInt(campoRenavam.getText()));
            novoVeiculo.setNumeroPneus(Integer.parseInt(campoNumeroPneus.getText()));
            novoVeiculo.setAssentos(Integer.parseInt(campoNumerAssentos.getText()));

            veiculos.add(novoVeiculo);

            JOptionPane.showMessageDialog(null, "Veículo cadastrado com sucesso!", "Sucesso",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void listarVeiculosCadastrados() {
        if (veiculos.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Não há veículos cadastrados ainda.", "Lista de Veículos",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            StringBuilder sb = new StringBuilder();
            for (Veiculo veiculo : veiculos) {
                sb.append("Marca: ").append(veiculo.getMarca()).append("\n");
                sb.append("Modelo: ").append(veiculo.getModelo()).append("\n");
                sb.append("Ano Modelo: ").append(veiculo.getAnoModelo()).append("\n");
                sb.append("Ano Fabricação: ").append(veiculo.getAnoFabricacao()).append("\n");
                sb.append("Motorização: ").append(veiculo.getMotorizacao()).append("\n");
                sb.append("Capacidade do Tanque: ").append(veiculo.getCapacidadeTanque()).append("\n");
                sb.append("Tipo de Combustível: ").append(veiculo.getTipoCombustivel()).append("\n");
                sb.append("Cor: ").append(veiculo.getCor()).append("\n");
                sb.append("Placa: ").append(veiculo.getPlaca()).append("\n");
                sb.append("Renavam: ").append(veiculo.getRenavam()).append("\n");
                sb.append("Número de Pneus: ").append(veiculo.getNumeroPneus()).append("\n");
                sb.append("Número de Assentos: ").append(veiculo.getAssentos()).append("\n\n");
            }
            JOptionPane.showMessageDialog(null, sb.toString(), "Veículos Cadastrados", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void adicionarGasto(Gastos gastos) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'adicionarGasto'");
    }
}
