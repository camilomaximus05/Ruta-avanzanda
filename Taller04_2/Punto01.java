package Taller04_2;

import java.util.Scanner;

public class Punto01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa la opcion de la operacion que deseas realizar. \n 1. Suma \n 2. Resta \n 3. Multiplicación \n 4. Division: ");
        int option = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingresa el primer numero: ");
        double num1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Ingresa el segundo numero: ");
        double num2 = scanner.nextDouble();
        scanner.nextLine();
        scanner.close();

        double [] result = new double[4];
        result[0] = num1+num2;
        result[1] = num1-num2;
        result[2] = num1*num2;
        result[3] = num1/num2;
        
        System.out.println("El resultado de la operacion es: " + result[option-1]);

        
    }
}