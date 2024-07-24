package controle.VersaoFinal.classes;

import controle.VersaoFinal.enums.TipoCombustivel;
import controle.VersaoFinal.interfaces.CadastroVeiculo;
import java.util.ArrayList;
import java.util.List;

public class Veiculo implements CadastroVeiculo {
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

    public int getNumeroPassageiros() {
        return numeroPassageiros;
    }

    public void setNumeroPassageiros(int numeroPassageiros) {
        this.numeroPassageiros = numeroPassageiros;
    }

    public List<Despesa> getDespesas() {
        return despesas;
    }

    public void setDespesas(List<Despesa> despesas) {
        this.despesas = despesas;
    }

    public Veiculo() {
        despesas = new ArrayList<>();
    }

    @Override
    public void cadastrarVeiculo() {

    }

    @Override
    public void mostrarVeiculo() {

    }

    public void adicionarDespesa(Despesa despesa) {
        despesas.add(despesa);
    }

    public double getTotalDespesas() {
        double total = 0.0;
        for (Despesa despesa : despesas) {
            total += despesa.getPreco();
        }
        return total;
    }
}
