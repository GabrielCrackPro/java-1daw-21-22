public class Main {

  public static void main(String[] args) {
    Planeta uno = new Planeta("MARTE", "MARS", 227);
    Planeta dos = new Planeta("JUPITER", 778);

    System.out.println(
      uno.esInterior()
        ? uno.getNombre() + "es interior"
        : uno.getNombre() + "es exterior"
    );
    System.out.println(
      uno.getNombre() +
      "is" +
      uno.getDistancia() +
      "million kilometres far from the sun"
    );
  }
}
