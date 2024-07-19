import java.util.Scanner;

public class CuentaBancaria {

    Scanner scanner = new Scanner(System.in);

    private String titular;

    private double balance;

    public CuentaBancaria(String titular, double balance) {
        this.titular = titular;
        this.balance = balance;
    }

    void retirardinero (){

        System.out.println("Ingresa la cantidad a retirar: ");
        double retirar = scanner.nextDouble();
        scanner.nextLine();
        if (retirar <= balance){
            balance -= retirar;
            System.out.println("Retiraste: " + retirar + " tu saldo es: " + balance);
        }else{
            System.out.println("No tienes saldo suficiente");
        }
        
    }

    void depositardinero (){
        System.out.println("Ingresa la cantidad a depositar: ");
        double depositar = scanner.nextDouble();
        scanner.nextLine();
        balance += depositar;
        System.out.println("Depositaste: " + depositar + " tu saldo es: " + balance);
    }

}
