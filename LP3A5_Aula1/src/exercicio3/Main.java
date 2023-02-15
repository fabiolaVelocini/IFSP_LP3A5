package exercicio3;

public class Main {

    public static void main(String [] args) {
        Circulo circulo = new Circulo(2.0);
        circulo.calcularArea();

        Quadrado quadrado = new Quadrado(2.0);
        quadrado.calcularArea();

        Triangulo triangulo =  new Triangulo(2.0, 3.0);
        triangulo.calcularArea();
    }

}
