public class Fibonacci {
    //-----------------------------------------------------------------------------
    // Primeira forma - Recursiva
    //-----------------------------------------------------------------------------
    static long fib(int numero){
        int F = 0;
        int ant = 0;

        for(int i = 1; i <= numero; i++){
            if (i == 1) {
                F = 1;
                ant = 0;
            } else {
                F+= ant;
                ant = F - ant;
            }
        }
        return F;
    }

    //-----------------------------------------------------------------------------
    // Segunda forma - Iterativa
    //-----------------------------------------------------------------------------
    static long fibRec(int numero){
        if (numero < 2) {
            return numero;
        } else {
            return fibRec(numero - 1) + fibRec(numero - 2);
        }
    }
    
    //-----------------------------------------------------------------------------
    // Terceira forma - Recursiva II
    //-----------------------------------------------------------------------------
    static long fibTer(int numero){
        return (numero < 2) ?  numero: fibTer(numero - 1) + fibTer(numero - 2);
    }

    //-----------------------------------------------------------------------------
    // Quarta forma - Recursiva II
    //-----------------------------------------------------------------------------
    private static int[] vetor = new int[31];
    private static int contador;

    static long fibVetor(int numero){
        contador = 1;
        return vetRec(numero);
    }

    static long vetRec(int numero){
        if (numero < 0) {
            return vetor[0];
        } else {
            if (contador < 3) {
                vetor[numero] = contador - 1;
                contador++;
            } else {
                vetor[numero] = vetor[numero + 1] + vetor[numero + 2];
            }
            return vetRec(numero - 1);
        }
    }

    public static void main(String[] args) throws Exception {
        
        /*------------------------------------------------------------------
         * Fibonacci - Proporção áurea.                                    *
         *                                                                 *
         * Exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...           *
         * "A soma dos dois números anteriores resulta no número atual"    *
         *-----------------------------------------------------------------*/

         int i;

        // 1 - Recursiva
        System.out.println("----- Forma Recursiva -----");
         for(i=0; i < 31 ;i++){
            System.out.println("(" + i + "): " + Fibonacci.fib(i) + "\t");
         }

        // 2 - Iterativa
        System.out.println("----- Forma Iterativa -----");
         for(i=0; i < 31 ;i++){
            System.out.println("(" + i + "): " + Fibonacci.fibRec(i) + "\t");
         }

         // 3 - Recursiva II
         System.out.println("----- Forma Recursiva II -----");
         for(i=0; i < 31 ;i++){
            System.out.println("(" + i + "): " + Fibonacci.fibTer(i) + "\t");
         }
        // 4 - Recursiva III com vetor
        System.out.println("----- Forma Recursiva III com vetor -----");
        for(i=0; i < 31 ;i++){
            System.out.println("(" + i + "): " + Fibonacci.fibVetor(i) + "\t");
        }
        System.out.println("Esse é o elemento na posição 07 "+ vetor[7]);
    }
}