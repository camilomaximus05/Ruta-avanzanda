public class Cuadrado extends FiguraGeometrica {
    double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }


    @Override
    void area() {
        System.out.println("El area del cuadrado es: " + (lado * lado));
    }
}
