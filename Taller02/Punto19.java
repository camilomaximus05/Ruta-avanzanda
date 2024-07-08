import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Punto19 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su año de nacimiento:");
        int anio = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingrese su mes de nacimiento:");
        int mes = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingrese su día de nacimiento:");
        int dia = scanner.nextInt();
        scanner.nextLine();

        LocalDate fechaNacimiento = LocalDate.of(anio, mes, dia);
        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.between(fechaNacimiento, fechaActual);

        int edad = periodo.getYears();
        System.out.println("Tienes " + edad + " años.");

        if (edad >= 18) {
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("No eres mayor de edad.");
        }

        scanner.close();
    }
}
