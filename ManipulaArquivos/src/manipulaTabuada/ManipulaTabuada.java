package DesafioII;

public class ManipulaTabuada {
    public static void main(String[] args) {
        /*
         * 
         for (int contador = 1; contador <= 10; contador++){
             for(int multiplicador = 100; multiplicador > 1; multiplicador-- ){
                 System.out.println(contador +" X "+ multiplicador +" = "+ contador*multiplicador);
                }
            }            
            */
// utlizando apenas um FOR

        for (int c =1, m = 10; c <= 10 && m > 1; c++, m--){
            int aux = c*m;
            System.out.println(c +" X "+ m +" = "+ aux);
        }
    }
}
