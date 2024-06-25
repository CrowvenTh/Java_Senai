public class Manipula {
    public static void main(String[] args) throws Exception {
        String caminho = "src\\teste.txt";

        ManipuladorArquivos.Escrita(caminho);
        ManipuladorArquivos.Leitura(caminho);
    }
}
