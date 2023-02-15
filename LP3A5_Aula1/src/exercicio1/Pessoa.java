package exercicio1;

public class Pessoa {

    private String nome;

    private Integer idade;

    public Pessoa(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void apresentar(String nome, Integer idade) {
        System.out.println("Olá, eu sou " + nome + " e tenho " + idade + " anos.");
    }

}
