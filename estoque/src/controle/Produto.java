package controle;

import java.util.Date;
import java.text.SimpleDateFormat;


public class Produto {
    private String nome;
    private int qtd;
    private double valor;

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
         this.nome = nome;
    }
    public int getQtd(){
        return qtd;
    }
    public void setQtd(int qtd){
         this.qtd = qtd;
    }
    public double getValor(){
        return valor;
    }
    public void setValor(double valor){
        this.valor = valor;
    }

    // @Override
    @SuppressWarnings("depreciation")
    public String validade(Date fabricacao){
            SimpleDateFormat fs = new SimpleDateFormat("dd/MM/yyyy");
            
            fabricacao.setDate(fabricacao.getDate() + 5);

            return fs.format(fabricacao);
    }
        Produto pao = new Produto();
}
