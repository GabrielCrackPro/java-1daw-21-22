public class Main {

  public static void main(String[] args) {
    Usuario primero = new Usuario("ana", "pass");
    Usuario otro = new Usuario("bea");
    System.out.println(
      "La contraseña de " + otro.getNombre() + " es " + otro.cadenaContrasenya()
    );

    if (primero.contraseñaEsValida()) {
      System.out.println("La contraseña de Ana es válida ");
    } else {
      System.out.println("La contraseña de Ana es muy corta");
    }

    Usuario.setTamañoMinimo(3);

    if (primero.contraseñaEsValida()) {
      System.out.println("La contraseña de Ana es válida");
    } else {
      System.out.println("La contraseña de Ana es muy corta");
    }
  }
}
