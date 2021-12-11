import java.util.Scanner;

public class ArrayTester {

  public static void main(String[] args) {
    int[] array = leerEnteros();
    System.out.println();
    imprimirArray(array);
    transformarArray(array);
  }

  public static int[] leerEnteros() {
    Scanner sc = new Scanner(System.in);

    System.out.print("Introduce el tamaño del array: ");
    int tam = sc.nextInt();
    int[] array = new int[tam];
    for (int i = 0; i < array.length; i++) {
      System.out.print("Introduce el valor de la posición " + i + ": ");
      array[i] = sc.nextInt();
    }
    sc.close();
    return array;
  }

  public static void imprimirArray(int[] array) {
    for (int i = 0; i < array.length; i++) {
      System.out.println("El valor de la posición " + i + " es: " + array[i]);
    }
  }

  public static int[] transformarArray(int[] array) {
    int[] array2 = new int[array.length];
    for (int i = 0; i < array.length; i++) {
      if (array[i] % 2 != 0) {
        array2[i] = -1;
      } else {
        array2[i] = array[i];
      }
    }
    System.out.println("El array transformado es: ");
    for (int i = 0; i < array2.length; i++) {
      System.out.println("El valor de la posición " + i + " es: " + array2[i]);
    }
    return array2;
  }
}
