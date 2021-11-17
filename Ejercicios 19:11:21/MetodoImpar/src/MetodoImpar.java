import java.util.Scanner;

public class MetodoImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero de inicio: ");
        int inicio = sc.nextInt();
        System.out.print("Introduce un numero de fin: ");
        int fin = sc.nextInt();
        System.out.print(sumaImpares(inicio, fin));
        sc.close();
    }

    public static boolean esImpar(int numero) {
        if (numero > 0) {
            return numero % 2 != 0;
        } else {
            return false;
        }
    }

    public static int sumaImpares(int inicio, int fin) {
        int suma = 0;
        if ((fin >= inicio) && (inicio > 0) && (fin > 0)) {
            for (int i = inicio; i <= fin; i++) {
                if (esImpar(i)) {
                    suma += i;
                }
            }
            return suma;
        } else {
            return -1;
        }
    }
}
