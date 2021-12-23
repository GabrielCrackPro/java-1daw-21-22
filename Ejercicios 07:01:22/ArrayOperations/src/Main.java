public class Main extends ArrayOperations {

  public static void main(String[] args) {
    int[] array = { -2, 45, -29, 77, 56, 31 };
    int[] copyArray = new int[array.length];

    System.out.println("Valor máximo: " + max(array));

    System.out.print("Copia: ");
    print(copy(array, copyArray));

    System.out.print("Ordenado: ");
    int[] arrayOrdenado = sort(array);
    print(arrayOrdenado);

    System.out.print("Igual con orden: ");
    System.out.println(equalsWithOrder(array, arrayOrdenado));

    System.out.print("Igual sin orden: ");
    System.out.println(equals(array, copyArray));

    System.out.println("Sin números impares: ");
    print(removeOddNumbers(array));

    System.out.println("Suma total: ");
    System.out.print(sum(array));

    System.out.println("Mínimo: ");
    System.out.print(min(array));

    System.out.println("Imprimir rango: ");
    printRange(array, 1, 4);

    System.out.println("Array inverso: ");
    print(reverse(array));

    System.out.println("Array ordenado inverso: ");
    print(sort(reverse(array)));
  }
}
