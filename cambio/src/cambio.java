import java.util.Scanner;

public class cambio {
    // Colores
    public static final String red = "\u001B[31m";
    public static final String green = "\u001B[32m";
    public static final String yellow = "\u001B[33m";
    public static final String blue = "\u001B[34m";
    public static final String reset = "\u001B[0m"; // volver al color inicial

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(yellow + "[ ? ] Ingresa el precio del producto (€): " + reset);
        double precio = sc.nextDouble();
        System.out.print(yellow + "[ ? ] Ingresa el pago (€): " + reset);
        double dinero = sc.nextDouble();
        if (dinero < precio) {
            System.out.println(red + "[ ! ] No hay suficiente dinero. Inténtalo de nuevo" + reset);
            main(args);
        } else {
            double cambio = dinero - precio;
            System.out.println(green + "[ i ] Cambio: " + cambio + "€" + reset);
            int billetes100 = 0, billetes50 = 0, billetes20 = 0, billetes10 = 0, billetes5 = 0;
            int monedas2 = 0, monedas1 = 0;
            if (cambio >= 100) {
                billetes100++;
                cambio = cambio - 100;
                billetes100++;
            }
            if (cambio >= 50) {
                billetes50++;
                cambio = cambio - 50;
            }
            if (cambio >= 20) {
                billetes20++;
                cambio = cambio - 20;
            }
            if (cambio >= 10) {
                billetes10++;
                cambio = cambio - 10;
            }
            if (cambio >= 5) {
                billetes5++;
                cambio = cambio - 5;
            }
            if (cambio >= 2) {
                monedas2++;
                cambio = cambio - 2;
            }
            if (cambio >= 1) {
                monedas1++;
                cambio = cambio - 1;
            }
            System.out.println(green + "[ i ] Se deben devolver:");
            if (billetes100 > 0) {
                System.out.println(green + billetes100 + " billetes de 100€" + reset);
            }
            if (billetes50 > 0) {
                System.out.println(green + billetes50 + " billetes de 50€" + reset);
            }
            if (billetes20 > 0) {
                System.out.println(green + billetes20 + " billetes de 20€" + reset);
            }
            if (billetes10 > 0) {
                System.out.println(green + billetes10 + " billetes de 10€" + reset);
            }
            if (billetes5 > 0) {
                System.out.println(green + billetes5 + " billetes de 5€" + reset);
            }
            if (monedas2 > 0) {
                System.out.println(green + monedas2 + " monedas de 2€" + reset);
            }
            if (monedas1 > 0) {
                System.out.println(green + monedas1 + " monedas de 1€" + reset);
            }
            sc.close();
        }
    }
}