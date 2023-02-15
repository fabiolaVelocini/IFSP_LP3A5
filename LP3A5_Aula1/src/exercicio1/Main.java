package exercicio1;

public class Main {

    public static void main(String [] args) {
        Pessoa pessoa = new Pessoa("Matheus", 22);

        pessoa.apresentar(pessoa.getNome(), pessoa.getIdade());
    }

}
