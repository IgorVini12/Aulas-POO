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
