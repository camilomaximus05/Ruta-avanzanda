package Taller02;

import java.util.Scanner;

public class Punto16 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        boolean secure = false;
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasChartSpecial = false;

        System.out.println("Ingrese la contraseña que desea saber si es segura:");
        String password = scanner.nextLine();
        scanner.close();

        if (password.length() >= 8) {
            for (int i = 0; i < password.length(); i++) {
                
                char letter = password.charAt(i);

                if (Character.isUpperCase(letter)) {
                    hasUpperCase = true;
                }

                if (Character.isLowerCase(letter)) {
                    hasLowerCase = true;
                }

                if (!Character.isLetterOrDigit(letter)) {
                    hasChartSpecial = true;
                }
            }

            if (!hasUpperCase) {
                System.out.println("La contraseña no tiene mayúsculas");
            }

            if (!hasLowerCase) {
                System.out.println("La contraseña no tiene minúsculas");
            }

            if (!hasChartSpecial) {
                System.out.println("La contraseña no tiene caracteres especiales");
            }

            if (hasUpperCase && hasLowerCase && hasChartSpecial) {
                secure = true;
            }

        } else {
            System.out.println("La contraseña debe tener al menos 8 caracteres");
        }

        if (secure) {
            System.out.println("La contraseña es segura");
        } else {
            System.out.println("La contraseña no es segura");
        }
    }
}
