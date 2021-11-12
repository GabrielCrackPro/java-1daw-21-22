import java.util.Scanner;

public class MetodoSumaImpares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int numero = sc.nextInt();
        SumaImpares(numero);
        sc.close();
    }

    public static void SumaImpares(int numero) {
        int suma = 0;
        for (int i = 1; i <= numero; i++) {
            if (i % 2 != 0) {
                suma += i;
            }
        }
        System.out.println("La suma de los primeros " + numero + " numeros impares es " + suma);

    }
}
