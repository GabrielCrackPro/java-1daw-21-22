public class Alfombra {

  private double coste;

  Alfombra() {} // constructor por defecto

  Alfombra(double coste) {
    if (coste < 0) {
      this.coste = 0;
    } else {
      this.coste = coste;
    }
  }

  // Setters y Getters
  public void setCoste(double coste) {
    if (coste < 0) {
      this.coste = 0;
    } else {
      this.coste = coste;
    }
  }

  public double getCoste() {
    return coste;
  }
}
