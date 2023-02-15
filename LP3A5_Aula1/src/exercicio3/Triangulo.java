package exercicio3;

public class Triangulo extends FormaGeometrica {

    private Double base;
    private Double altura;


    public Triangulo(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void calcularArea() {
        this.area = (this.base * this.altura) / 2;

        System.out.println("A área do triângulo é: " + area);
    }
}
