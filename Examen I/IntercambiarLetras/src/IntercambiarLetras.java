import java.util.Scanner;

public class IntercambiarLetras {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Ingrese una palabra: ");
    String palabra = sc.nextLine();
    System.out.print("Ingresa la letra a intercambiar: ");
    String letra = sc.nextLine();
    System.out.print("Ingresa la letra por la que quieres intercambiar: ");
    String letra2 = sc.nextLine();
    System.out.println(intercambiarLetras(letra, letra2, palabra));

    sc.close();
  }

  public static String intercambiarLetras(
    String letraA,
    String letraB,
    String palabra
  ) {
    String palabraModificada = "";
    for (int i = 0; i < palabra.length(); i++) {
      if (palabra.charAt(i) == letraA.charAt(0)) {
        palabraModificada += letraB;
      } else if (palabra.charAt(i) == letraB.charAt(0)) {
        palabraModificada += letraA;
      } else {
        palabraModificada += palabra.charAt(i);
      }
    }
    return palabraModificada;
  }
}
