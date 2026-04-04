import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class App {
    private Vendedor[] listaVendedors = new Vendedor[10];
    private int totalCadastrado = 0;

    // Construtor: contém a lógica principal do menu
    public App() {
        totalCadastrado = cargaInicial(listaVendedors);
        bubbleSort(listaVendedors, totalCadastrado);

        int opcao = 0;
        do {
            String menu = "--- AGENDA ---\n"
                    + "Cadastrados: " + totalCadastrado + "/10\n\n"
                    + "1. Acrescentar nova pessoa\n"
                    + "2. Exibir agenda (Lista)\n"
                    + "3. Exibir agenda (Grid)\n"
                    + "4. Sair";

            // O Java cria o OK e Cancelar sozinho aqui
            String leitura = JOptionPane.showInputDialog(null, menu, "Menu", JOptionPane.QUESTION_MESSAGE);

            // Se o usuário clicar em "Cancelar" ou no "X", a variável 'leitura' recebe null
            if (leitura == null)
                break;

            // Se ele clicar em OK, o valor digitado vai para 'opcao'
            opcao = Integer.parseInt(leitura);

            switch (opcao) {
                case 1:
                    adicionarPessoa();
                    break;
                case 2:
                    exibirAgenda();
                    break;
                case 3:
                    exibirAgendaGrid();
                    break;
            }
        } while (opcao != 4);
    }

    // Método separado para entrada de dados (Case 1)
    public void adicionarPessoa() {
        if (totalCadastrado < 460) {
            JTextField campoNome = new JTextField();
            JTextField campoSalarioBase = new JTextField();
            JTextField campoVendas = new JTextField();
            JTextField campoFaltas = new JTextField();
            Object[] formulario = { "Nome:", campoNome, "Vendas:", campoVendas, "Salario Base:", campoSalarioBase,
                    "Faltas:", campoFaltas };

            int result = JOptionPane.showConfirmDialog(
                    null, // Componente pai (null para centralizar na tela)
                    formulario, // O array com os campos de texto e rótulos
                    "Novo Cadastro", // Título da janela
                    JOptionPane.OK_CANCEL_OPTION // Definidos botões OK e Cancelar
            );

            if (result == JOptionPane.OK_OPTION) {
                Vendedor p = new Vendedor(campoNome.getText(), Integer.parseInt(campoFaltas.getText()),
                        (float) Double.parseDouble(campoSalarioBase.getText()),
                        (float) Integer.parseInt(campoVendas.getText()));
                listaVendedors[totalCadastrado] = p;
                totalCadastrado++;
                bubbleSort(listaVendedors, totalCadastrado);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Agenda lotada!");
        }
    }

    // Método separado para exibição (Case 2)
    public void exibirAgenda() {
        String relatorio = "--- VENDEDORS ---\n";
        for (int i = 0; i < totalCadastrado; i++) {
            relatorio += (i + 1) + ". " + listaVendedors[i].getNome() + "\n";
        }
        JOptionPane.showMessageDialog(null, relatorio);
    }

    public void exibirAgendaGrid() {
        // 1. Definir os cabeçalhos das colunas
        String[] colunas = { "Nome", "Salário Final", "Vendas", "Faltas", "Comissão" };

        // 2. Criar a matriz de dados (linhas x colunas)
        Object[][] dados = new Object[totalCadastrado][5];

        for (int i = 0; i < totalCadastrado; i++) {
            Vendedor v = listaVendedors[i];
            dados[i][0] = v.getNome();
            dados[i][1] = v.calcularSalario();
            dados[i][2] = v.getVendas();
            dados[i][3] = v.getFaltas();
            dados[i][4] = v.calcularComissao();
        }

        // 3. Criar a tabela com os dados
        JTable tabela = new JTable(dados, colunas);

        // 4. Colocar a tabela dentro de um JScrollPane para aparecer o cabeçalho
        JScrollPane scroll = new JScrollPane(tabela);

        // 5. Exibir tudo no JOptionPane
        JOptionPane.showMessageDialog(null, scroll, "Agenda de Verdedores", JOptionPane.PLAIN_MESSAGE);
    }

    public void bubbleSort(Vendedor[] vetor, int tamanho) {
        for (int i = 0; i < tamanho - 1; i++) {
            for (int j = 0; j < tamanho - 1 - i; j++) {
                if (vetor[j].getNome().compareToIgnoreCase(vetor[j + 1].getNome()) > 0) {
                    Vendedor temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
    }

    public int cargaInicial(Vendedor[] lista) {
        String[] nomes = { "Julia", "Bruno", "Ana", "Zeca", "Eduardo", "Fernanda", "Gabriel", "Helena", "Igor",
                "Carlos" };
        int[] faltas = { 0, 1, 2, 0, 3, 1, 0, 2, 1, 0 };
        double[] salarioBase = { 1000.0, 1200.0, 1100.0, 1050.0, 1300.0, 1150.0, 1250.0, 1180.0, 1220.0, 1080.0 };
        int[] vendas = { 500, 1500, 800, 2000, 1200, 900, 1800, 700, 1600, 1000 };
        for (int i = 0; i < 10; i++) {
            lista[i] = new Vendedor(nomes[i], faltas[i], (float) salarioBase[i], (float) vendas[i]);
        }
        return 10;
    }

    // Main apenas instancia o objeto
    public static void main(String[] args) {
        new App();
    }
}
