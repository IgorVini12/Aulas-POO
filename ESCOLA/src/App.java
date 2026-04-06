public class App {
    public static void main(String[] args) throws Exception {
        
      Professor prof = new Professor( "Raimundo", 65);
      Pessoa bedel = new Pessoa("paulo", 40);

      System.out.println("Escolinha do prof. Raimundo ");
      System.out.println("Professor: " + prof.nome );
      System.out.println("Insperto(badel): " + bedel.nome);

      Aluno a1 = new Aluno("Rodrigo", 30, 2);
      Aluno a2 = new Aluno("Maria ", 19, 3);
      Aluno a3 =  new Aluno("José", 16, 4);
      Aluno aluno[] = new Aluno[20];
      aluno[0].setNome("Rodrigo");
      aluno[0].setIdade(30);
      aluno[0].matricula(1);
      aluno[1].setNome("Maria");
      aluno[1].setIdade(19);
      aluno[2].setNome("José");
      aluno[2].setIdade(16);

      int x = 0;
      while (aluno[x].nome.equals(null)) {
        System.out.println("Aluno: " + aluno[x].getNome());
        x++;
      }
    }
}
