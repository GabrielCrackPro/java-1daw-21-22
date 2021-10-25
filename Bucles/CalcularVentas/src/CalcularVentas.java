import java.util.Scanner;

public class CalcularVentas {
    // Colores
    public static final String rojo = "\u001B[31m";
    public static final String verde = "\u001B[32m";
    public static final String amarillo = "\u001B[33m";
    public static final String reset = "\u001B[0m";

    public static void main(String[] args) {
        int contadorComida = 0, contadorBebida = 0, totalVentas = 0;
        double contadorDineroTotal = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println(amarillo);
        System.out.println("|------------------------------------|");
        System.out.println("|      [ 1 ] - Refresco - 2.00€      |");
        System.out.println("|------------------------------------|");
        System.out.println("|      [ 2 ] - Cerveza - 1.50€       |");
        System.out.println("|------------------------------------|");
        System.out.println("|      [ 3 ] - Agua Mineral - 1.75€  |");
        System.out.println("|------------------------------------|");
        System.out.println("|      [ 4 ] - Ensalada - 2.00€      |");
        System.out.println("|------------------------------------|");
        System.out.println("|      [ 5 ] - Salchichas - 2.75€    |");
        System.out.println("|------------------------------------|");
        System.out.println("|      [ 6 ] - Bocadillo - 2.00€     |");
        System.out.println("|------------------------------------|");
        System.out.println("|      [ 7 ] - Sopa - 2.60€          |");
        System.out.println("|------------------------------------|");
        System.out.println("|      [ 8 ] - Pastel - 3.00€        |");
        System.out.println("|------------------------------------|");
        System.out.println("|      [ 0 ] - Hacer Caja            |");
        System.out.println("|------------------------------------|");
        System.out.println(reset);

        System.out.print(amarillo + "[ ? ] Introduce un codigo (1-8): " + reset);
        int codigo = sc.nextInt();
        while (codigo != 0) {
            if (codigo >= 1 && codigo <= 8) {
                switch (codigo) {
                case 1:
                    contadorBebida++;
                    contadorDineroTotal += 2.00;
                    break;
                case 2:
                    contadorBebida++;
                    contadorDineroTotal += 1.50;
                    break;
                case 3:
                    contadorBebida++;
                    contadorDineroTotal += 1.75;
                    break;
                case 4:
                    contadorComida++;
                    contadorDineroTotal += 2.00;
                    break;
                case 5:
                    contadorComida++;
                    contadorDineroTotal += 2.75;
                    break;
                case 6:
                    contadorComida++;
                    contadorDineroTotal += 2.00;
                    break;
                case 7:
                    contadorComida++;
                    contadorDineroTotal += 2.60;
                    break;
                case 8:
                    contadorComida++;
                    contadorDineroTotal += 3.00;
                    break;
                }
                System.out.println(verde + "[ € ] Venta añadida con éxito" + reset);
            } else {
                System.out.println(rojo + "[ ! ] Codigo incorrecto" + reset);
            }
            System.out.print(amarillo + "[ ? ] Introduce un codigo (1-8): " + reset);
            codigo = sc.nextInt();
        }
        totalVentas = contadorBebida + contadorComida;
        double porcentajeVentasComida = (contadorBebida * 100 / totalVentas);
        double porcentajeVentasBebida = (contadorComida * 100 / totalVentas);

        System.out.println(verde);
        System.out.println("[ i ] Total de ventas: " + totalVentas);
        System.out.println("[ i ] Total de ventas de comida: " + contadorComida);
        System.out.println("[ i ] Total de ventas de bebida: " + contadorBebida);
        System.out.println("[ € ] Dinero total " + contadorDineroTotal + "€");
        System.out.println("[ % ] Porcentaje de ventas de bebidas: " + porcentajeVentasBebida + "%");
        System.out.println("[ % ] Porcentaje de ventas de comidas: " + porcentajeVentasComida + "%");

        System.out.println(reset);

        sc.close();
    }
}