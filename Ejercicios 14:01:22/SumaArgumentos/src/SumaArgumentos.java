public class SumaArgumentos {

  public static void main(int[] args) {
    int suma = 0;

    args[0] = 15;
    args[1] = 79;
    args[2] = 34;
    args[3] = 68;
    args[4] = -20;

    for (int i = 0; i < args.length; i++) {
      suma += args[i];
    }
    System.out.println("La suma de los argumentos es: " + suma);
  }
}
