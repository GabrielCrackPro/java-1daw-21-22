import java.util.Scanner;

public class TacharTexto {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce un texto: ");
    String texto = sc.nextLine();
    System.out.print("Introduce el simbolo: ");
    String simbolo = sc.nextLine();
    System.out.print("Introduce la letra a tachar: ");
    String letra = sc.nextLine();
    System.out.println(tachar(texto, simbolo, letra));
    sc.close();
  }

  public static String tachar(String texto, String simbolo, String letra) {
    if (simbolo == null || simbolo.length() != 1) {
      simbolo = "-";
    }
    texto = texto.replaceAll(letra, simbolo);
    return texto;
  }
}
