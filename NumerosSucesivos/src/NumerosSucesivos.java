import java.util.Scanner;

public class NumerosSucesivos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int numero = sc.nextInt();
        if (numero < 20) {
            System.out.println("Has introducido el numero " + numero);
            while (numero < 20) {
                System.out.print("Introduce otro numero: ");
                numero = sc.nextInt();
                System.out.println("Has introducido el numero " + numero);
            }
        } else {
            System.out.println("El numero" + numero + " es mayor que 20");
        }
        sc.close();
    }
}
