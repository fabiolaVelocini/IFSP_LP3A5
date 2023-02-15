package exercicio2;

import exercicio1.Pessoa;

public class Main {

    public static void main(String [] args) {
        Aluno aluno = new Aluno("Matheus", 22, "123456");

        aluno.apresentar(aluno.getNome(), aluno.getIdade());
    }

}
