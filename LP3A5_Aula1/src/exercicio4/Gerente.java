package exercicio4;

public class Gerente extends Funcionario {

    private String senha;

    public Gerente(String nome, Double salario, String departamento, String senha) {
        super(nome, salario, departamento);
        this.senha = senha;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println(
                "Nome: " + this.nome +
                ", \nSalaŕio: " + this.salario +
                ", \nDepartamento: " + this.departamento +
                ", \nSenha: " + this.senha
        );
    }

}
