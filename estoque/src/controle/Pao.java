package controle;

import java.time.LocalDate;

public class Pao extends Produto{
    private String tipoPao;

    public String getTipopao(){
        return tipoPao;
    }
    public String setTipoPao(String tipoPao){
        return this.tipoPao = tipoPao;
    }
/* 
public LocalDate validade(LocalDate fabricacao){
    LocalDate dataAtual = LocalDate.now();
    return dataAtual;
}

public LocalDate validade(LocalDate fabricacao, LocalDate validade){
    
    LocalDate dataAtual = LocalDate.now();
    
    fabricacao.plusDays(1);
    
    return fabricacao;
}

*/    
public static LocalDate validade(LocalDate fabricacao, LocalDate validade){
    // Obtem a data atual
    LocalDate dataAtual = LocalDate.now();
    
    // Adiciona um dia à data de fabricação (atenção: LocalDate é imutável, então o resultado precisa ser atribuído)
    fabricacao = fabricacao.plusDays(30);
    
    // Retorna a data de fabricação atualizada
    return fabricacao;
}
    public static void main(String[] args) {
        // Exemplo de uso da função validade
        LocalDate dataFabricacao = LocalDate.now(); // Data de fabricação
        LocalDate dataValidade = LocalDate.of(2024, 7, 18); // Data de validade
        
        // Chamando o método validade e capturando o resultado
        LocalDate novaDataFabricacao = validade(dataFabricacao, dataValidade);
        
        // Imprimindo o resultado para verificar
        System.out.println("Data de fabricação atualizada: " + novaDataFabricacao);
        System.out.println(validade(novaDataFabricacao, dataValidade));
    }
       
}