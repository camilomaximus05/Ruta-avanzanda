package Taller02;
import java.util.Scanner;

public class Punto13 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la distancia(Km) que ha recorrido");
        float km = scanner.nextFloat();
        scanner.nextLine();

        System.out.println("Ingrese la tarifa por km");
        float tarifa = scanner.nextFloat();
        scanner.nextLine();

        System.out.println("Ingrese la tarifa por minima");
        float tarifaMin = scanner.nextFloat();
        scanner.close();

        float total = (km*tarifa)+tarifaMin;

        if(km == 1){

        System.out.println("El total a pagar es: " + tarifaMin);

        }else{

        System.out.println("El total a pagar es: " + total);
        
        }    

    }
}