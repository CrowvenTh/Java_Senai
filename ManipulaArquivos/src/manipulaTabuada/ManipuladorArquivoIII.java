package manipulaTabuada;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;

public class ManipuladorArquivoIII {
    public static void Leitura(String caminho) throws IOException {
        BufferedReader buff = new BufferedReader(new FileReader(caminho));
        String linha;

        String aux[] = new String[3];
        Vector<Integer> vetor = new Vector<>();

        try {
            while (true) {
                linha = buff.readLine();
                if (linha == null) {
                    break;
                } else {
                    aux = linha.split(" ");
                    for (String i : aux) {
                        vetor.add(Integer.valueOf(i));
                    }
                }
            }
        } catch (Exception e) {
            System.err.println(e);
        }

        buff.close();
    }

    public static void Escrita(String caminho) throws IOException {
        int aux;
        Vector<String> saida = new Vector<>();
        for (int i = 0, j = 100; i <= 100 && j < 100; i++, j--) {
            aux = i * j;
            saida.add(String.valueOf(i) + " X " + String.valueOf(j) + " = " + String.valueOf(aux));
        }
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(caminho, true));
            for (String i : saida) {
                writer.append(i + "\n");
                writer.close();
            }
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}
