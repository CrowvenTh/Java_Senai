package controle;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Pao extends Produto{
    private String tipoPao;

    public String getTipopao(){
        return tipoPao;
    }
    public String setTipoPao(String tipoPao){
        return this.tipoPao = tipoPao;
    }
    
    @Override
    @SuppressWarnings("depreciation")
    public String validade(Date fabricacao){
            SimpleDateFormat fs = new SimpleDateFormat("dd/MM/yyyy");
            
            fabricacao.setDate(fabricacao.getDate() + 5);

            return fs.format(fabricacao);
    }
}
