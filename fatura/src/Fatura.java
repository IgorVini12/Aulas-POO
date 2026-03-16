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
