import java.util.ArrayList;
import java.util.Collections;
import controle.Produto;

public class App extends Produto{
    public static void main(String[] args) throws Exception {

        ArrayList<String> tipoPao = new ArrayList<String>();
        tipoPao.add("paoFrances");
        tipoPao.add("paoDoce");
        tipoPao.add("paoDeQueijo");
        tipoPao.add("paoDeLo");
        tipoPao.add("paoDeSal");

        tipoPao.add(3, "paoHamburguer"); //para adcionar um item  em uma posição
        System.out.println(tipoPao  );

        System.out.println(tipoPao.get(4)); //seleciona um item da lista
        
        tipoPao.set(0, "PaoPizza"); //Substitui um item da lista de acordo com a posição
        System.out.println(tipoPao);
        
        tipoPao.remove(0); // remove um item pela posição
        System.out.println(tipoPao);

        tipoPao.size(); // mostra o tamanho da lista
        System.out.println(tipoPao.size());

        /*
        tipoPao.clear(); //limpa o conteúdo da lista
        System.out.println(tipoPao);
         */

         for (String i : tipoPao){ // lista todos o s itens individualmente
            System.out.println(i);
         }
         System.out.println("\n ---------- \n");
         // Ou de outra forma: 

         for (int i = 0; i < tipoPao.size(); i++){
            System.out.println(tipoPao.get(i));
         }

         System.out.println("\n ---------- \n");

         Collections.sort(tipoPao);
         for (String i : tipoPao){
            System.out.println(i);

        }
    }
}
