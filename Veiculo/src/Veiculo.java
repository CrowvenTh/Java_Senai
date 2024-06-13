public class Veiculo {
    
    private String nome;
    private String modelo;
    private int qtdPneus;
    private double potencia;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getQtdPneus() {
        return qtdPneus;
    }

    public void setQtdPneus(int qtdPneus) {
        this.qtdPneus = qtdPneus;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public static void main(String[] args) throws Exception {
        
        Veiculo carro1 = new Veiculo();

        carro1.setNome("Hilux");
        carro1.setModelo("Caminhonete");
        carro1.setQtdPneus(4);
        carro1.setPotencia(240);
   }
   public void Ligar(){
        System.out.println("O veiculo"+ carro1.getNome());

   }

}
