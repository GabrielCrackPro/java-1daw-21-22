public class ArrayStrings {

  public static void main(String[] args) {
    String[] array = new String[5];
    array[0] = "Pera";
    array[1] = "Manzana";
    array[array.length - 1] = "Naranja";

    for (int i = 0; i < array.length; i++) {
      if (array[i] != null) {
        System.out.println("Celda " + i + ": " + array[i]);
      } else {
        System.out.println("Celda " + i + ": Vacía");
      }
    }
  }
}
