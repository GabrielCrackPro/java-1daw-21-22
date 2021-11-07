import java.util.Scanner;

public class ViajeAutobus {
    // Colores
    public static final String verde = "\u001B[32m";
    public static final String amarillo = "\u001B[33m";
    public static final String reset = "\u001B[0m";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(amarillo + "[ ? ] Introduce la distancia del viaje (km): " + reset);
        int distancia = sc.nextInt();
        System.out.print(amarillo + "[ ? ] Introduce el número de personas que viajan juntas: " + reset);
        int personas = sc.nextInt();

        double precioIndividual = 20 * personas;
        if (distancia > 200) {
            precioIndividual += (distancia - 200) * 0.03;
        }
        if (distancia > 400) {
            precioIndividual *= 0.85;
        }
        if (personas >= 3) {
            precioIndividual *= 0.90;
        }

        double precioTotal = precioIndividual * personas;

        System.out.println(verde + "[ € ] El precio del billete individual es " + precioIndividual + "€" + reset);
        System.out.println(verde + "[ € ] El precio total a pagar es: " + precioTotal + "€" + reset);

        sc.close();
    }
}
