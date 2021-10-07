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

    public String ver() {
        return "El nombre de la cuenta es " + nombre + " el numero es " + numero + " el interes es " + interes
                + " el saldo es " + saldo + "\n";
    }

    public void ingreso(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
        } else {
            System.out.println("No se puede ingresar una cantidad negativa");
        }
    }

    public void reintegro(double cantidad) {
        saldo -= cantidad;
    }

    public void transferir(String origen, String destino, double cantidad) {
        if (cantidad > 0) {
            if (origen.equals(numero)) {
                saldo -= cantidad;
                System.out.println("Transferencia realizada");
            }
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
        cuenta cuenta2 = new cuenta("Juan Ferrández Rubio", "12345678901234567890", 1.75, 300);
        System.out.print(cuenta1.ver());
        System.out.print("Introduce la cantidad a ingresar en cuenta1: ");
        double cantidad = sc.nextDouble();
        cuenta1.ingreso(cantidad);
        System.out.println(cuenta1.ver());
        System.out.print(cuenta2.ver());

        sc.close();
    }

}