package Taller02;
import java.util.Scanner;
public class Punto02 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su edad");
        int age = scanner.nextInt();
        scanner.close();

        if(age>=18){
            System.out.println("Eres mayor de edad.");
        }else {
            System.out.println("Eres menor de edad.");
        }


    }
}
