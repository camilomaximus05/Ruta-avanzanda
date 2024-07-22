package Taller06_POO_02.src;
import java.util.ArrayList;
import  java.util.Scanner;

public class GestionEmpleados {

    static ArrayList<EmpleadoTemporal> listaDeEmpleadosTemporales = new ArrayList<>();
    static ArrayList<EmpleadoPermanente> listaDeEmpleadosPermanentes = new ArrayList<>();



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

                    listaDeEmpleadosTemporales.add(temporal);

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
                    listaDeEmpleadosPermanentes.add(permanente);

                    System.out.println("Empleado agregado:");

                    System.out.println(permanente);

                    break;
            }
        }
        scanner.close();
    }

    static void eliminarEmpleado(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el tipo de empleado que desea eliminar:\n1.)Temporal\n2.)Permanente");
        int tipo = scanner.nextInt();
        scanner.nextLine();

        while (tipo != 1 && tipo != 2){
            System.out.println("Elija una opción valida");
            System.out.println("Ingrese el tipo de empleado que desea eliminar:\n1.)Temporal\n2.)Permanente");
            tipo = scanner.nextInt();
            scanner.nextLine();
        }

        System.out.println("Ingrese el id del empleado que desea eliminar: ");
        long id = scanner.nextLong();
        scanner.nextLine();

        if (tipo == 1) {
            if (listaDeEmpleadosTemporales.isEmpty()) {
                System.out.println("No hay empleados temporales");
                
            }else{
                for (EmpleadoTemporal empleado : listaDeEmpleadosTemporales) {
                
                    if (empleado.getIdEmpleado() == id) {
                        System.out.println("Empleado eliminado");
                        System.out.println(empleado);
                        listaDeEmpleadosTemporales.remove(empleado);
                    }
                }
            }
        } else if (tipo == 2) {
            if (listaDeEmpleadosPermanentes.isEmpty()) {
                System.out.println("No hay empleados permanentes");
            }else{
                for (EmpleadoPermanente empleado : listaDeEmpleadosPermanentes) {
                    if (empleado.getIdEmpleado() == id) {
                        System.out.println("Empleado eliminado");
                        System.out.println(empleado);
                        listaDeEmpleadosPermanentes.remove(empleado);
                    }
                }
            }
            
        }
        scanner.close();
    }

    static void mostrarEmpleados(){

        if (!listaDeEmpleadosTemporales.isEmpty()) {

            System.out.println("Empleados Temporales: ");

            for (EmpleadoTemporal empleado : listaDeEmpleadosTemporales) {

                System.out.println(empleado);

            }

        } else {

            System.out.println("No hay empleados temporales");
            
        }

        if (!listaDeEmpleadosPermanentes.isEmpty()) {

            System.out.println("Empleados Permanentes: ");

            for (EmpleadoPermanente empleado : listaDeEmpleadosPermanentes) {

                System.out.println(empleado);

            }

        } else {

            System.out.println("No hay empleados permanentes");
            
        }
    }

}
