package ArquivoJson;

import org.json.*;
import org.json.simple.parser.*;
import java.io.FileNotFoundException;
import org.json.simple.JSONObject;
import org.json.simple.JsonObject;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

@SuppressWarnings("deprecation")

public class ResolucaoSimples {
    public static void main(String[] args) throws IOException, ParseException {
        JSONObject jsonObject;

        JSONParser parse = new JSONParser();

        String nome;
        String ultimoNome;
        String cidade;
        String estado;

        FileWriter escreve = null;

        try {
            jsonObject = (JSONObject) parse.parse(new FileReader("ManipulaArquivos\\src\\ArquivoJson\\saida.json"));
            nome = (String) jsonObject.get("Nome");
            ultimoNome = (String) jsonObject.get("Ultimo Nome");
            cidade = (String) jsonObject.get("Cidade");
            estado = (String) jsonObject.get("Estado");
            System.out.println("O nome comleto dele é " + nome + " " + ultimoNome + " ,nascido em " + cidade + ", "+ estado + ".");

            for (int i = 0; i < 10; i++) {
                System.out.println("O nome comleto dele é " + nome + i + " " + ultimoNome + i + ", nascido em " + cidade
                        + i + ", " + estado + i + ".");
                escreve = new FileWriter("ManipulaArquivos\\src\\ArquivoJson\\saida.json");
                escreve.write(jsonObject.toString());
            }
            escreve.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        /*
         * JSONObject jsonObject = new JSONObject();
         * 
         * FileWriter escreve = null;
         * 
         * jsonObject.put("Nome", "Thiago");
         * jsonObject.put("Ultimo Nome", "Silva");
         * jsonObject.put("Cidade", "Belém");
         * jsonObject.put("Estado", "Pará");
         * 
         * 
         * try {
         * escreve = new FileWriter("ManipulaArquivos\\src\\ArquivoJson\\saida.json");
         * escreve.write(jsonObject.toString());
         * escreve.close();
         * } catch (IOException e) {
         * e.printStackTrace();
         * }
         * System.out.println(jsonObject);
         */
    }
}
