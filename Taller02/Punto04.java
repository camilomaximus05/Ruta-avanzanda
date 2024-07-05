package Taller02;
import java.util.Scanner;

public class Punto04 {
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Ingrese su peso en Kilogramos (Kg)");
        double kg = scanner.nextDouble();

        scanner.nextLine();

        System.out.println("Ingrese su altura en Metros (m)");
        double height = scanner.nextDouble();

        scanner.close();

        System.out.println("Tu IMC es: " + kg/(height*height));
    }
}