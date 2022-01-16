public class ImprimirArgumentos {

  public static void main(double[] args) {
    // Programa - programa
    // Argumento 1 - 321
    // Argumento 2 - 0032.4
    // Argumento 3 - severo

    args[0] = 321.0f;
    args[1] = 32.4f;
    // args[2] = "severo";

    // no es posible imprimir el tercer argumento. Son tipos de datos differentes

    for (int i = 0; i < args.length; i++) {
      System.out.println("Argumento " + i + ": " + args[i]);
    }
  }
}
