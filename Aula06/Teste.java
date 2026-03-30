package Aula06;

import java.util.Scanner;
import TesteGrafico.pessoa;

public class Teste {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.setNome("João");
        p.setIdade(20);
        p.setTelefone("222");
        /*
         * p.nome = "joão";
         * p.idade = 20;
         * p.telefone ='2222';
         * System.out.println(p.nome +" " + p.idade + " " + p.telefone);
         */

        Pessoa p2 = new Pessoa("Maria", 30, "3333");
        System.out.println(p2.getNome() + " " + p2.getIdade() + " " + p2.getTelefone());

        Pessoa p3 = new Pessoa();

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o seu Nome: ");
        String nome = teclado.nextLine();

        System.out.println("Digte a sua idade: ");
        int idade = Integer.parseInt(teclado.nextLine());

        System.out.println("digite o seu telefone: ");
        String telefone = teclado.nextLine();

        p3.setNome(nome);
        p3.setIdade(idade);
        p3.setTelefone(telefone);
        System.out.println("seu nome é " + p3.getNome() + " " + "sua idade é " + p3.getIdade() + " " + "e seu telefone é " + p3.getTelefone());
    }
}
