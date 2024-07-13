package Taller04_2;
import java.util.Scanner;

public class Punto06 {
    public static void main(String[] args) {

        int posicition = 0;

        String[] nombres = new String[5]; 


        nombres[0] = "Juan";
        nombres[1] = "María";
        nombres[2] = "Pedro";
        nombres[3] = "Ana";
        nombres[4] = "Luisa";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre que desea buscar en la lista");
        String name = scanner.nextLine();
        scanner.close();

        boolean found = false;
        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i].equals(name)) {
                found = true;
                posicition=i;
                break;
            }
        }

        if (found) {
            System.out.println("El nombre se encuentra en la lista, en la posicion " + (posicition));
        } else {
            System.out.println("El nombre no se encuentra en la lista");
        }

    }
}