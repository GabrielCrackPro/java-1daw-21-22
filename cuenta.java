import java.util.Scanner;

public class cuenta {
    private String nombre;
    private String numero;
    private double interes;
    private double saldo;

    public cuenta(String nombre, String numero, double interes, double saldo) {
        this.nombre = nombre;
        this.numero = numero;
        this.interes = interes;
        this.saldo = saldo;
    }

    // Metodo para mostrar los datos de la cuenta
    public String ver() {
        return "El nombre de la cuenta es " + nombre + " el numero es " + numero + " el interes es " + interes
                + " el saldo es " + saldo + " € \n";
    }

    // Metodo para ingresar dinero a la cuenta
    public void ingreso(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad; // suma la cantidad a la cuenta
            System.out.println("Se han ingresado " + cantidad + " € a la cuenta");
        } else {
            System.out.println("No se puede ingresar una cantidad negativa");
        }
    }

    // Metodo para retirar dinero de la cuenta
    public void reintegro(double cantidad) {
        saldo -= cantidad; // resta la cantidad a la cuenta
    }

    // Metodo para transferir dinero de una cuenta a otra
    public void transferir(cuenta origen, cuenta destino, double cantidad) {
        if (cantidad > 0) {
            System.out.println(
                    "Transfiriendo " + cantidad + "€ de " + "#" + origen.numero + " a " + "#" + destino.numero + "...");
            saldo -= cantidad;
            destino.saldo += cantidad;
            System.out.println("Transferencia realizada");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el nombre de la cuenta: ");
        String nombre = sc.nextLine();
        System.out.print("Introduce el numero de la cuenta: ");
        String numero = sc.nextLine();
        System.out.print("Introduce el interes de la cuenta: ");
        double interes = sc.nextDouble();
        System.out.print("Introduce el saldo de la cuenta: ");
        double saldo = sc.nextDouble();
        cuenta cuenta1 = new cuenta(nombre, numero, interes, saldo);
        cuenta1.ver();
        cuenta cuenta2 = new cuenta("Juan Ferrández Rubio", "12345678901234567890", 1.75, 300);
        cuenta cuenta3 = cuenta2;
        System.out.print("Introduce la cantidad a ingresar en " + "#" + cuenta1.numero + ": ");
        double cantidad = sc.nextDouble();
        cuenta1.ingreso(cantidad);
        cuenta1.ver();
        cuenta2.ver();
        cuenta3.ver();
        cuenta3.transferir(cuenta3, cuenta2, 10.0);

        sc.close();
    }

}