package Taller02;
import java.util.Scanner;

public class Punto10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el total de su cuenta");
        float account = scanner.nextFloat();
        scanner.nextLine();

        System.out.println("Ingrese el porcentaje (entre 0 y 100) de propina que desea dejar");
        double tip = (double) scanner.nextInt() / 100;
        scanner.close();

        double total = account*tip;

        System.out.println("La propina es de: " + total + "$");


    }
}