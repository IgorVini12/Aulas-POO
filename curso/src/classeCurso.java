public class classeCurso {
 public static Object QuantidadeDeAlunos = null;

public static void main(String[] args) {
    String nome;
    int QuantidadeDeAlunos;
    String turma;
    float mensalidade;
}

  public  float mensalidade;
  public String nome;
  public String turma;    classeCurso(String turma) {
        nome = "Curso de java";
        QuantidadeDeAlunos = 50;
        turma = "Manhã";
        mensalidade = 50.00f;
     }
    classeCurso(String nome, int QuantidadeDeAlunos, String turma, float mensalidade) {
        this.nome = nome;
        this.QuantidadeDeAlunos = QuantidadeDeAlunos;
        this.turma = turma;
        this.mensalidade = mensalidade; 
    }
 }



