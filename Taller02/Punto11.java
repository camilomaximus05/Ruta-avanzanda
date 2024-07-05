package Taller02;
import java.util.Scanner;

public class Punto11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número que desea ordenar");
        int num1 = scanner.nextInt();
        scanner.nextLine(); 
        System.out.println("Ingrese el segundo número que desea ordenar");
        int num2 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingrese el tercer número que desea ordenar");
        int num3 = scanner.nextInt();
        scanner.close();

        if (num1==num3 || num1==num2){
            System.out.println("No se puede ordenar");
        }else{
            if(num1>num2 && num1>num3){
                System.out.println("El mayor es: " + num1);
    
                if(num2>num3){
                    System.out.println("El numero del medio es: " + num2);
                    System.out.println("El menor es: " + num3);
                }else{
                    System.out.println("El numero del medio es: " + num3);
                    System.out.println("El menor es: " + num2);
                }
    
            }else if(num2>num1 && num2>num3){
    
                System.out.println("El mayor es: " + num2);
    
                if(num1>num3){
                    System.out.println("El numero del medio es: " + num1);
                    System.out.println("El menor es: " + num3);
                }else{
                    System.out.println("El numero del medio es: " + num3);
                    System.out.println("El menor es: " + num1);
                }
    
            }else{
                System.out.println("El mayor es: " + num3);
                if(num1>num2){
                    System.out.println("El numero del medio es: " + num1);
                    System.out.println("El menor es: " + num2);
                }else{
                    System.out.println("El numero del medio es: " + num2);
                    System.out.println("El menor es: " + num1);
                }
            }
    
        }

        
    }
}