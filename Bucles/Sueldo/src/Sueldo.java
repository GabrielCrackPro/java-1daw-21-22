import java.util.Scanner;

public class Sueldo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sueldo = 0;
        int max = 0;
        int min = 0;
        System.out.print("Ingrese el sueldo: ");
        sueldo = sc.nextInt();
        while (sueldo != 0) {
            System.out.print("Ingrese el sueldo: ");
            sueldo = sc.nextInt();
            if (sueldo != 0) {
                if (sueldo > max) {
                    max = sueldo;
                }
                if (sueldo < min) {
                    min = sueldo;
                }
            }
        }
        System.out.println("El sueldo máximo es: " + max);
        sc.close();
    }
}
