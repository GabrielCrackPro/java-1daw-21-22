import java.util.Scanner;

public class MetodoContarPalabras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una frase: ");
        String frase = sc.nextLine();
        ContarPalabras(frase);
        sc.close();
    }

    public static void ContarPalabras(String frase) {
        int contador = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == ' ') {
                contador++;
            }
        }
        System.out.println("La frase tiene: " + (contador + 1) + " palabras");
    }
}
