package Taller02;
import java.util.Scanner;

public class Punto14 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Eliga una de las siguientes opciones:\n1. Convertir de grados Fahrenheit a centígrados\n2. Convertir de grados celsius a grados Fahrenheit");

        int option = scanner.nextInt();
        scanner.nextLine();

        float tempC;
        float tempF;
        switch(option){
            case 1:
                System.out.println("Ingrese la temperatura en grados Fahrenheit");
                tempF = scanner.nextFloat();
                scanner.nextLine();
                scanner.close();

                tempC = (tempF-32)*5/9;
                System.out.println("La temperatura en grados centígrados es: " + tempC);

                break;
            case 2:
                System.out.println("Ingrese la temperatura en grados centígrados");
                tempC = scanner.nextFloat();
                scanner.nextLine();
                scanner.close();

                tempF = (tempC*9/5)+32;
                System.out.println("La temperatura en grados Fahrenheit es: " + tempF);

                break;
            default:
                System.out.println("Opcion no valida");
                scanner.close();
        }

    }
}