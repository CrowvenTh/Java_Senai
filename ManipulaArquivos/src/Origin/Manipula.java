package Origin;
public class Manipula {
    public static void main(String[] args) throws Exception {
        String caminho = "ManipulaArquivos\\src\\Origin\\teste.txt";

        ManipuladorArquivos.Escrita(caminho);
        ManipuladorArquivos.Leitura(caminho);
    }
}
