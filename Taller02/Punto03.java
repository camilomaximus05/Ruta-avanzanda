package Taller02;
import java.util.Scanner;

public class Punto03 {
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);

        System.out.println("Ingrese la distancia (Kilometros) que desea convertir a millas");
        double km = scanner.nextDouble();
        scanner.nextLine();
        scanner.close();

        double mi = km*1.60934;
        System.out.println("La distancia en millas es: " + mi);

    }
}
