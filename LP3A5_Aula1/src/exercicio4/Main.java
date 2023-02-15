package exercicio4;

public class Main {

    public static void main(String [] args) {
        Funcionario funcionario = new Funcionario("Matheus", 1800.00, "TI");
        funcionario.mostrarInformacoes();

        Gerente gerente = new Gerente("Augusto", 3600.00, "TI", "123456");
        gerente.mostrarInformacoes();
    }

}
