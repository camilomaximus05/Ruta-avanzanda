package Taller06_POO_02.src;

import java.util.ArrayList;

public class Curso {

    long codigo;
    String nombre;
    ArrayList<Estudiante> listaDeEstudiantes = new ArrayList<>() ;

    public Curso(long codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        listaDeEstudiantes = new ArrayList<>();
    }

}
