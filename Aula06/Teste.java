package Aula06;

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

    }
}
