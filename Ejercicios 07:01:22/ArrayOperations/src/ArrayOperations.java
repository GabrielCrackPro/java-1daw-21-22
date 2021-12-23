import java.util.Arrays;

/**
 * Esta clase contiene métodos para trabajar con arrays.
 *
 * @author Gabriel Vargas Reyes
 * @version 1.0
 */
public class ArrayOperations {

  /**
   * Imprime los valores de un array dentro de []
   *
   * @param array Array a imprimir
   * @return array
   */
  public static int[] print(int[] array) {
    System.out.print("[");
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }
    System.out.println("]");
    System.out.println();
    return array;
  }

  /**
   * Devuelve el array en orden inverso
   * @param array Array a invertir
   * @return reversed
   */
  public static int[] reverse(int[] array) {
    int[] reversed = new int[array.length];
    for (int i = 0; i < array.length; i++) {
      reversed[i] = array[array.length - 1 - i];
    }
    return reversed;
  }

  /**
   * Devuelve el valor máximo de un array.
   *
   * @param array Array a analizar
   * @return Valor máximo.
   */
  public static int max(int[] array) {
    int max = array[0];
    for (int i = 0; i < array.length; i++) {
      if (array[i] > max) {
        max = array[i];
      }
    }
    return max;
  }

  /**
   * Devuelve el valor mínimo de un array.
   *
   * @param array Array a analizar
   * @return Valor mínimo.
   */
  public static int min(int[] array) {
    int min = array[0];
    for (int i = 0; i < array.length; i++) {
      if (array[i] < min) {
        min = array[i];
      }
    }
    return min;
  }

  /**
   * Devuelve la suma de todos los valores de un array.
   *
   * @param array Array a analizar
   * @return Suma de todos los valores.
   */
  public static int sum(int[] array) {
    int sum = 0;
    for (int i = 0; i < array.length; i++) {
      sum += array[i];
    }
    return sum;
  }

  /**
   * Devuelve si dos arrays son iguales.
   *
   * @param array Array a analizar
   * @return true si son iguales, false en caso contrario.
   */
  public static boolean equals(int[] array1, int[] array2) {
    if (array1.length != array2.length) {
      return false;
    }
    for (int i = 0; i < array1.length; i++) {
      if (array1[i] != array2[i]) {
        return false;
      }
    }
    return true;
  }

  /**
   * Devuelve si dos arrays son iguales.
   *
   * @param array Array a analizar
   * @return true si son iguales, false en caso contrario.
   */
  public static boolean equalsWithOrder(int[] array1, int[] array2) {
    if (array1.length != array2.length) {
      return false;
    }
    for (int i = 0; i < array1.length; i++) {
      if (array1[i] != array2[i]) {
        return false;
      }
    }
    return true;
  }

  /**
   * Devuelve si un array está contenido en otro.
   *
   * @param array Array a analizar
   * @return true si está contenido, false en caso contrario.
   */
  public static boolean IsOn(int[] src, int[] dst) {
    boolean isOn = false;
    Arrays.sort(src);
    Arrays.sort(dst);
    for (int i = 0; i < src.length; i++) {
      for (int j = 0; j < dst.length; j++) {
        if (src[i] == dst[j]) {
          isOn = true;
        }
      }
    }
    return isOn;
  }

  /**
   * Devuelve un array copiado.
   *
   * @param array Array de enteros.
   * @param copyArray Array de enteros.
   * @return Array copiado.
   */
  public static int[] copy(int[] src, int[] dst) {
    for (int i = 0; i < src.length; i++) {
      dst[i] = src[i];
    }
    return dst;
  }

  /**
   * Elimina los valores impares de un array.
   *
   * @param array Array a analizar
   * @return array sin impares
   */
  public static int[] removeOddNumbers(int[] array) {
    int[] newArray = new int[array.length];
    int j = 0;
    for (int i = 0; i < array.length; i++) {
      if (array[i] % 2 == 0) {
        newArray[j] = array[i];
        j++;
      } else {
        newArray[j] = 0;
        j++;
      }
    }
    return newArray;
  }

  /**
   * Imprime los valores de un array en un rango determinado.
   *
   * @param array Array a imprimir
   * @param start Inicio del rango
   * @param end Fin del rango
   */
  public static void printRange(int[] array, int inicio, int fin) {
    System.out.print("[");
    for (int i = inicio; i < fin; i++) {
      System.out.print(array[i] + " ");
    }
    System.out.println("]");
    System.out.println();
  }

  /**
   * Devuelve un array ordenado.
   *
   * @param array Array a ordenar
   * @return Array ordenado.
   */
  public static int[] sort(int[] array) {
    int[] sorted = new int[array.length];
    for (int i = 0; i < array.length; i++) {
      sorted[i] = array[i];
    }
    Arrays.sort(sorted);
    return sorted;
  }

  /**
   * Elimina los elementos de un solo digito en un array.
   * @param array
   * @return newArray
   */
  public static int[] deleteOneDigitNumbers(int[] array) {
    int[] newArray = new int[array.length];
    int j = 0;
    for (int i = 0; i < array.length; i++) {
      if (array[i] > 9) {
        newArray[j] = array[i];
        j++;
      } else {
        newArray[j] = 0;
        j++;
      }
    }
    return newArray;
  }

  /**
   * Cuenta cuantas veces se repite un numero en un array.
   * @param array
   * @param number
   * @return count
   */
  public static int count(int[] array, int number) {
    int count = 0;
    for (int i = 0; i < array.length; i++) {
      if (array[i] == number) {
        count++;
      }
    }
    return count;
  }
}
