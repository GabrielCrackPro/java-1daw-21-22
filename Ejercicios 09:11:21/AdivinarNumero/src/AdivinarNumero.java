import java.util.Scanner;

public class AdivinarNumero {
    // Colores
    public static final String verde = "\u001B[32m";
    public static final String amarillo = "\u001B[33m";
    public static final String reset = "\u001B[0m";
    public static final String rojo = "\u001B[31m";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = (int) (Math.random() * 100) + 1; // Fórmula para generar un numero aleatorio
        int intentos = 0;
        int numeroUsuario;
        do {
            System.out.print(amarillo + "[ ? ] Introduce un numero del 1 al 100: " + reset);
            numeroUsuario = sc.nextInt();
            intentos++;
            if (numeroUsuario > numero) {
                System.out.println(rojo + "[ < ] El numero es MENOR" + reset);
            } else if (numeroUsuario < numero) {
                System.out.println(rojo + "[ > ] El numero es MAYOR" + reset);
            }
        } while (numeroUsuario != numero);
        System.out.println(verde + "[ i ] Has acertado el numero en " + intentos + " intentos" + reset);

        sc.close();
    }
}
