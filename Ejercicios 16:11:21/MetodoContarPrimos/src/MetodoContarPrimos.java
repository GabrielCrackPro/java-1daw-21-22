import java.util.Scanner;

public class MetodoContarPrimos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int num = sc.nextInt();
        int contador = 0;
        for (int i = 1; i <= num; i++) {
            if (esPrimo(i)) {
                contador++;
            }
        }
        System.out.println("Hay " + contador + " números primos entre 1 y " + num);
        sc.close();
    }

    public static boolean esPrimo(int num) {
        boolean primo = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                primo = false;
            }
        }
        return primo;
    }
}