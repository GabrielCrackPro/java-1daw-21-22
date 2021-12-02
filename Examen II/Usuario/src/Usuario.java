public class Usuario {

  private String nombre, contraseña;
  private static int tamañoMinimo;

  Usuario() {} // Constructor vacío

  Usuario(String nombre, String contraseña) {
    this.nombre = nombre;
    this.contraseña = contraseña;
  } // Constructor con parámetros

  Usuario(String nombre) {
    this.nombre = nombre;
    this.contraseña = "123456";
  }

  // Setters y Getters
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getNombre() {
    return this.nombre;
  }

  public void setContraseña(String contraseña) {
    this.contraseña = contraseña;
  }

  public static void setTamañoMinimo(int tamañoMinimo) {
    Usuario.tamañoMinimo = tamañoMinimo;
  }

  public String cadenaContrasenya() {
    String contraseñaDevolver = "";
    for (int i = 0; i < contraseña.length(); i++) {
      contraseñaDevolver += "*";
    }
    return contraseñaDevolver;
  }

  public boolean contraseñaEsValida() {
    if (contraseña.length() >= tamañoMinimo) {
      return true;
    } else {
      return false;
    }
  }
}
