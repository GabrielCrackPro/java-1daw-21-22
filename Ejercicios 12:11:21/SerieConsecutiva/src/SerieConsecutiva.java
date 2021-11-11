import java.util.Scanner;

public class SerieConsecutiva {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        int num1 = sc.nextInt();
        System.out.print("Introduce el segundo número: ");
        int num2 = sc.nextInt();
        System.out.print("Introduce el límite de números de la serie: ");
        int limite = sc.nextInt();
        int suma = num1 + num2;
        System.out.print(num1 + " " + num2 + " ");
        for (int i = 1; i < limite - 2; i++) {
            num1 = num2;
            num2 = suma;
            suma = num1 + num2;
            System.out.print(suma + " ");
        }
        sc.close();
    }
}
