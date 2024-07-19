import java.util.Scanner;

public class Empleado {

    Scanner scanner = new Scanner(System.in);

    private String nombre;
    private String posicion;
    private double salario;
    private long id;

    public Empleado(String nombre, String posicion, double salario, long id) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.salario = salario;
        this.id = id;
    }


    public String getNombre() {
        return nombre;
    }
    
    public String getPosicion() {
        return posicion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public long getId() {
        return id;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setId(long id) {
        this.id = id;
    }

    void aumentarSalario(){
        System.out.println("Ingrese el porcentaje del aumento: ");
        double porcentaje = scanner.nextDouble();
        Scanner scanner = new Scanner(System.in);
        scanner.close();

        salario += (salario * (porcentaje / 100));

        System.out.println("El nuevo salario es: " + salario);
        
    }

}
