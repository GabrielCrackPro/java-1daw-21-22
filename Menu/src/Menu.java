import java.util.Scanner;

public class Menu {
    // Colores
    public static final String rojo = "\u001B[31m";
    public static final String verde = "\u001B[32m";
    public static final String amarillo = "\u001B[33m";
    public static final String cyan = "\u001B[36m";
    public static final String reset = "\u001B[0m";

    public static void main(String[] args) {
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
        System.out.println("|      [ 9 ] - Salir                 |");
        System.out.println("|------------------------------------|");
        System.out.println(reset);

        System.out.print(amarillo + "[ ? ] Introduzca el código: " + reset);
        int codigo = sc.nextInt();
        switch (codigo) {
        case 1:
            System.out.println(verde);
            System.out.println("|------ Refresco ---------|");
            System.out.println("|      [ i ] Bebida       |");
            System.out.println("|      [ € ] 2.00€        |");
            System.out.println("|-------------------------|");
            System.out.println(reset);
            break;
        case 2:
            System.out.println(verde);
            System.out.println("|------ Cerveza ----------|");
            System.out.println("|     [ i ] Bebida        |");
            System.out.println("|     [ € ] 1.50€         |");
            System.out.println("|-------------------------|");
            System.out.println(reset);
            break;
        case 3:
            System.out.println(verde);
            System.out.println("|------ Agua Mineral -----|");
            System.out.println("|     [ i ] Bebida        |");
            System.out.println("|     [ € ] 1.75€         |");
            System.out.println("|-------------------------|");
            System.out.println(reset);
            break;
        case 4:
            System.out.println(verde);
            System.out.println("|------ Ensalada ---------|");
            System.out.println("|      [ i ] Comida       |");
            System.out.println("|      [ € ] 2.00€        |");
            System.out.println("|-------------------------|");
            System.out.println(reset);
            break;
        case 5:
            System.out.println(verde);
            System.out.println("|------ Salchichas -------|");
            System.out.println("|      [ i ] Comida       |");
            System.out.println("|      [ € ] 2.75€        |");
            System.out.println("|-------------------------|");
            System.out.println(reset);
            break;
        case 6:
            System.out.println(verde);
            System.out.println("|------ Bocadillo --------|");
            System.out.println("|     [ i ] Comida        |");
            System.out.println("|     [ € ] 2.00€         |");
            System.out.println("|-------------------------|");
            System.out.println(reset);
            break;
        case 7:
            System.out.println(verde);
            System.out.println("|-------- Sopa ----------------|");
            System.out.println("|      [ i ] Comida            |");
            System.out.println("|      [ € ] 2.60€             |");
            System.out.println("|------------------------------|");
            System.out.println(reset);
            break;
        case 8:
            System.out.println(verde);
            System.out.println("|------ Pastel ----------------|");
            System.out.println("|      [ i ] Comida            |");
            System.out.println("|      [ € ] 3.00€             |");
            System.out.println("|------------------------------|");
            System.out.println(reset);
            break;
        case 9:
            break;
        default:
            System.out.println(rojo);
            System.out.println("|---------------------------|");
            System.out.println("| [!] Código incorrecto [!] |");
            System.out.println("|---------------------------|");
            System.out.println(reset);
            System.exit(1);
            break;
        }
        System.out.println(cyan);
        System.out.print("[ ? ] Quieres mostrar otro elemento (s/n): ");
        String respuesta = sc.next();
        if (respuesta.equals("s")) {
            main(args);
        }
        System.out.println(reset);
        sc.close();
    }
}
