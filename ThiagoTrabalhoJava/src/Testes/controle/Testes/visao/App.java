package controle.Testes.visao;

import controle.Menu;
import controle.VersaoFinal.classes.Veiculo;

public class App{
    public static void main(String[] args) throws Exception {
        Veiculo veiculo = new Veiculo();
        Menu menu = new Menu();

        menu.executarMenu();
        
    }
}