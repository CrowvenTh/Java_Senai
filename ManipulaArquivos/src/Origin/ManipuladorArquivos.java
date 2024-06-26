package Origin;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ManipuladorArquivos {

    public static void Leitura(String caminho) throws IOException {
        BufferedReader buff = new BufferedReader(new FileReader(caminho));
        String linha = "";

        while (true) {
            if (linha != null) {
                System.out.println(linha);
            } else {
                break;
            }
            linha = buff.readLine();
        }
        buff.close();
    }

    public static void Escrita(String caminho) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(caminho, true));
        String linha = "";
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite algum texto");
        linha = entrada.nextLine();
        writer.append(linha + "\n");
        writer.close();
        entrada.close();
    }
}
