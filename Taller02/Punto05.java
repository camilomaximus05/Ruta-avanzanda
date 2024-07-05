package Taller02;
import java.util.Scanner;

public class Punto05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el número que desea saber si es par, impar o cero");
        long num = scanner.nextLong();
        scanner.close();

        if (num == 0) {
            System.out.println("El número es cero");
        } else if (num % 2 == 1 ) {
            System.out.println("El número es impar");
        } else {
            System.out.println("El número es par");
        }
    }
}