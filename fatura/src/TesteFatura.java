public class TesteFatura {
    public static void main(String[] args) {
        Fatura f1 = new Fatura();
        System.out.println("Valor da fatura 1: R$ " + f1.valor);
        f1.valor = 100;
        System.out.println("Valor da fatura 1: R$ " + f1.valor);

        Fatura f2 = new Fatura(2000, 60, null);
        System.out.println("Valor da fatura 2: R$ " + f2.valor);
        f2.adicionaCompra(349, 99f);
        System.out.println("Saldo atualizado da fatura 2: " + f2.valor);

        Fatura f3 = f2.somaCom(400f);
        System.out.println("Saldo da Fatura 3: " + f3.valor);
        System.out.println("Saldo da Fatura 2: " + f2.valor);

        Fatura f4 = f2.somaCom(50);
        Fatura f5 = f2.somaCom(50, 400f);

    }
}
