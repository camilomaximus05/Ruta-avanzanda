import java.util.ArrayList;
import java.util.Scanner;

public class Estudiante {

    private String nombre;
    private ArrayList<Double> notas = new ArrayList<Double>();

    public Estudiante(String nombre, Double nota) {
        this.nombre = nombre;
        this.notas.add(nota);
    }

    void agregarNotas(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Cuantas notas quieres agregar?");
        int cantidad = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingresa la nota: ");
            double nota = scanner.nextDouble();
            scanner.nextLine();
            this.notas.add(nota);
        }
        
        scanner.close();
    }


    void calcularPromedio(){
        double suma = 0;
        
        for (Double nota : notas) {
            suma += nota;
        }

        double promedio = suma / notas.size();

        System.out.println("Tu promedio es: " + promedio);
    }

    
}
