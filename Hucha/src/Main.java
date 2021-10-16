import java.util.Scanner;

public class Main {
    // Colores
    public static final String rojo = "\u001B[31m";
    public static final String verde = "\u001B[32m";
    public static final String amarillo = "\u001B[33m";
    public static final String reset = "\u001B[0m"; // volver al color inicial

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hucha hucha = new Hucha();
        int cantidadTotal = 0;
        hucha.setNombre("Pepito");
        hucha.setProposito("PS5");
        System.out.print(amarillo + "[ ? ] Introduce la cantidad a ingresar (€): " + reset);
        int cantidad = sc.nextInt();
        if (cantidad == 1 || cantidad == 2 || cantidad == 5) {
            hucha.setCantidad(cantidad);
            cantidadTotal += hucha.getCantidad();
            hucha.setCantidad(cantidadTotal);
            System.out.println(hucha.mostrarDatos());
            System.out.print(amarillo + "[ ? ] ¿Desea ingresar otra cantidad? (s/n): " + reset);
            String respuesta = sc.next();
            while (respuesta.equals("s")) {
                System.out.print(amarillo + "[ ? ] Introduce la cantidad a ingresar (€): " + reset);
                cantidad = sc.nextInt();
                if (cantidad == 1 || cantidad == 2 || cantidad == 5) {
                    hucha.setCantidad(cantidad);
                    cantidadTotal += hucha.getCantidad();
                    hucha.setCantidad(cantidadTotal);
                    System.out.println(hucha.mostrarDatos());
                    System.out.print(amarillo + "[ ? ] ¿Desea ingresar otra cantidad? (s/n): " + reset);
                    respuesta = sc.next();
                } else {
                    System.out.println(
                            rojo + "[ ! ] Solo se pueden ingresar cantidades en euros de 1, 2 o 5 euros." + reset);
                }
            }
        } else {
            System.out.println(rojo + "[ ! ] Solo puedes introducir monedas de 1€, 2€ o billetes de 5€" + reset);
            System.exit(1);
        }
        sc.close();
    }
}
