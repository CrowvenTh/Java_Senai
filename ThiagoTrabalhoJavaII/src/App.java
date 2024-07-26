public class App {
    public static void main(String[] args) throws Exception {
        MenuPrincipal menu = new MenuPrincipal();
        menu.exibirMenu();

        Gastos gasto = new Gastos();
        gasto.comboBox();
    }
}
