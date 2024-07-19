package Taller06_POO_02.src;

import  java.util.*;
public class Inventario {

    ArrayList<ProductoEspecifico> listaDeProductos = new ArrayList<>();

    public Inventario() {
        listaDeProductos = new ArrayList<>() ;
    }

    void agregarProducto() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el id del producto");
        long id = scanner.nextLong();
        scanner.nextLine();

        System.out.println("Ingresa el nombre del producto");
        String nombre = scanner.next();
        scanner.nextLine();

        System.out.println("Ingresa el precio del producto");
        double precio = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Ingresa la marca del producto");
        String marca = scanner.nextLine();

        System.out.println("Ingresa la categoria del producto");
        String categoria = scanner.nextLine();

        scanner.close();

        ProductoEspecifico Producto = new ProductoEspecifico(id, nombre, precio, marca, categoria);
        listaDeProductos.add(Producto);
    }

    void eliminarProducto() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el id del producto");
        long id = scanner.nextLong();
        scanner.nextLine();
        scanner.close();

        boolean encotrado = false;

        for (int i = 0; i < listaDeProductos.size() && !encotrado; i++) {

            if (listaDeProductos.get(i).getId() == id) {
                listaDeProductos.remove(i);
                encotrado = true;

            }

            if (i == listaDeProductos.size() - 1 && !encotrado) {
                System.out.println("No se encontro el producto");

            } 
        }
    }

    void buscarProducto(){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("¿Desea buscar por nombre o por categoria?\n1.)Por nombre\n2.)Por categoria");
        int opcion = scanner.nextInt();
        scanner.nextLine();
        
        if(opcion==1){
            System.out.println("Ingrese el nombre del producto:");
            String nombre = scanner.nextLine();

            for (ProductoEspecifico listaDeProducto : listaDeProductos) {

                if (listaDeProducto.getNombre().equals(nombre)) {

                    System.out.println("Id: " + listaDeProducto.getId());
                    System.out.println("Nombre: " + listaDeProducto.getNombre());
                    System.out.println("Precio: " + listaDeProducto.getPrecio());
                    System.out.println("Marca: " + listaDeProducto.getMarca());
                    System.out.println("Categoria: " + listaDeProducto.getCategoria());
                }
            }

        }else if(opcion==2){
            System.out.println("Ingrese la categoria del producto:");
            String categoria = scanner.nextLine();

            for (ProductoEspecifico listaDeProducto : listaDeProductos) {

                if (listaDeProducto.getCategoria().equals(categoria)) {
                    System.out.println("Id: " + listaDeProducto.getId());
                    System.out.println("Nombre: " + listaDeProducto.getNombre());
                    System.out.println("Precio: " + listaDeProducto.getPrecio());
                    System.out.println("Marca: " + listaDeProducto.getMarca());
                    System.out.println("Categoria: " + listaDeProducto.getCategoria());
                }

            }
        }
    }

    void mostrarInventario() {

        for (ProductoEspecifico listaDeProducto : listaDeProductos) {
            System.out.println("Id: " + listaDeProducto.getId());
            System.out.println("Nombre: " + listaDeProducto.getNombre());
            System.out.println("Precio: " + listaDeProducto.getPrecio());
            System.out.println("Marca: " + listaDeProducto.getMarca());
            System.out.println("Categoria: " + listaDeProducto.getCategoria());
            System.out.println(" ");
        }
    }

}
    

