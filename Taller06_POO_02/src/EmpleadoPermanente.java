package Taller06_POO_02.src;

public class EmpleadoPermanente extends Empleado {

    public EmpleadoPermanente(String nombre, int edad, long idEmpleado, double salario) {
        super(nombre, edad, idEmpleado, salario);
    }

    @Override
    public String toString() {
        return " Tipo de empleado: Permanente:\n"+" Nombre: "+nombre + "\n" +" Edad: "+ edad + "\n" + " id: "+getIdEmpleado() + "\n" +" Salario: "+ getSalario() + "\n";
    }

}
