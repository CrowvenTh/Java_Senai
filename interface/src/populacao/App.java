package populacao;

public class App {
    public static void main(String[] args) {
        Filho filho = new Filho();
System.out.println("---------------\n");
        filho.setNome("Colerigos");
        filho.setIdade(27);

        System.out.println("Nome: "+filho.getNome());
        System.out.println("Idade: "+filho.getIdade());

        System.out.println("altura: "+ filho.altura(1.89));
        System.out.println("Barba: "+ filho.barba(true));
        System.out.println("Calvice: "+ filho.calvice(false));
        System.out.println("cor dos Olhos: "+ filho.corOlhos("azul"));
        System.out.println("cor da pele: "+ filho.corPele("parda"));
        System.out.println("Tipo de Cabelo : "+ filho.tipoCabelo("Ruivo"));
        System.out.println("Mão operante : "+ filho.maoForte("esquerda"));

        Filho filho1 = new Filho();
        
        filho1.setNome("Marcela");
        filho1.setIdade(22);
        filho1.setSexo('F');

System.out.println("\n---------------");

        System.out.println(filho1.getNome());
        System.out.println(filho1.getIdade());
        System.out.println(filho1.getSexo());
        System.out.println(filho1.altura(1.59));
        System.out.println(filho1.barba(false));
        System.out.println(filho1.corOlhos("castanho"));
        System.out.println(filho1.corPele("negra"));
        System.out.println(filho1.tipoCabelo("Liso"));
        
        
        
    }
        
}
