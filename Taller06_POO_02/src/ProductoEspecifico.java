public class ProductoEspecifico extends Producto {
    private String marca;
    private String categoria;


    public ProductoEspecifico(long id, String nombre, double precio, String marca, String categoria) {
        super(id, nombre, precio);
        this.marca = marca;
        this.categoria = categoria;
    }

    public String getMarca() {
        return marca;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
