import java.util.Scanner;

public class ContarVocales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una palabra");
        String palabra = sc.nextLine();
        int contador = 0;
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == 'a' || palabra.charAt(i) == 'e' || palabra.charAt(i) == 'i'
                    || palabra.charAt(i) == 'o' || palabra.charAt(i) == 'u') {
                contador++;
            }
        }
        System.out.println("La palabra tiene " + contador + " vocales");
        sc.close();
    }
}
