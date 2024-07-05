package Taller02;
import java.util.Scanner;

public class Punto12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Scanner sacanner = new Scanner(System.in);
        System.out.println("Su mes de nacimiento del 1 al 12");
        int month = sacanner.nextInt();
        System.out.println("Su dia de nacimiento del 1 al 31");
        int day = sacanner.nextInt();
        scanner.close();

        switch (month) {
            case 1:
                if (day >= 20) {
                    System.out.println("Acuario");
                } else {
                    System.out.println("Capricornio");
                }
                break;
            case 2:
                if (day >= 19) {
                    System.out.println("Piscis");
                } else {
                    System.out.println("Acuario");
                }
                break;
            case 3:
                if (day >= 21) {
                    System.out.println("Aries");
                } else {
                    System.out.println("Piscis");
                }
                break;
            case 4:
                if (day >= 20) {
                    System.out.println("Tauro");
                } else {
                    System.out.println("Aries");
                }
                break;
            case 5:
                if (day >= 21) {
                    System.out.println("Geminis");
                } else {
                    System.out.println("Tauro");
                }
                break;
            case 6:
                if (day >= 22) {
                    System.out.println("Cancer");
                } else {
                    System.out.println("Geminis");
                }   
                break;
            case 7:
                if (day >= 23) {
                    System.out.println("Leo");
                } else {
                    System.out.println("Cancer");
                }
                break;
            case 8:     
                if (day >= 23) {
                    System.out.println("Virgo");
                } else {
                    System.out.println("Leo");
                }
                break;
            case 9:
                if (day >= 23) {
                    System.out.println("Libra");
                } else {
                    System.out.println("Virgo");
                }
                break;
            case 10:
                if (day >= 23) {
                    System.out.println("Escorpio");
                } else {
                    System.out.println("Libra");
                }  
                break;
            case 11:
                if (day >= 22) {
                    System.out.println("Sagitario");
                } else {
                    System.out.println("Escorpio");
                }
                break;
            case 12:
                if (day >= 22) {
                    System.out.println("Capricornio");
                } else {
                    System.out.println("Sagitario");
                }
                break;
            default:
                System.out.println("Mes no valido");
        }
    }
}