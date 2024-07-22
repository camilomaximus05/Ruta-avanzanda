package Taller06_POO_02.src;

public class Estudiante {
    private long id ;
    private String nombre;
    private String email;

    public Estudiante (long id, String nombre, String email){
        this.id = id;
        this.nombre = nombre;
        this.email = email;

    }

    public long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getNombre() {
        return nombre;
    }
    public void setId(long id) {
        this.id = id;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public void setEmail(String email) {
        this.email = email;
    }
}
