<<<<<<< HEAD
public class Fatura {
    public static final Fatura NovaFatura = null;
    float valor;
    int pontuacao;
    String tipoConta;

    Fatura() {
        valor = 0;
        pontuacao = 0;
        tipoConta = "Normal";
    }

    Fatura(float valor, int pontuacao, String tipoConta) {
        this.valor = valor;
        this.pontuacao = pontuacao;
        this.tipoConta = tipoConta;
    }

    void adicionaCompra(float valor, float f) {
        this.valor += valor; // this.valor = this.valor + valor
    }

    Fatura somaCom(float valor) { // soma duas faturas
        Fatura NovaFatura = new Fatura(); // vou criar uma "NovaFatura" com base na new Fatura
        NovaFatura.valor = this.valor + valor;
        return NovaFatura;
    }

    Fatura somaCom(int pontuacao) {
        Fatura NovaFatura = new Fatura();
        NovaFatura.pontuacao = this.pontuacao + pontuacao;
        return NovaFatura;
    }
     Fatura somaCom(int pontuacao, float valor) {
        Fatura NovaFatura = new Fatura();
        NovaFatura.pontuacao = this.pontuacao + pontuacao;
        NovaFatura.valor = this.valor + valor;
        return NovaFatura;
    }

}
=======
public class Fatura {
    float valor;
    int pontuação;
    String tipoConta;

    Fatura(){
        valor = 0;
        pontuação = 0;
        tipoConta  = "Normal";
    }
    Fatura(float valor, int pontuação, String tipoConta){
        this.valor = valor;
        this.pontuação = pontuação;
        this.tipoConta  = tipoConta;
    } 
}
>>>>>>> f27593aa2ff83ac86022e348fdff6674e82e0159
