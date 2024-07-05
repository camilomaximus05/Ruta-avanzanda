package Taller02;
import java.util.Scanner;

public class Punto06 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un mes de 1-12 al que le desea saber la cantidad de díasas");
        int month = scanner.nextInt();
        scanner.close();

        if(month>12){
            System.out.println("El mes no existe");
        }else if(month == 2){
            System.out.println("El mes tiene 28 dias");
        }else if(month<7 && month%2==0 || (month>7 && month%2==1 && month!=8)){
            System.out.println("El mes tiene 30 dias");
        }else{
            System.out.println("El mes tiene 31 dias");
        }
        


    }
}