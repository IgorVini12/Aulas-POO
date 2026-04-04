public class Vendedor {
    private float vendas;
    private float salarioBase;
    public String nome;
    private int faltas;

    // arrumando os atributos
    public Vendedor(String nome, int faltas, float salarioBase, float vendas) {
        this.nome = nome;
        this.vendas = vendas;
        this.faltas = faltas;
        this.salarioBase = salarioBase;
    }

    // get e set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getVendas() {
        return vendas;
    }

    public void setVendas(float vendas) {
        this.vendas = vendas;
    }

    public float getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    public float getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    // Para fazer os calculos

    public float calcularComissao() {
        if (vendas >= 1000 && vendas < 2000) {
            return vendas * 0.10f;
        } else if (vendas >= 2000) {
            return vendas * 0.15f;
        } else {
            return 0.0f;
        }
    }

    public float descontoFalta() {
        return (salarioBase / 30) * faltas;
    }

    public float calcularSalario(){
        return salarioBase + calcularComissao() - descontoFalta();
    }
}