public class Filho extends Pai {
    /* 
    public Filho() {
        super();
        a = 30;
        b = 40;
        c = 50;
    }
*/
  public Filho() {
        super(); // isso cahma o metodo classe pai 
        a = 30;
        b = 40;
        c = 50;
    }
    public void imprimeFilho() {
        System.out.println(" o valor de A é: " + a);
        System.out.println(" o valor de B é; " + b);
        System.out.println(" o valor de c é: " + c);
    }
}
