public class TesteFatura {
 public static void main(String[] args) {
    Fatura f1 = new Fatura();
    System.out.println("Valor da fatura 1: R$ " + f1.valor);
    f1.valor = 100;
     System.out.println("Valor da fatura 1: R$ " + f1.valor); 
 }   
}
