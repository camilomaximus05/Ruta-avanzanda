public class Rectangulo extends FiguraGeometrica {
    double base;
    double altura;


    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }


    @Override
    void area() {
        System.out.println("El area del rectangulo es: " + (base * altura));
    }
}
