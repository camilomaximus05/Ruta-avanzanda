package Taller06_POO_02.src;

import java.util.ArrayList;
import java.util.Scanner;

public class GestionCursos {
    
    static ArrayList<Curso> listaDeCursos = new ArrayList<>() ;

    static ArrayList<Estudiante> listaDeEstudiantes = new ArrayList<>() ;
    
    static void agregarCursos(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cuantos cursos quieres agregar?");
        int cantidad = scanner.nextInt();

        for (int i = 0; i < cantidad; i++) {
            
            System.out.println("Ingresa el Codigo del curso: ");
            int codigo = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Ingresa el nombre del curso: ");
            String nombre = scanner.nextLine();

            Curso curso = new Curso(codigo, nombre);
            listaDeCursos.add(curso);
        }
        scanner.close();
    }

    static void agreagarEstudiantes(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Cuantos estudiantes quieres agregar?");
        int cantidad = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < cantidad; i++) {

            System.out.println("Ingresa el Id del estudiante: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Ingresa el nombre del estudiante: ");
            String nombre = scanner.nextLine();

            System.out.println("Ingresa el email del estudiante: ");
            String email = scanner.nextLine();

            Estudiante estudiante = new Estudiante(id, nombre, email);

            listaDeEstudiantes.add(estudiante);

            System.out.println("Estudiante agregado con exito");
        }

        scanner.close();

    }

    static void insbrirEstudianteAlCurso(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cuantos estudiantes quieres agregar?");
        int cantidad = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Ingresa el Codigo del curso: ");
        int codigoCurso = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < cantidad; i++) {

            System.out.println("Ingresa el Id del estudiante que desea inscribir: ");
            int idEstudiante = scanner.nextInt();
            scanner.nextLine();

            if (listaDeEstudiantes.isEmpty()) {
                System.out.println("No hay estudiantes para inscribir");
                break;
            }

            if (!listaDeEstudiantes.contains(idEstudiante)) {
                System.out.println("El estudiante no existe");
                break;
            }

            for (Estudiante estudiante : listaDeEstudiantes) {

                if(estudiante.getId() == idEstudiante){

                    for (Curso curso : listaDeCursos) {

                        if(curso.getCodigo() == codigoCurso){

                            curso.listaDeEstudiantes.add(estudiante);
                        }
                    }
                }
            }

        }

        scanner.close();

    }

    static void mostrarEstudiantesPorCurso(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el Codigo del curso: ");
        int codigo = scanner.nextInt();
        scanner.nextLine(); 

        for (Curso curso : listaDeCursos) {
            if(curso.getCodigo() == codigo){
                for (Estudiante estudiante : curso.getListaDeEstudiantes()) {
                    System.out.println("Id: " + estudiante.getId());
                    System.out.println("Nombre: " + estudiante.getNombre());
                    System.out.println("Email: " + estudiante.getEmail()+"\n");
                }
            }
        }
        scanner.close();
    }
            
}

