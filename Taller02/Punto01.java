package Taller02;
import java.util.Scanner;

public class Punto01 {
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);

        System.out.println("Ingrese el primer número que desea operar");
        double numRt = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Ingrese el segundo número que desea operar");
        double numNd = scanner.nextDouble();
        scanner.nextLine();

        scanner.close();

        double sum = numRt+numNd;
        double rest = numRt-numNd;
        double mult = numRt*numNd;
        double div = numRt/numNd;

        String result = String.format("La suma de los dos números es:  %1f\nLa resta de los dos números  es: %1f\nLa multiplicación de los dos números es: %3f\nLa división de los dos números es: %3f\n", sum, rest, mult, div);

        System.out.println(result);





    }
}
