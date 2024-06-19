package automovel;

public class Carro implements Veiculo, Proprietario{

    public String placa(String nome){
        return nome;
    }
    public void ligar(){
        System.out.println("Ligando o carro");
    }
    public void desligar(){
        System.out.println("Desligando carro");
    }
    public void parar(){
        System.out.println("Parando carro");
    }
    public double velocidadeMax(){
        return 0;
    }
    public String getNome(String nome){
        return "Thiago";
    }
    public String getEndereco(){
        System.out.println("samambaia");
        
        return "Samambaia";
    }
}