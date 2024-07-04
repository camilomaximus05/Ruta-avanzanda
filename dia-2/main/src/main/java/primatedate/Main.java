package primatedate;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //primate data type
        // byte
        byte isByte = 100;
        short isShort = 1000;
        int isInt = 20000;
        long isLong = 35000000;
        float isFloat = 12.3500f;
        double isDouble = 14.45;
        char isChar = 'a';
        boolean isBoolean = false;

        long sum = isByte+isShort+isInt+isLong;
        
        System.out.println(sum);

        System.out.println("ingrese su edad");
        Scanner scanner = new Scanner (System.in);
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("ingrese su nombre");
        String name = scanner.nextLine();
        scanner.close();

        if (age>18){
            System.out.println("Eres mayor de edad");
        }else{
            System.out.println("Eres menor de edad");
        }

    }
}