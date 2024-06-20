package populacao;

public class Filho implements Pai, Mae{
    private String nome;
    private int idade;
    private char sexo;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public double altura(double altura) {
        return altura * Math.PI / 3;
    }

    @Override
    public boolean barba(boolean tem) {
        return true;
    }

    @Override
    public boolean calvice(boolean tera) {
        return false;
    }

    @Override
    public String corOlhos(String cor) {
        if (cor == "azul" || cor == "azul") {
            cor = "verde";
        } else if (cor == "azul" || cor == "Castanho") {
            cor = "castanho";
        } else if (cor == "castanho" || cor == "verde") {
            cor = "azul";
        }
        return cor;
    }

    @Override
    public String corPele(String cor) {
        if (cor == "branca" || cor == "branca") {
            cor = "branco";
        } else if (cor == "negra" || cor == "branca") {
            cor = "Pardo";
        } else if (cor == "parda" || cor == "negra") {
            cor = "Negro";
        }
        return cor;
    }

    @Override
    public String tipoCabelo(String tipo) {
        return tipo;
    }

    @Override
    public String maoForte(String mao) {
        if (mao == "esquerda") {
            mao = "Canhoto";
        } else if (mao == "direita") {
            mao = "Destro";
        }
        return mao;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    
}