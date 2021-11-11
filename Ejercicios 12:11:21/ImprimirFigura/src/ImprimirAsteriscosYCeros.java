import java.util.Scanner;

public class ImprimirAsteriscosYCeros {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Dime un numero entre 1 y 20: ");
        int numero = sc.nextInt();

        if (numero > 1 && numero <= 20) {

            for (int j = 0; j <= numero; j++) {
                int i = 0;
                while (i < j) {
                    if (i % 2 == 0) {
                        System.out.print("*");

                    } else {
                        System.out.print("0");
                    }
                    i++;
                }
                System.out.println();
            }
        } else {
            System.out.println("El número que has introducido no es válido");
        }
        sc.close();

    }

}