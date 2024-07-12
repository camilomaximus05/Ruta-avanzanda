package Taller04_2;
import java.util.Scanner;


public class Punto02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el numero de productos que desea comprar: ");
        int num = scanner.nextInt();
        scanner.nextLine();

        String [] products = new String[num];
        double [] prices = new double[num];
        int [] quantities = new int[num];
        double total = 0;

        for (int i = 0; i < num; i++) {
            
            System.out.println("Ingrese el nombre del producto #" + (i+1) + ": ");
            String product = scanner.nextLine();

            products[i] = product;

            System.out.println("ingresa el valor de "+products[i]);
            int price = scanner.nextInt();
            scanner.nextLine();

            prices[i] = price;

            System.out.println("ingrese la cantidad de "+products[i]+" que desea comprar");
            int quantity = scanner.nextInt();
            scanner.nextLine();

            quantities[i] = quantity;

        }
        scanner.close();

        for (int i = 0; i < num; i++) {
            System.out.println(products[i] +"  $" + prices[i]+" X"+quantities[i]);

            total += prices[i] * quantities[i];
        }

        System.out.println("\nTotal: $" + total);
    }
}
