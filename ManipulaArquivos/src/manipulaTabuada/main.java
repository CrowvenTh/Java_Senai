package manipulaTabuada;

import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException {
        String caminho = "src\\DesafioII\\resultado.txt";

        ManipuladorArquivoIII.Escrita(caminho);
        ManipuladorArquivoIII.Leitura(caminho);
    }
}
