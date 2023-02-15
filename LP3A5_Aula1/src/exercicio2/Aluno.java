package exercicio2;

import exercicio1.Pessoa;

public class Aluno extends Pessoa {

    private String matricula;

    public Aluno(String nome, Integer idade, String matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }

    @Override
    public void apresentar(String nome, Integer idade) {
        System.out.println("Olá, eu sou " + nome + " com matrícula " + this.matricula + " e tenho " + idade + " anos.");
    }

}
