import java.util.Scanner;

public class Asteriscos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int numero = sc.nextInt();
        int i = 0;
        while (i < numero) {
            System.out.print("*");
            i++;
        }
        System.out.println();
        sc.close();
    }
}
