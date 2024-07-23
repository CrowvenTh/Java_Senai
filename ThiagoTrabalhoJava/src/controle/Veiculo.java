package controle;

import java.util.Scanner;

public class Veiculo implements Automovel {
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

    public int getrenavam() {
        return renavam;
    }

    public void setrenavam(int renavam) {
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

    public void cadastrarVeiculo() {
        
          Scanner entrada = new Scanner(System.in);
          System.out.println("=== Insira os dados do veículo ===");
          System.out.println("Marca: ");
          this.marca = entrada.next();
          System.out.println("Modelo: ");
          this.modelo = entrada.next();
          System.out.println("Ano do modelo: ");
          this.anoModelo = entrada.next();
          System.out.println("Ano de Fabricação: ");
          this.anoFabricacao = entrada.next();
          System.out.println("Motorização: ");
          this.motorizacao = entrada.nextDouble();
          System.out.println("Cor: ");
          this.cor = entrada.next();
          System.out.println("Placa: ");
          this.placa = entrada.next();
          System.out.println("Renavam: ");
          this.renavam = entrada.nextInt();
          System.out.println("Número de Pneus: ");
          this.numeroPneus = entrada.nextInt();
          System.out.println("Número de Passageiros: ");
          this.numeroPassageiros = entrada.nextInt();
          System.out.println("Veiculo cadastrado com sucesso !");
         
    }

    public void veiculoCadastrado() {
        System.out.println("=== Veiculos cadastrados ===");
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano do modelo: " + getAnoModelo());
        System.out.println("Ano de Fabricação: " + getAnoFabricacao());
        System.out.println("Cor: " + getCor());
        System.out.println("Placa: " + getPlaca());
        System.out.println("Renavam: " + getrenavam());
        System.out.println("Número de Pneus: " + getNumeroPneus());
        System.out.println("Números de passageiros: " + getNumeroPassageiros());
        System.out.println("===============\n");
    }

    public void mediaConsumo() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira a distancia percorrida inicial(km)");
        double distancialInicial = entrada.nextDouble();
        System.out.println("Insira a distancia percorrida final(km)");
        double distanciaFinal = entrada.nextDouble();
        System.out.println("Insira a quantidade de combustivel inserida");
        double combustivelInserido = entrada.nextDouble();
        double distanciaPercorrida = distanciaFinal - distancialInicial;
        double kmPorLitro = distanciaPercorrida / combustivelInserido;
        System.out.println("O veículo percorre " + distanciaPercorrida + " a cada " + kmPorLitro + "L de combustível.");
    }
}