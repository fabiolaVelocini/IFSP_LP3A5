package exercicio3;

public class Circulo extends FormaGeometrica {

    private Double raio;
    private static final Double PI = 3.14;

    public Circulo(Double raio) {
        this.raio = raio;
    }

    @Override
    public void calcularArea() {
        this.area = this.PI * Math.pow(raio, 2);

        System.out.println("A área do círculo é: " + area);
    }

}
