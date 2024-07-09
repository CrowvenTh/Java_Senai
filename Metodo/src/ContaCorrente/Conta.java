package ContaCorrente;

import javax.swing.JOptionPane;

public class Conta {
    private double saldo;

    public Conta() {
        this.saldo = 0.0;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void realizaDeposito() {
        String input = JOptionPane.showInputDialog("Insira o valor a ser depositado:");
        try {
            double deposito = Double.parseDouble(input);
            saldo += deposito;
            JOptionPane.showMessageDialog(null, "Depósito de R$" + deposito + " realizado com sucesso!");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Valor inválido. Por favor, insira um número válido.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void realizaSaque() {
        String input = JOptionPane.showInputDialog("Insira o valor a ser sacado:");
        try {
            double saque = Double.parseDouble(input);
            if (saque <= saldo) {
                saldo -= saque;
                JOptionPane.showMessageDialog(null, "Saque de R$" + saque + " realizado com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Saldo insuficiente para realizar o saque.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Valor inválido. Por favor, insira um número válido.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void verificaSaldo() {
        JOptionPane.showMessageDialog(null, "Seu saldo atual é de R$" + saldo);
    }

    public static void main(String[] args) {
        Conta conta = new Conta();

        while (true) {
            String[] options = {"Verificar Saldo", "Realizar Depósito", "Realizar Saque", "Sair"};
            int choice = JOptionPane.showOptionDialog(null, "Escolha uma operação:", "Operações Bancárias", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

            switch (choice) {
                case 0:
                    conta.verificaSaldo();
                    break;
                case 1:
                    conta.realizaDeposito();
                    break;
                case 2:
                    conta.realizaSaque();
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Saindo...");
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida.", "Erro", JOptionPane.ERROR_MESSAGE);
                    break;
            }
        }
    }
}
