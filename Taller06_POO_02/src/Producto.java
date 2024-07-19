package Taller06_POO_02.src;

public class Producto {
    private long id;
    private String nombre;
    private double precio;

    public Producto(long id, String nombre, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }


    public long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }
    
    public void setId(long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
