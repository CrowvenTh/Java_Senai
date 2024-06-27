package manipulaTabuada;
public class tabuada {
    public static void main(String[] args) {
        
        int multiplicador = 0;
        int indice;

        for(indice = 1; indice <=10; indice++){
            System.out.println("Tabuada do "+indice);
            for(multiplicador = 1; multiplicador <= 10;multiplicador++){
                System.out.println("|"+ indice +" X "+ multiplicador +" = "+ indice*multiplicador);
            }
            System.out.println("-------------\n");
        }
    }
}
