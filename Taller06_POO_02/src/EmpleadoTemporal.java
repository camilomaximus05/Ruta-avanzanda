package Taller06_POO_02.src;

public class EmpleadoTemporal extends  Empleado{

    public EmpleadoTemporal(String nombre, int edad, long idEmpleado, double salario) {
        super(nombre, edad, idEmpleado, salario);
    }

    @Override
    public String toString() {
        return " Tipo de empleado: Temporal\n"+" Nombre: "+nombre + "\n" +" Edad: "+ edad + "\n" + " id: "+getIdEmpleado() + "\n" +" Salario: "+ getSalario() + "\n";
    }

}
