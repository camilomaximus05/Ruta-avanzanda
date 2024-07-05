package Taller02;
import java.util.Scanner;
public class Punto07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese una opción \n1. Sumar \n2. Restar \n3. Multiplicar \n4. Dividir");
        int option = scanner.nextInt();
        

        System.out.println("Ingrese el primer número");
        double num1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Ingrese el segundo número");
        double num2 = scanner.nextDouble();
        scanner.nextLine();
        scanner.close();


        switch (option) {
            case 1:
                System.out.println("La suma es:  " + (num1 + num2));
                break;
            case 2:
                System.out.println("La resta es: " + (num1 - num2));
                break;
            case 3:
                System.out.println("La multiplicación es: " + (num1 * num2));
                break;
            case 4:
                System.out.println("La division es: " + (num1 / num2));
                break;
            default:
                System.out.println("No existe esa operación");
                break;
        }

    }
}