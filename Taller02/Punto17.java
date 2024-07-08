package Taller02;
import java.util.Scanner;

public class Punto17{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el caracter al que le desea conocer el tipo");
        char character = scanner.next().charAt(0);
        scanner.close();

        if(!Character.isLetterOrDigit(character) && !Character.isWhitespace(character) && !Character.isDigit(character)){
            System.out.println("El caracter es un caracter especial");
        }else if(Character.isLetter(character) && (character != 'a' && character != 'e' && character != 'i' && character != 'o' && character != 'u')){
            System.out.println("El caracter es una consonante");
        }else if (!Character.isDigit(character)){
            System.out.println("El caracter es una vocal");
        }else{
            System.out.println("El caracter es un número");
        }
    }
}
