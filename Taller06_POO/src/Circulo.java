public class Circulo extends FiguraGeometrica {
    
    double radio;
    double pi = 3.14;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    void area() {
        System.out.println("El area del circulo es: "+pi*(radio*radio));
    }
}
