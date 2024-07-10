import java.util.Scanner;

public class Punto01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa la cantidad de números primos que quieres: ");
        int cantidad = scanner.nextInt();
        scanner.close();

        int contador = 0;
        int numero = 2;
        
        while (contador < cantidad) {
            if (esPrimo(numero)) {
                System.out.println(numero);
                contador++;
            }
            numero++;
        }
    }

    public static boolean esPrimo(int numero) {

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}