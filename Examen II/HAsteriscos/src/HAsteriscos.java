import java.util.Scanner;

public class HAsteriscos {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Introduce la altura de la H: ");
    int altura = sc.nextInt();

    if (altura >= 5 && altura <= 10 && altura % 2 != 0) {
      for (int j = 0; j < altura; j++) {
        if ((altura - 1) / 2 == j) {
          for (int k = 0; k < altura; k++) {
            System.out.print("*");
          }
          System.out.println("");
        } else {
          for (int i = 0; i < altura; i++) {
            if (i == 0) {
              System.out.print("*");
            } else if (i == (altura - 1)) {
              System.out.print("*");
            } else {
              System.out.print(" ");
            }
          }
          System.out.println("");
        }
      }
      System.exit(0); // Salir del programa
    } else {
      System.out.println("La altura de la H no es correcta");
      System.out.println(
        "La altura de la H debe ser un número par mayor que 5 y menor que 10"
      );
      System.exit(1);
      // Salir del programa con código de error ya que no se cumple la condición
    }
    sc.close();
  }
}
