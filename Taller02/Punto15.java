package Taller02;
import java.util.Scanner;

public class Punto15 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su nota de 0-100");
        double numRt = scanner.nextDouble();
        scanner.close();

        if(numRt<0 || numRt>100){
            System.out.println("La nota no puede ser menor que 0 ni mayor que 100");
        }else if(numRt>=90){
            System.out.println("A");
        }else if(numRt>=80){
            System.out.println("B");
        }else if(numRt>=70){
            System.out.println("C");
        }else if(numRt>=60){
            System.out.println("D");
        }else if(numRt>=50){
            System.out.println("F");
        }
    }
}