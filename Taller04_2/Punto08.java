package Taller04_2;
import java.util.Scanner;

public class Punto08 {
    public static void main(String[] args) {

        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el numero de filas");
        int rows = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Ingrese el numero de columnas");
        int columns = scanner.nextInt();
        scanner.nextLine();

        int [][] matrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.println("Ingrese el elemento [" + i + "][" + j + "]");
                matrix[i][j] = scanner.nextInt();
                scanner.nextLine();
            }
        }
        scanner.close();

        int [][] matrixTranspuesta = new int[columns][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrixTranspuesta[j][i] = matrix[i][j];
            }
        }

        if (rows == columns) {
            System.out.print("La matriz es cuadrada");
            if(matrix == matrixTranspuesta){
                System.out.print("y simétrica");
            }else{
                System.out.println(", pero no es simétrica");
            }
        } else {
            System.out.println("La matriz no es cuadrada, ni simétrica");
        }

        
    }
}