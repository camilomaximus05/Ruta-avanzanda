package Taller04_2;
import java.util.Scanner;

public class Punto10 {
    public static void main(String[] args) {

        int [] numeros = {1,2,3,4,5,6,7,8,9,10};
        int [] numerosalrevez = new int[10];

        System.out.println("Los elementos del arreglo son: ");

        for (int i = 0; i < 10; i++) {
            System.out.print(numeros[i]+"-");
            numerosalrevez[i] = numeros[9-i];
        }

        System.out.println("\nLos elementos del arreglo al reves son: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(numerosalrevez[i]+"-");
        }

        

    }
}