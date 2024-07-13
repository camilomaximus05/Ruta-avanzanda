package Taller04_2;
import java.util.Scanner;

public class Punto04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el numero de productos que desea comprar: ");
        int num = scanner.nextInt();
        scanner.nextLine();

        String [] products = new String[num];
        double [] prices = new double[num];
        int [] quantities = new int[num];
        double total = 0;
        double discount ;
        

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
            System.out.println(products[i] +" X"+quantities[i] +"  $" + prices[i]);

            total += prices[i] * quantities[i];
        }
        
        if (total < 200) {
            discount = 1;
            System.out.println("\nEl total de su compra es es: " + total+"\n No tiene descuento");
        }else if(total >= 200 && total < 300){
            discount = 0.9;
            System.out.println("\nEl total de su compra es: " + (total*discount)+"\nDescuento del 10%");
        }else if(total >= 300 && total < 500){
            discount = 0.85;
            System.out.println("\nEl total de su compra es: " + (total*discount)+"\nDescuento del 15%");
        }else if(total >= 500 && total < 1000){
            discount = 0.8;
            System.out.println("\nEl total de su compra es es: " + (total*discount)+"\nDescuento del 20%");
        }else{
            discount = 0.75;
            System.out.println("\nEl total de su compra es es: " + (total*discount)+"\nDescuento del 25%");
        }
    }
}