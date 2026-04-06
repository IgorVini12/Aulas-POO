package Aula06;

import javax.print.DocFlavor.STRING;
import javax.swing.JOptionPane;

public class VetorObjetos {
    public static void main(String[] args) {
        Pessoa[] listaPessoas =  new Pessoa[5];
        for(int x = 0; x < listaPessoas.length; x++){
            String nome =JOptionPane.showInputDialog("Digite o " + (x+1) + "nome");
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (x+1) + "idade"));
            String telefone = JOptionPane.showInputDialog("Digite o telefone: ");
        }
    }
}
