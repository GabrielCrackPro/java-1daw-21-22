import java.util.Scanner;

public class SumaProducto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        int num1 = sc.nextInt();
        System.out.print("Introduce el segundo número: ");
        int num2 = sc.nextInt();
        int suma = 0;
        int producto = 1;
        for (int i = num1; i <= num2; i++) {
            if (i % 2 == 0) {
                suma += i;
                producto *= i;
            }
        }
        System.out.println("La suma de los números pares es " + suma);
        System.out.println("El producto de los números pares es " + producto);
        sc.close();
    }
}
