import java.util.Scanner;

public class FlechaAsteriscos {

  public static String imprimirFlecha(int n) {
    if (n >= 5 && n <= 10) {
      // Dibujar la primera linea
      for (int i = 0; i < n; i++) {
        System.out.print("*");
      }
      System.out.println();
      // Dibujar las líneas intermedias
      for (int i = 0; i < n - 2; i++) {
        System.out.print("  *");
        System.out.println();
      }
      // Dibujar la última línea
      for (int i = 0; i < n; i++) {
        System.out.print("*");
      }
    } else {
      System.out.println("La altura introducida no es válida");
    }
    return "";
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce la altura de la flecha: ");
    int n = sc.nextInt();
    imprimirFlecha(n);
    sc.close();
  }
}
