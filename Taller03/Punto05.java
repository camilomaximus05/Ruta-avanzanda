package Taller03;
import java.util.Scanner;

public class Punto05 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero cuyo factorial desea saber");
        int num = scanner.nextInt();
        scanner.close();

        int mult = num;

        for (int i = num-1; i > 0; i--) {
            mult = mult * i;
        }

        System.out.println("El factorial de " + num + " es: " + mult);
    }
}