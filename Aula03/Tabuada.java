package Aula03;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        new Tabuada();
    }

    public Tabuada() {
        int numero = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número para ver a tabuada: ");
        numero = teclado.nextInt();
        imprimaTabuada(numero);
    }

    public void imprimaTabuada(int numero) {
        for (int x = 1; x <= 10; x++) {
            System.out.println(numero + " x " + x + " = " + (numero * x));
        }
    }
}
