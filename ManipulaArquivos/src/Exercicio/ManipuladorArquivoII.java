package Exercicio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

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
        BufferedWriter writer = new BufferedWriter(new FileWriter(way));
        String line = "";
        writer.append("1 2" +"\n");
        writer.append("1 3" +"\n");
        writer.append("1 4" +"\n");
        writer.append("1 5" +"\n");
        writer.append("1 6" +"\n");
        writer.append("1 7" +"\n");
        writer.append("1 8" +"\n");
        writer.append("1 9" +"\n");
        writer.append("1 0" +"\n");
        writer.append("2 1" +"\n");
        writer.append("2 2" +"\n");


        writer.close();
    }
}
