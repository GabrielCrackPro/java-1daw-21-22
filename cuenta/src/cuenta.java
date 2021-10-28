import java.util.Scanner;

public class Cuenta {

    private String nombreCliente;
    private String numeroCuenta;
    private double tipoInteres;
    private double saldo;

    public Cuenta() {
    } // constructor vacio

    double entradaDinero;
    double salidaDinero;
    double transferenciaDinero;

    // constructor con parámetros
    public Cuenta(String nombreCliente, String numeroCuenta, double tipoInteres, double saldo) {
        this.nombreCliente = nombreCliente;
        this.numeroCuenta = numeroCuenta;
        this.tipoInteres = tipoInteres;
        this.saldo = saldo;
    }

    // Constructor copia
    public Cuenta(Cuenta cuenta) {
        this.nombreCliente = cuenta.nombreCliente;
        this.numeroCuenta = cuenta.numeroCuenta;
        this.tipoInteres = cuenta.tipoInteres;
        this.saldo = cuenta.saldo;
    }

    // Setters
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    // Getters
    public String getNombre() {
        return this.nombreCliente;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getTipoInteres() {
        return tipoInteres;
    }

    // Método para ingresar dinero
    public void ingreso(double entradaDinero) {
        if (entradaDinero > 0) {
            saldo += entradaDinero;
            System.out.println(
                    "Se han ingresado " + entradaDinero + " € en la cuenta número " + this.numeroCuenta + "\n");
        } else {
            System.out.println("Se ha producido un error al intentar ingresar " + entradaDinero
                    + " € en la cuenta número " + this.numeroCuenta);
            System.out.println("Por favor, revisa la cantidad que quieres ingresar y vuelve a intentarlo, gracias");
        }
    }

    // Método para retirar dinero
    public void reintegro(double salidaDinero) {
        if (salidaDinero > 0 && salidaDinero >= saldo) {
            saldo -= salidaDinero;
            System.out.println("Se han retirado correctamente la cantidad de " + salidaDinero
                    + " € en la cuenta número + " + this.numeroCuenta);
        } else {
            System.out.println("Se ha producido un error al intentar retirar " + salidaDinero
                    + " € en la cuenta número " + this.numeroCuenta);
            System.out.println("Por favor, revisa la cantidad que quieres retirar y vuelve a intentarlo, gracias");
        }
    }

    // Método para transferir dinero
    public void transferencia(Cuenta cuentaOrigen, Cuenta cuentaDestino, double transferenciaDinero) {
        if (cuentaOrigen.saldo > transferenciaDinero) {
            cuentaOrigen.saldo -= transferenciaDinero;
            cuentaDestino.saldo += transferenciaDinero;
            System.out.println(
                    "Se ha transferido correctamente la cantidad de " + transferenciaDinero + " €, desde la cuenta "
                            + cuentaOrigen.numeroCuenta + " hasta la cuenta " + cuentaDestino.numeroCuenta);

        } else {
            System.out.println("No hay dinero suficiente para realizar la operación");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Crear una Cuenta con el constructor vacio y meter los datos por teclado
        Cuenta cuenta1 = new Cuenta();

        System.out.println("Introduce el nombre del titular de la cuenta");
        String nombreTitular = sc.nextLine();
        cuenta1.setNombreCliente(nombreTitular);

        System.out.println("Introduce el número de la cuenta");
        String numeroCuenta = sc.nextLine();
        cuenta1.setNumeroCuenta(numeroCuenta);

        System.out.println("Introduce el tipo de interés");
        double tipoInteres = sc.nextDouble();
        cuenta1.setTipoInteres(tipoInteres);

        System.out.println("Introduce el saldo de la cuenta");
        double saldoCuenta = sc.nextDouble();
        cuenta1.setSaldo(saldoCuenta);
        Cuenta cuenta2 = new Cuenta("Juan Ferrández Rubio", "12345678901234567890", 1.75, 300);

        Cuenta cuenta3 = new Cuenta();
        cuenta3 = new Cuenta(cuenta1);

        System.out.println("Compruebo la cuenta3: ");
        System.out.println("* El titular de la cuenta es: " + cuenta3.getNombre());
        System.out.println("* El número de cuenta es: " + cuenta3.getNumeroCuenta());
        System.out.println("* El interés es del: " + cuenta3.getTipoInteres() + "%");
        System.out.println("* El saldo es: " + cuenta3.getSaldo() + " €");

        System.out.println("\nLos datos de la cuenta " + cuenta1.getNumeroCuenta() + " son:");
        System.out.println("* El titular de la cuenta es: " + cuenta1.getNombre());
        System.out.println("* El número de cuenta es: " + cuenta1.getNumeroCuenta());
        System.out.println("* El interés es del: " + cuenta1.getTipoInteres() + "%");
        System.out.println("* El saldo es: " + cuenta1.getSaldo() + " €\n");

        cuenta1.ingreso(10000);
        System.out
                .println("El saldo de la cuenta " + cuenta1.getNumeroCuenta() + " es de: " + cuenta1.getSaldo() + " €");

        System.out.println("\nLos datos de la cuenta " + cuenta2.getNumeroCuenta() + " son:");
        System.out.println("* El titular de la cuenta es: " + cuenta2.getNombre());
        System.out.println("* El número de cuenta es: " + cuenta2.getNumeroCuenta());
        System.out.println("* El interés es del: " + cuenta2.getTipoInteres() + "%");
        System.out.println("* El saldo es: " + cuenta2.getSaldo() + " €\n");

        sc.close();

    }
}