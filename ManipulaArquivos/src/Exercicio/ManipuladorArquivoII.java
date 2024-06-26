package Exercicio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ManipuladorArquivoII {
    public static void Reader(String way) throws IOException{
        BufferedReader buff = new BufferedReader(new FileReader(way));
        String line = "";
        
        while (true) {
            if (line != null) {
                if (!line.equals("")) {
                    String Pares[] = line.split(" ");
                    int num1 = Integer.parseInt(Pares[0]);
                    int num2 = Integer.parseInt(Pares[1]);
                    System.out.println(num1+" X "+ num2 +" = "+ num1*num2);
                }
            } else {
                break;
            }
            line = buff.readLine();
        }
        buff.close();
    }
    public static void TextWriter(String way)throws IOException{
        BufferedWriter writer = new BufferedWriter(new FileWriter(way, true));
        String line = "";
        writer.append("1 72" +"\n");
        writer.append("2 53" +"\n");
        writer.append("3 49" +"\n");
        writer.append("5 55" +"\n");
        writer.append("6 61" +"\n");
        writer.append("7 79" +"\n");
        writer.append("8 80" +"\n");
        writer.append("9 96" +"\n");
        writer.append("0 87" +"\n");
        writer.append("2 15" +"\n");
        writer.append("8 24" +"\n");
        writer.close();
    }
}
