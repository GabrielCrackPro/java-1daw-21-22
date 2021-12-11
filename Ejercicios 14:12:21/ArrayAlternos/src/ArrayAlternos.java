import java.util.Scanner;

public class ArrayAlternos {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] tablaA = new int[10];
    int[] tablaB = new int[10];
    int[] tablaC = new int[20];

    System.out.println("Introduce los valores de la tabla A");
    System.out.println();
    for (int i = 0; i < tablaA.length; i++) {
      System.out.print("Introduce el valor de la posición " + i + ": ");
      tablaA[i] = sc.nextInt();
    }
    System.out.println();
    System.out.println("Introduce los valores de la tabla B");
    for (int i = 0; i < tablaB.length; i++) {
      System.out.print("Introduce el valor de la posición " + i + ": ");
      tablaB[i] = sc.nextInt();
    }
    System.out.println();

    for (int i = 0; i < tablaC.length; i++) {
      if (i % 2 == 0) {
        tablaC[i] = tablaA[i / 2];
      } else {
        tablaC[i] = tablaB[i / 2];
      }
    }

    System.out.println("La tabla C es: ");
    for (int i = 0; i < tablaC.length; i++) {
      System.out.print(tablaC[i] + " ");
    }

    sc.close();
  }
}
