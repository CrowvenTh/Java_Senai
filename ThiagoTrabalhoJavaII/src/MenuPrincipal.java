
import javax.swing.JOptionPane;

public class MenuPrincipal {
    public void exibirMenu(){
        while(true){
            String escolha = (String) JOptionPane.showInputDialog(
                null,
                "Escolha uma opção",
                "Bem vindo á Turistando",
                JOptionPane.PLAIN_MESSAGE,
                null,
                new String[]{"Cadastrar Veículos","Veículos Cadastrados","Gestão de Gastos","Sair"},
                "Cadastrar Veiculo");
            
                if(escolha == null){
                    continue;
                }
                switch (escolha) {
                    case "Cadastrar Veículo":
                        
                        break;
                    case "Mostrar Veículo":
                        
                        break;
                    case "Gestão de Gastos":
                        
                        break;
                    case "Sair":
                        System.exit(0);
                        break;
                    default:
                        throw new AssertionError();
                }
        }
    }
}
