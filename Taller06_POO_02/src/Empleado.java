package Taller06_POO_02.src;

public class Empleado extends Persona{

    private long idEmpleado;
    private double salario;


    public Empleado(String nombre, int edad, long idEmpleado, double salario) {
        super(nombre, edad);
        this.idEmpleado = idEmpleado;
        this.salario = salario;
    }

    public long getIdEmpleado() {
        return idEmpleado;
    }


    public double getSalario() {
        return salario;
    }

    public void setIdEmpleado(long idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
