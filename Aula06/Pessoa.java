package Aula06;

import Aula03.pessoa;

public class Pessoa {
    private String nome;
    private int idade;
    private String telefone;

    public Pessoa() {
    }

    public Pessoa(String nome, int idade, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
        this.idade = idade;
    }

    // getters e setters
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    // fim
}
