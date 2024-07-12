package Taller04_2;
import java.util.Scanner;

public class Punto03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float minGrade = 76;
        float total = 0;
        int cant;

        while (true) {

            System.out.println("Ingrese la cantidad de notas ya registradas");
            int can = scanner.nextInt();
            scanner.nextLine();

            if (can <= 0 || can > 8) {

                System.out.println("La cantidad de notas debe ser mayor a 0 y menor o igual a 8");

            } else {
                cant=can;
                break;

            }
        }

        float[] grades = new float[cant];

        for(int i=0; i<cant; i++){

            System.out.println("Ingrese la nota #" + (i+1));
            grades[i] = scanner.nextFloat();
            scanner.nextLine();
            total += grades[i];

        }

        double prom = total/8;
        System.out.println("El promedio de las notas es: " + prom);

        double missingGrade = ((minGrade - prom)*8)/4;
        if(prom < minGrade){
        System.out.println("necesitas que el promedio de las siguientes notas sea de: " + missingGrade);
        }else{
            System.out.println("Felicidades, has aprobado con un promedio de: " + prom);
        }
        
        

    }
}