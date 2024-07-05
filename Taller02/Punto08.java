package Taller02;
import java.util.Scanner;

public class Punto08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la primera nota");
        float nota1 = scanner.nextFloat();
        scanner.nextLine();

        System.out.println("Ingrese la segunda nota");
        float nota2 = scanner.nextFloat();
        scanner.nextLine();

        System.out.println("Ingrese la tercera nota");
        float nota3 = scanner.nextFloat();
        scanner.nextLine(); 
        scanner.close();

        float promedio = (nota1 + nota2 + nota3) / 3;

        System.out.println("El promedio es: " + promedio);
    }
}