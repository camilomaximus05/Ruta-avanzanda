package Taller04_2;
import java.util.Scanner;

public class Punto05 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el texto (Sin caracteres especiales)");
        String text = scanner.nextLine();
        
        System.out.println("Cual es la palabra que desea saber cuantas veces aparece");
        String word = scanner.nextLine();
        scanner.close();

        String [] words = text.split(" ");

        int count = 0;

        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(word)) {
                count++;
            }
        }

        System.out.println("La palabra " + word + " aparece " + count + " veces");


        
    }

}