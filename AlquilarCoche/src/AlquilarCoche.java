import java.util.Scanner;

public class AlquilarCoche {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce tu edad: ");
        int edad = sc.nextInt();
        System.out.print("Introduce el crédito: ");
        int credito = sc.nextInt();

        if (edad >= 21 && credito >= 1000) {
            System.out.println("Puedes alquilar un coche");
        } else {
            System.out.println("No puedes alquilar un coche");
        }
        // Si cambias el && por el || la condición se cumpliria tan solo con que una de
        // las partes se cumpla

        sc.close();
    }
}
