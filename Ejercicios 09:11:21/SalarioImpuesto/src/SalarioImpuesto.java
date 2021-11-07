import java.util.Scanner;

public class SalarioImpuesto {
    // Colores
    public static final String verde = "\u001B[32m";
    public static final String amarillo = "\u001B[33m";
    public static final String reset = "\u001B[0m";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(amarillo + "[ ? ] Introduce el salario mensual (€): " + reset);
        double salarioMensual = sc.nextInt();
        double salarioAnual = salarioMensual * 12;
        double impuesto = 0;

        if (salarioAnual < 10000) {
            impuesto = salarioAnual * 0.05;
        } else if (salarioAnual >= 10001 && salarioAnual <= 25000) {
            impuesto = salarioAnual * 0.12;
        } else if (salarioAnual >= 25001 && salarioAnual <= 38000) {
            impuesto = salarioAnual * 0.15;
        } else if (salarioAnual >= 38001 && salarioAnual <= 60000) {
            impuesto = salarioAnual * 0.22;
        } else if (salarioAnual > 60000) {
            impuesto = salarioAnual * 0.30;
        }
        System.out.println(verde + "[ € ] El salario mensual introducido es " + salarioMensual + "€" + reset);
        System.out.println(verde + "[ € ] El salario anual es " + salarioAnual + "€" + reset);
        System.out.print(verde + "[ € ] El impuesto a pagar es: ");
        System.out.printf("%.2f %n", impuesto);
        System.out.println(reset);

        sc.close();

        // He utilizado printf para que solo muestre 2 decimales ya que el resultado da
        // .999999
    }
}
