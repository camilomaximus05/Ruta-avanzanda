package Taller04_2;
import java.util.Scanner;

public class Punto07 {
    public static void main(String[] args) {

        int [][] matrizTranspuesta = new int[3][3];

        int [][] matriz =  {{1,2,3},
                            {4,5,6},
                            {7,8,9}};

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizTranspuesta[j][i] = matriz[i][j];
            }
        }
        System.out.println("La matriz original es: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }


        System.out.println("\nLa matriz transpuesta es: ");
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrizTranspuesta[i][j]+" ");
            }
            System.out.println();
        }
    }
}