import java.util.Scanner;

public class Producto {
    private double id;
    private String descripcion;
    private long cantidadEnStock;

    void agregarStock() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Cuantas unidades quieres agregar?");
        long cantidad = scanner.nextLong();
        scanner.nextLine();
        scanner.close();

        this.cantidadEnStock += cantidad;

        System.out.println("Agregaste " + cantidad + " de stock");
    }

    void quitarStock() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Cuantas unidades queres quitar?");
        long cantidad = scanner.nextLong();
        scanner.nextLine();
        scanner.close();

        if (cantidadEnStock > cantidad) {

            this.cantidadEnStock -= cantidad;
            System.out.println("Quito " + cantidad + " de stock");
        }else{
            System.out.println("No hay suficiente stock\n" + cantidadEnStock + " en stock");
        }
    }

    void mostrarStock() {
        System.out.println("Stock: " + cantidadEnStock);
    }
}
