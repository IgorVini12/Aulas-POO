<<<<<<< HEAD
package TesteGrafico;

import javax.swing.JOptionPane;
public class TesteGrafico {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog(null,"Digite seu nome: ");
        String idadeStr = JOptionPane.showInputDialog(null,"Digite sua idade: ");
        String rendaStr = JOptionPane.showInputDialog(null,"Digite sua renda: ");

        int idade = Integer.parseInt(idadeStr);
        double renda = Double.parseDouble(rendaStr);

        pessoa p1 = new pessoa(nome, idade, renda);

        JOptionPane.showMessageDialog(null, "Nome: " + p1.nome + "\nIdade: " + p1.idade + "\nRenda: " + p1.renda);
    }
}
=======
package TesteGrafico;

import javax.swing.JOptionPane;
public class TesteGrafico {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog(null,"Digite seu nome: ");
        String idadeStr = JOptionPane.showInputDialog(null,"Digite sua idade: ");
        String rendaStr = JOptionPane.showInputDialog(null,"Digite sua renda: ");

        int idade = Integer.parseInt(idadeStr);
        double renda = Double.parseDouble(rendaStr);

        pessoa p1 = new pessoa(nome, idade, renda);

        JOptionPane.showMessageDialog(null, "Nome: " + p1.nome + "\nIdade: " + p1.idade + "\nRenda: " + p1.renda);
    }
}
>>>>>>> f27593aa2ff83ac86022e348fdff6674e82e0159
