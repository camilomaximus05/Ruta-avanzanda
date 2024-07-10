package Taller03;

import java.util.Scanner;

public class Punto03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa la cantidad de números de la sucesión de Fibonacci que quieres: ");
        int numero = scanner.nextInt();
        scanner.close();

        int num1 = 0;
        int num2 = 1;

        switch (numero) {
            case 1:

                System.out.println("1. "+0);
                break;

            case 2:

                System.out.println("1. "+0 );
                System.out.println("2. "+1);
                break;

            default:

                System.out.println("1. "+0 );
                System.out.println("2. "+1);

                for (int i = 3; i < numero+1; i++) {
                    int num3 = num1 + num2;
                    num1 = num2;
                    num2 = num3; 
                        System.out.println(i + ". " + num3);
                    }
                    break;
        }

    }
}
