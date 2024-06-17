package controle;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Peta extends Produto{
    private String sabor;

    public String getSabor() {
        return sabor;
    }
    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    @Override
    @SuppressWarnings("depreciation")
    public String validade(Date fabricacao){
            SimpleDateFormat fs = new SimpleDateFormat("dd/MM/yyyy");
            
            fabricacao.setDate(fabricacao.getDate() + 1);

            return fs.format(fabricacao);
    }
    
    public double Venda(int pacote){
        return pacote * 6.70;
    }
    public double Venda(double quilo, int id){
        return quilo * 15.45;
    }
    public static void main(String[] args) {
        Peta myPeta = new Peta();
        System.out.println("R$ "+myPeta.Venda(34));

    }
}
