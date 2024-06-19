import automovel.Carro;
import automovel.Proprietario;
import automovel.Veiculo;

public class App {

    public static void LigarMotor (Veiculo veiculo) {
     Veiculo Civic = new Carro();
     
     Civic.ligar();   
     Civic.buzinar();
     Civic.desligar();
    }
    public static void Prop (Proprietario proprietario){
        Proprietario Thiago = new Carro();
        
        Thiago.getEndereco();
        Thiago.getNome("thiago");
    }
    public static void main(String[] args) {
        Veiculo civic = new Carro();
        Proprietario Thiago = new Carro();

        App.LigarMotor(civic);
        App.Prop(Thiago);
    }
}
