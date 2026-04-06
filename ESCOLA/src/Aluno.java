public class Aluno extends Pessoa {

    protected int matricula;

    public Aluno(String nome, int idade, int matricula){
        super(nome, idade);
        this .matricula = matricula;
    }

    public void setIdade (int idade){
        if (idade >=12){
            super.setIdade(idade);
        }
    }

    public void matricula(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'matricula'");
    }


}
