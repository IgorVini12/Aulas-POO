package Aula03;

import javax.swing.JOptionPane;

public class pessoa {
    public String nome;
    private int idade;
    protected double renda;
    private String cpf; // é String porque o CPF tem 11 dígitos, e pode conter zeros à esquerda, então não pode ser um int

    public pessoa(String nome, int idade, double renda,String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.renda = renda;
        this.cpf = cpf;
    }

    public int getidade() { // método para acessar a idade, já que ela é private
        return idade;
    }

    public void setcpf(String cpf) { // método para definir o CPF, já que ele é private
        this.cpf = cpf;
    }
    public String getcpf() { // método para acessar o CPF, já que ele é private
        return cpf;
    }

    public void imprimirDados() {
        JOptionPane.showMessageDialog(null,
                "<html><span style = 'color: blue>'>Nome: </span>" + nome
                        + "\nidade: " + idade
                        + "\nrenda: " + renda
                        + "\nCPF: " + cpf);
    }

public class ValidadorCPF {

    public static boolean validarCPF(String cpf) {
        // Remove caracteres não numéricos
        cpf = cpf.replaceAll("\\D", "");

        // Verifica se tem 11 dígitos
        if (cpf.length() != 11) return false;

        // Verifica se todos os dígitos são iguais
        if (cpf.matches("(\\d)\\1{10}")) return false;

        try {
            // Calcula primeiro dígito verificador
            int soma = 0;
            for (int i = 0; i < 9; i++) {
                soma += (cpf.charAt(i) - '0') * (10 - i);
            }
            int primeiroDigito = 11 - (soma % 11);
            if (primeiroDigito >= 10) primeiroDigito = 0;

            // Calcula segundo dígito verificador
            soma = 0;
            for (int i = 0; i < 10; i++) {
                soma += (cpf.charAt(i) - '0') * (11 - i);
            }
            int segundoDigito = 11 - (soma % 11);
            if (segundoDigito >= 10) segundoDigito = 0;

            // Verifica se os dígitos calculados batem com os informados
            return (primeiroDigito == (cpf.charAt(9) - '0')) &&
                   (segundoDigito == (cpf.charAt(10) - '0'));

        } catch (Exception e) {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(validarCPF("12345678909")); // Exemplo inválido
        System.out.println(validarCPF("11144477735")); // Exemplo válido
    }
}
}
