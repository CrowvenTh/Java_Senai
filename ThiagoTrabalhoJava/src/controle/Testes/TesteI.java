package controle.Testes;

import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

public class TesteI {
    private static List<String> pessoas = new ArrayList<>();

    public static void main(String[] args) {
        boolean controlador = true;

        while (controlador) {
            String opcao = JOptionPane.showInputDialog(null, 
                "=== Escolha a opção ===\n" +
                "1 - Cadastrar Pessoa\n" +
                "2 - Mostrar Pessoas Cadastradas\n" +
                "3 - Relatório de Pessoas Cadastradas\n" +
                "0 - Encerrar Programa\n", 
                "TesteI", JOptionPane.QUESTION_MESSAGE);

            switch (opcao) {
                case "1":
                    cadastrarPessoa();
                    break;
                case "2":
                    mostrarPessoas();
                    break;
                case "3":
                    relatorioPessoas();
                    break;
                case "0":
                    controlador = false;
                    JOptionPane.showMessageDialog(null, "Programa Encerrado");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção Inválida");
            }
        }
    }

    private static void cadastrarPessoa() {
        String nome = JOptionPane.showInputDialog(null, "Digite o nome da pessoa:", "Cadastrar Pessoa", JOptionPane.QUESTION_MESSAGE);
        if (nome != null && !nome.trim().isEmpty()) {
            pessoas.add(nome);
            JOptionPane.showMessageDialog(null, "Pessoa cadastrada com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Nome inválido!");
        }
    }

    private static void mostrarPessoas() {
        if (pessoas.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhuma pessoa cadastrada.");
        } else {
            StringBuilder listaPessoas = new StringBuilder("Pessoas Cadastradas:\n");
            for (String pessoa : pessoas) {
                listaPessoas.append(pessoa).append("\n");
            }
            JOptionPane.showMessageDialog(null, listaPessoas.toString());
        }
    }

    private static void relatorioPessoas() {
        JOptionPane.showMessageDialog(null, "Total de pessoas cadastradas: " + pessoas.size());
    }
}
