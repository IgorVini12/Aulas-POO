public class Professor {
    // Declare o campo idade como um inteiro privado
    private int idade;
    public String nome;

    public Professor(String string, int i) {
    }

    public void setidade(int idade){
        if ( idade >=18 ) // sobrescrita do metodo pai
        {
            this.idade = idade;
        } 
    }

    // Exemplo de uso: getter e setter para encapsulamento
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
