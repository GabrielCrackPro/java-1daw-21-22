public class Main {

  public static void main(String[] args) {
    Alfombra alfombra1 = new Alfombra(3.5);
    Suelo suelo1 = new Suelo(2.75, 4.0);

    Calculadora calculadora = new Calculadora(suelo1, alfombra1);
    System.out.println("total= " + calculadora.getCosteTotal());

    alfombra1 = new Alfombra(1.5);
    suelo1 = new Suelo(5.4, 4.5);

    calculadora = new Calculadora(suelo1, alfombra1);
    System.out.println("total= " + calculadora.getCosteTotal());

    Alfombra alfombra2 = new Alfombra(-1.0);
    Suelo suelo2 = new Suelo(2.0, 4.0);
    calculadora = new Calculadora(suelo2, alfombra2);
    System.out.println("Prueba 1:");
    System.out.println("total= " + calculadora.getCosteTotal());
  }
}
