public class Suelo {

  private double ancho, largo;

  Suelo() {} // constructor por defecto

  Suelo(double ancho, double largo) {
    if (ancho < 0) {
      this.ancho = 0;
    } else {
      this.ancho = ancho;
    }
    if (largo < 0) {
      this.largo = 0;
    } else {
      this.largo = largo;
    }
  } // constructor con parametros

  // Setters y Getters
  public void setAncho(double ancho) {
    this.ancho = ancho;
  }

  public void setLargo(double largo) {
    this.largo = largo;
  }

  public double getAncho() {
    return ancho;
  }

  public double getLargo() {
    return largo;
  }

  // Metodos
  public double getArea() {
    return ancho * largo;
  }
}
