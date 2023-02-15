package exercicio3;

public class Quadrado extends FormaGeometrica {

    private Double lado;

    public Quadrado(Double lado) {
        this.lado = lado;
    }

    @Override
    public void calcularArea() {
        this.area = Math.pow(this.lado, 2);

        System.out.println("A área do quadrado é: " + area);
    }
}
