public class Calculadora {

  private Suelo suelo;
  private Alfombra alfombra;

  Calculadora() {} // constructor por defecto

  Calculadora(Suelo suelo, Alfombra alfombra) {
    this.suelo = suelo;
    this.alfombra = alfombra;
  } // constructor con parametros

  public double getCosteTotal() {
    return suelo.getArea() * alfombra.getCoste();
  }
}
