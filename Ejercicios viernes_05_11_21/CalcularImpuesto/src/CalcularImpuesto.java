import java.util.Scanner;

public class CalcularImpuesto {
    // Colores
    public static final String verde = "\u001B[32m";
    public static final String amarillo = "\u001B[33m";
    public static final String reset = "\u001B[0m";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(amarillo + "[ ? ] Introduce el precio del artículo (€): " + reset);
        double precio = sc.nextDouble();
        double impuesto = 0;
        if (precio < 300) {
            impuesto = 0;
        } else {
            impuesto = precio * 0.05;
        }
        System.out.println(verde + "[ € ] El impuesto es " + impuesto + " €" + reset);
        System.out.println(verde + "[ € ] El precio total es " + (precio + impuesto) + " €" + reset);
        sc.close();
    }
}
