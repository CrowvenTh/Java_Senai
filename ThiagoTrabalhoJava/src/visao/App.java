package visao;

import controle.Menu;
import controle.Veiculo;

public class App{
    public static void main(String[] args) throws Exception {
        Veiculo veiculo = new Veiculo();
        Menu menu = new Menu();

        // menu.executarMenu();
        veiculo.cadastroDespesa();
    }
}
