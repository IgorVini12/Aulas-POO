import javax.swing.JOptionPane;
public class Entrada {
    public static void main(String[] args) {
        String agencia = JOptionPane.showInputDialog(null, "digite o nome da agencia");
        String numero = JOptionPane.showInputDialog(null,"digite o numero da conta");
        float renda = (float) Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a renda"));
        
        ContaP C2 = new ContaP(agencia, numero, renda, renda);
        System.out.println("Agencia: " + C2.agencia 
            + "\n numero: " + C2.numero
            + "\n saldo: " + C2.saldo);
    }
}
   
