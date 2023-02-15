package exercicio4;

public class Funcionario {

    String nome;
    Double salario;
    String departamento;

    public Funcionario(String nome, Double salario, String departamento) {
        this.nome = nome;
        this.salario = salario;
        this.departamento = departamento;
    }

    public void mostrarInformacoes() {
        System.out.println(
                "Nome: " + this.nome +
                ", \nSalaŕio: " + this.salario +
                ", \nDepartamento: " + this.departamento
        );
    }

}
