public class Planeta {

  private String nombreIngles, nombreEspañol;
  private int distancia;

  Planeta() {} // Constructor por defecto

  Planeta(String nombreIngles, String nombreEspañol, int distancia) {
    this.nombreIngles = nombreIngles;
    this.nombreEspañol = nombreEspañol;
    this.distancia = distancia;
  } // Constructor con parámetros

  Planeta(String nombreIngles, String nombreEspañol) {
    this.nombreIngles = nombreIngles;
    this.nombreEspañol = nombreEspañol;
  } // Constructor con parámetros

  Planeta(String nombre, int distancia) {
    this.nombreIngles = nombre;
    this.distancia = distancia;
  } // Constructor con parámetros

  // Setters y getters
  public void setNombreIngles(String nombreIngles) {
    this.nombreIngles = nombreIngles;
  }

  public void setNombreEspañol(String nombreEspañol) {
    this.nombreEspañol = nombreEspañol;
  }

  public String getNombreIngles() {
    return nombreIngles;
  }

  public String getNombreEspañol() {
    return nombreEspañol;
  }

  public String getNombre() {
    if (nombreEspañol != null) {
      return nombreEspañol;
    } else {
      return nombreIngles;
    }
  }

  public void setDistancia(int distancia) {
    this.distancia = distancia;
  }

  public int getDistancia() {
    return distancia;
  }

  // Metodos
  public boolean esInterior() {
    if (this.distancia < 400) {
      return true;
    } else {
      return false;
    }
  }
}
