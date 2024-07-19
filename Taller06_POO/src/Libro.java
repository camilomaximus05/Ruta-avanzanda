import java.util.Scanner;

public class Libro {

    private String titulo;
    private String autor;
    private int anioPublicacion;
    private boolean prestado;
    Scanner scanner = new Scanner(System.in);



    public Libro(String titulo, String autor, int anioPublicacion, boolean prestado) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.prestado = prestado;

    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    void prestar(){

        if (!prestado){
            setPrestado(true);
            System.out.println("Has prestado: " + getTitulo());
        }else{
            System.out.println("Ya esta prestado");
        }

    }

    void devolver(){
        if (prestado){
            setPrestado(false);
            System.out.println("Has devuelto: " + getTitulo());
        }else{
            System.out.println("No esta prestado");
        }
    }

}
