public class ContaP {
String agencia, numero;
float saldo, taxa;

public ContaP(){ }

public ContaP(String agencia, String numero, float saldo, float taxa)
{
    this.numero = numero;
    this.taxa = taxa;
    this.saldo = saldo;
}
public void depositar(float valor){
    saldo = saldo + valor; //saldo = saldo + valor;
}
float calcularRendimento(){
    float calcularRendimento;
    calcularRendimento = saldo * taxa / 100;
    return calcularRendimento;

}
}