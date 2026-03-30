package Aula03;

public class TestePessoa {
    public static void main(String[] args) {
        pessoa p1 = new pessoa("igor", 20, 1500.00, "12345678901");
        // p1.imprimirDados();
        System.out.println(p1.nome); // nome é publico
        System.out.println(p1.getidade()); // idade é private, não pode ser acessada fora da classe pessoa, mas pode ser acessada por meio do método getidade()
        System.out.println(p1.renda); // renda é protected, pode ser acessada por classes do mesmo pacote ou

        p1.setcpf("12345678901"); // cpf é private, não pode ser acessada fora da classe pessoa, mas pode ser acessada por meio do método setcpf()
        System.out.println(p1.getcpf()); // cpf é private, não pode ser acessada fora da classe pessoa, mas pode ser acessada por meio do método getcpf()

    }

}
