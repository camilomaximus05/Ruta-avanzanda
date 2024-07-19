package Taller06_POO_02.src;
import java.util.ArrayList;
import  java.util.Scanner;
public class GestionEmpleados {

    static ArrayList<Empleado> listaDeEmpleados= new ArrayList<>();

    static void aniadirEmpleado(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cuantos empleados desea agreagar?");
        int num = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < num; i++) {

            System.out.println("Ingrese el nombre del empleado #" + (i+1) + ": ");
            String nombre = scanner.nextLine();

            System.out.println("Ingrese el tipo del empleado, " + nombre + "\n1.)Temporal\n2.)Permanente");
            int tipo = scanner.nextInt();
            scanner.nextLine();

            while (tipo != 1 && tipo != 2){
                System.out.println("Elija una opción valida");
                System.out.println("Ingrese el tipo del empleado, " + nombre + "\n1.)Temporal\n2.)Permanente");
                tipo = scanner.nextInt();
                scanner.nextLine();
            }

            int edad;
            long id;
            double salario;


            switch (tipo) {
                case 1:
                    System.out.println("Ingrese la edad del empleado, " + nombre + ": ");
                    edad = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Ingrese el id del empleado, " + nombre + ": ");
                    id = scanner.nextLong();
                    scanner.nextLine();

                    System.out.println("Ingrese el salario del empleado, " + nombre + ": ");
                    salario = scanner.nextDouble();
                    scanner.nextLine();

                    EmpleadoTemporal temporal = new EmpleadoTemporal(nombre, edad, id, salario);

                    listaDeEmpleados.add(temporal);

                    System.out.println("Empleado agregado:");

                    System.out.println(temporal);

                    break;

                case 2:
                    System.out.println("Ingrese la edad del empleado, " + nombre + ": ");
                    edad = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Ingrese el id del empleado, " + nombre + ": ");
                    id = scanner.nextLong();
                    scanner.nextLine();

                    System.out.println("Ingrese el salario del empleado, " + nombre + ": ");
                    salario = scanner.nextDouble();
                    scanner.nextLine();

                    EmpleadoPermanente permanente = new EmpleadoPermanente(nombre,edad, id, salario);
                    listaDeEmpleados.add(permanente);

                    System.out.println("Empleado agregado:");

                    System.out.println(permanente);

                    break;
            }
        }
        scanner.close();
    }

    static void eliminarEmpleado(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el id del empleado que desea eliminar: ");
        long id = scanner.nextLong();
        scanner.nextLine();

        for (Empleado empleado : listaDeEmpleados) {
            if (empleado.getIdEmpleado() == id) {
                System.out.println("Empleado eliminado");
                System.out.println(empleado);
                listaDeEmpleados.remove(empleado);
            }
        }
        scanner.close();
    }

    static void mostrarEmpleados(){
        for (Empleado empleado : listaDeEmpleados) {
            System.out.println(empleado);
        }
    }

}
