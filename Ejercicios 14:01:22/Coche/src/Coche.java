public class Coche {

  private int numBastidor;
  private String modelo;
  private String color;
  private boolean metalizado;
  private tipoCoche tipo;

  public enum tipoCoche {
    DEPORTIVO,
    MINI,
    UTILITARIO,
    FAMILIAR,
  }

  public enum modoSeguro {
    TERCEROS,
    TODO_RIESGO,
  }

  public Coche() {} // Constructor por defecto

  public Coche(
    int numBastidor,
    String modelo,
    String color,
    boolean metalizado,
    tipoCoche tipo
  ) {
    this.numBastidor = numBastidor;
    this.modelo = modelo;
    this.color = color;
    this.metalizado = metalizado;
    this.tipo = tipo;
  } // Constructor con parámetros

  public void setNumBastidor(int numBastidor) {
    this.numBastidor = numBastidor;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public void setMetalizado(boolean metalizado) {
    this.metalizado = metalizado;
  }

  public void setTipoCoche(tipoCoche tipoCoche) {
    this.tipo = tipoCoche;
  }

  public int getNumBastidor() {
    return numBastidor;
  }

  public String getModelo() {
    return modelo;
  }

  public String getColor() {
    return color;
  }

  public boolean getMetalizado() {
    return metalizado;
  }

  public tipoCoche getTipoCoche() {
    return tipo;
  }

  public void mostrar() {
    System.out.println("Numero de bastidor: " + numBastidor);
    System.out.println("Modelo: " + modelo);
    System.out.println("Color: " + color);
    System.out.println("Metalizado: " + metalizado);
    System.out.println("Tipo de coche: " + tipo);
    System.out.println();
  }

  public void copiar(int cantidadCopias) {
    Coche[] copias = new Coche[cantidadCopias];

    for (int i = 0; i < cantidadCopias; i++) {
      copias[i] = new Coche(numBastidor, modelo, color, metalizado, tipo);
      copias[i].numBastidor += i + 1;
    }
    System.out.println("\nSe han creado " + cantidadCopias + " copias");

    for (int i = 0; i < cantidadCopias; i++) {
      System.out.println("Copia " + (i + 1));
      copias[i].mostrar();
    }
  }
}
