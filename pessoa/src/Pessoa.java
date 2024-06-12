public class Pessoa {
        
    private String nome;
    private int idade;
    private char sexo;

    public Pessoa(String nomePessoa, int idadePessoa, char sexoPessoa){
        nome = nomePessoa;
        idade = idadePessoa;
        sexo = sexoPessoa;
    }
    public String getPessoa(){
        String info = "A Pessoa se chama "+ nome + ", tem "+ idade +" anos de idade e é do sexo "+ sexo;
        return info;
    }
}