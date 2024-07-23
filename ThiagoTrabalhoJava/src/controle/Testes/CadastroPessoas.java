package controle.Testes;

import java.util.ArrayList;
import javax.swing.*;

class Pessoa {
    String nome;
    int idade;
    double peso;

    Pessoa(String nome, int idade, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nIdade: " + idade + "\nPeso: " + peso;
    }
}

public class CadastroPessoas {
    private static ArrayList<Pessoa> pessoas = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            String[] options = { "Cadastrar Pessoa", "Mostrar Pessoas", "Relatório Geral", "Sair" };
            int choice = JOptionPane.showOptionDialog(null, "Escolha uma opção", "Menu",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

            switch (choice) {
                case 0:
                    cadastrarPessoa();
                    break;
                case 1:
                    mostrarPessoas();
                    break;
                case 2:
                    relatorioGeral();
                    break;
                case 3:
                    System.exit(0);
            }
        }
    }

    private static void cadastrarPessoa() {
        JTextField nomeField = new JTextField();
        JTextField idadeField = new JTextField();
        JTextField pesoField = new JTextField();
        Object[] message = {
                "Nome:", nomeField,
                "Idade:", idadeField,
                "Peso:", pesoField
        };

        int option = JOptionPane.showConfirmDialog(null, message, "Cadastrar Pessoa", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) {
            String nome = nomeField.getText();
            int idade = Integer.parseInt(idadeField.getText());
            double peso = Double.parseDouble(pesoField.getText());

            Pessoa pessoa = new Pessoa(nome, idade, peso);
            pessoas.add(pessoa);
        }
    }

    private static void mostrarPessoas() {
        StringBuilder sb = new StringBuilder();
        for (Pessoa pessoa : pessoas) {
            sb.append(pessoa).append("\n\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString(), "Pessoas Cadastradas", JOptionPane.INFORMATION_MESSAGE);
    }

    private static void relatorioGeral() {
        if (pessoas.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhuma pessoa cadastrada.", "Relatório Geral",
                    JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        double somaIdades = 0;
        double somaPesos = 0;
        for (Pessoa pessoa : pessoas) {
            somaIdades += pessoa.idade;
            somaPesos += pessoa.peso;
        }

        double mediaIdade = somaIdades / pessoas.size();
        double mediaPeso = somaPesos / pessoas.size();

        String relatorio = String.format("Média de Idade: %.2f\nMédia de Peso: %.2f", mediaIdade, mediaPeso);
        JOptionPane.showMessageDialog(null, relatorio, "Relatório Geral", JOptionPane.INFORMATION_MESSAGE);
    }
}
