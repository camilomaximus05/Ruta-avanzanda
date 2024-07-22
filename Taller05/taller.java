package Taller05; 
import java.util.Scanner;

public class taller{
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numero de empleados: ");
        int maxEmployees = scanner.nextInt();
        scanner.nextLine();

        String array_3D [][][] = new String [maxEmployees][2][4];
        
        for(int i = 0; i < maxEmployees; i++){

            System.out.println("Ingrese el nombre del empleado: ");
            String name = scanner.nextLine();

            for (int j = 0; j < 2; j++){

                
                boolean valid = false;
                String vehicleType = " ";

                if (j == 1){

                    boolean valide = false;

                    System.out.println("El empleado tiene un segundo vehiculo? (S/N)");
                    String secondVehicle = scanner.nextLine();

                    while (valide == false) {
                        if (secondVehicle.equals("S") || secondVehicle.equals("N") || secondVehicle.equals("s") || secondVehicle.equals("n")){
                            valide = true;
                        } else {
                            System.out.println("Respuesta invalida, intente de nuevo");
                            secondVehicle = scanner.nextLine();
                        }
                        
                    }

                    if (secondVehicle.equals("N")|| secondVehicle.equals("n")){
                        break;
                    }
                } 

                while (!valid) {

                    System.out.println("Seleccione el tipo de vehiculo:\n0. Moto\n1. Carro");
                    vehicleType = scanner.nextLine();

                    if (vehicleType.equals("0") || vehicleType.equals("1")) {
                        valid = true;

                    } else {
                        System.out.println("Tipo de vehiculo invalido \n\n");
                    }
                }

                if (vehicleType.equals("0")) {
                    vehicleType = "Moto";
                } else {
                    vehicleType = "Carro";
                }

                for (int k = 0; k < 4; k++){

                    String info = " ";

                    switch (k) {
                        case 0:
                            System.out.println("Ingrese la marca del vehiculo: ");
                            info = scanner.nextLine();
                            break;

                        case 1:
                            System.out.println("Ingrese el modelo del vehiculo: ");
                            info = scanner.nextLine();
                            break;

                        case 2:
                            System.out.println("Ingrese el año del vehiculo: ");
                            info = scanner.nextLine();
                            break;
                        
                        case 3:
                            System.out.println("Ingrese el estado del vehiculo: ");
                            info = scanner.nextLine();
                            break;
                        
                    }
                    
                    array_3D[i][j][k] = name + vehicleType + info;
                }
            
            }
        }

        for (int y = 0; y < maxEmployees; y++) {
            System.out.println("Empleado: " + array_3D[y]);
            for (int j = 0; j < 2; j++) {
                System.out.println("Vehiculo: " + array_3D[][][1]);
                for (int k = 0; k < 4; k++) {
                    switch(k) {
                        case 0:
                            System.out.println("Marca: " + array_3D[y][j][k]);
                            break;
                        case 1:
                            System.out.println("Modelo: " + array_3D[y][j][k]);
                            break;
                        case 2:
                            System.out.println("Año: " + array_3D[y][j][k]);
                            break;
                        case 3:
                            System.out.println("Estado: " + array_3D[y][j][k]);
                            break;
                    }
                }
            }
        }


    }
}
