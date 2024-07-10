package Taller03;
import java.util.Scanner;

public class Punto04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el número de filas del rombo (debe ser impar): ");
        int n = scanner.nextInt();
        
        if (n % 2 == 0) {
            System.out.println("El número ingresado no es impar.");
            return;
        }
        
        int half = n / 2;

        for (int i = 0; i <= half; i++) {
            for (int j = half; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i * 2; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        

        for (int i = half - 1; i >= 0; i--) {
            for (int j = half; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i * 2; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}
