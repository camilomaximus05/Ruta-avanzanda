package Taller02;
import java.util.Scanner;
import java.util.Random;

public class Punto18  {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Elige: piedra, papel o tijera");
        String eleccionUsuario = scanner.nextLine().toLowerCase();

        String[] opciones = {"piedra", "papel", "tijera"};
        String eleccionComputadora = opciones[random.nextInt(opciones.length)];

        System.out.println("Computadora eligió: " + eleccionComputadora);

        if (eleccionUsuario.equals(eleccionComputadora)) {
            System.out.println("Es un empate");
        } else if ((eleccionUsuario.equals("piedra") && eleccionComputadora.equals("tijera")) ||
                (eleccionUsuario.equals("papel") && eleccionComputadora.equals("piedra")) ||
                (eleccionUsuario.equals("tijera") && eleccionComputadora.equals("papel"))) {
            System.out.println("¡Ganaste!");
        } else {
            System.out.println("Perdiste");
        }

        scanner.close();
    }
}


