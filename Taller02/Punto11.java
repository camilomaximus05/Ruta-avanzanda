package Taller02;
import java.util.Scanner;

public class Punto11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número");
        int num1 = scanner.nextInt();
        scanner.nextLine(); 
        System.out.println("Ingrese el segundo número");
        int num2 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingrese el tercer número");
        int num3 = scanner.nextInt();
        scanner.close();

        if(num1>num2 && num1>num3){
            System.out.println("El mayor es: " + num1);

            if(num2>num3){
                System.out.println("El segundo mayor es: " + num2);
            }else{
                System.out.println("El segundo mayor es: " + num3);
            }

        }else if(num2>num1 && num2>num3){

            System.out.println("El mayor es: " + num2);

            if(num1>num3){
                System.out.println("El segundo mayor es: " + num1);
            }else{
                System.out.println("El segundo mayor es: " + num3);
            }

        }else{
            System.out.println("El mayor es: " + num3);
            if(num1>num2){
                System.out.println("El segundo mayor es: " + num1);
            }else{
                System.out.println("El segundo mayor es: " + num2);
            }
        }

    }
}