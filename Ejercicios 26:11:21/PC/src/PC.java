import java.util.Scanner;

public class PC {

  private String tipoCpu, tipoRam, tipoDisco, tipoMonitor, tipoTeclado, tipoMouse, estado;

  public final String rojo = "\033[31m";
  public final String reset = "\033[0m";
  public final String verde = "\033[32m";
  public final String amarillo = "\033[33m";

  // Colores
  // Pausar el programa
  public static void pausar(int milisegundos) {
    try {
      Thread.sleep(milisegundos);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  PC() {} //Constructor por defecto

  PC(
    String tipoCpu,
    String tipoRam,
    String tipoDisco,
    String tipoMonitor,
    String tipoTeclado,
    String tipoMouse,
    String estado
  ) {
    this.tipoCpu = tipoCpu;
    this.tipoRam = tipoRam;
    this.tipoDisco = tipoDisco;
    this.tipoMonitor = tipoMonitor;
    this.tipoTeclado = tipoTeclado;
    this.tipoMouse = tipoMouse;
    this.estado = estado;
  } //Constructor con parametros

  // Getters y Setters
  public void setTipoCpu(String tipoCpu) {
    this.tipoCpu = tipoCpu;
  }

  public String getTipoCpu() {
    return tipoCpu;
  }

  public void setTipoRam(String tipoRam) {
    this.tipoRam = tipoRam;
  }

  public String getTipoRam() {
    return tipoRam;
  }

  public void setTipoDisco(String tipoDisco) {
    this.tipoDisco = tipoDisco;
  }

  public String getTipoDisco() {
    return tipoDisco;
  }

  public void setTipoMonitor(String tipoMonitor) {
    this.tipoMonitor = tipoMonitor;
  }

  public String getTipoMonitor() {
    return tipoMonitor;
  }

  public void setTipoTeclado(String tipoTeclado) {
    this.tipoTeclado = tipoTeclado;
  }

  public String getTipoTeclado() {
    return tipoTeclado;
  }

  public void setTipoMouse(String tipoMouse) {
    this.tipoMouse = tipoMouse;
  }

  public String getTipoMouse() {
    return tipoMouse;
  }

  public void setEstado(String estado) {
    this.estado = estado;
  }

  public String getEstado() {
    return estado;
  }

  // Metodos
  public boolean montar() {
    if (
      this.getTipoCpu() != "" &&
      this.getTipoRam() != "" &&
      this.getTipoDisco() != "" &&
      this.getTipoMonitor() != "" &&
      this.getTipoTeclado() != "" &&
      this.getTipoMouse() != ""
    ) {
      System.out.println(verde);
      System.out.println("[ i ] Se ha montado la CPU: " + this.getTipoCpu());
      pausar(1000);
      System.out.println("[ i ] Se ha montado la RAM: " + this.getTipoRam());
      pausar(1000);
      System.out.println(
        "[ i ] Se ha montado el disco: " + this.getTipoDisco()
      );
      pausar(1000);
      System.out.println(
        "[ i ] Se ha montado el monitor: " + this.getTipoMonitor()
      );
      pausar(1000);
      System.out.println(
        "[ i ] Se ha montado el teclado: " + this.getTipoTeclado()
      );
      pausar(1000);
      System.out.println(
        "[ i ] Se ha montado el mouse: " + this.getTipoMouse()
      );
      pausar(1000);
      System.out.println(reset);
      System.out.println();
      return true;
    } else {
      System.out.println(rojo);
      System.out.println("[ ! ] No se pudo montar el PC");
      System.out.println("[ i ] Faltan los siguientes componentes:");
      if (this.getTipoCpu() == "") {
        System.out.println("CPU");
      }
      if (this.getTipoRam() == "") {
        System.out.println("RAM");
      }
      if (this.getTipoDisco() == "") {
        System.out.println("Disco");
      }
      if (this.getTipoMonitor() == "") {
        System.out.println("Monitor");
      }
      if (this.getTipoTeclado() == "") {
        System.out.println("Teclado");
      }
      if (this.getTipoMouse() == "") {
        System.out.println("Mouse");
      }
      System.out.println(reset);
      System.out.println();
      return false;
    }
  }

  public boolean desmontar() {
    if (this.getEstado() == "Apagado") {
      System.out.println(verde);
      System.out.println("[ i ] Se ha desmontado la CPU: " + this.getTipoCpu());
      pausar(1000);
      System.out.println("[ i ] Se ha desmontado la RAM: " + this.getTipoRam());
      pausar(1000);
      System.out.println(
        "[ i ] Se ha desmontado el disco: " + this.getTipoDisco()
      );
      pausar(1000);
      System.out.println(
        "[ i ] Se ha desmontado el monitor: " + this.getTipoMonitor()
      );
      pausar(1000);
      System.out.println(
        "[ i ] Se ha desmontado el teclado: " + this.getTipoTeclado()
      );
      pausar(1000);
      System.out.println(
        "[ i ]Se ha desmontado el mouse: " + this.getTipoMouse()
      );
      System.out.println(reset);
      System.out.println();
      return true;
    } else {
      System.out.println(rojo);
      System.out.println("[ ! ] No se pudo desmontar el PC");
      System.out.println("[ ! ] Primero debe estar apagado");
      System.out.println(reset);
      return false;
    }
  }

  public boolean encender() {
    System.out.println(verde + "[ i ] Encendiendo..." + reset);
    pausar(1000);
    if (this.getEstado() == "Apagado") {
      this.setEstado("Encendido");
      System.out.println(verde);
      pausar(1000);
      System.out.println("[ i ] Se ha encendido el PC");
      System.out.println(reset);
      return true;
    } else {
      System.out.println(rojo);
      System.out.println("[ ! ] No se pudo encender el PC");
      System.out.println(reset);
      return false;
    }
  }

  public boolean apagar() {
    System.out.println(verde + "[ i ] Apagando..." + reset);
    pausar(1000);
    if (this.getEstado() == "Encendido") {
      System.out.println(verde);
      System.out.println("[ i ] Se ha apagado el PC");
      this.setEstado("Apagado");
      System.out.println(reset);
      return true;
    } else {
      System.out.println(rojo);
      System.out.println("[ ! ] No se pudo apagar el PC");
      System.out.println(reset);
      return false;
    }
  }

  public boolean abrir() {
    if (this.getEstado() != "Encendido") {
      System.out.println(verde);
      System.out.println("[ i ] Abriendo...");
      pausar(1000);
      System.out.println("[ i ] Se ha abierto el PC");
      System.out.println("[ i ] Los componentes son:");
      System.out.println("[ i ] CPU: " + this.getTipoCpu());
      System.out.println("[ i ] RAM: " + this.getTipoRam());
      System.out.println("[ i ] Disco: " + this.getTipoDisco());
      System.out.println("[ i ] Monitor: " + this.getTipoMonitor());
      System.out.println("[ i ] Teclado: " + this.getTipoTeclado());
      System.out.println("[ i ] Mouse: " + this.getTipoMouse());
      System.out.println();
      pausar(1000);
      System.out.println("[ i ] Se ha cerrado el PC");
      System.out.println(reset);
      return true;
    } else {
      System.out.println(rojo);
      System.out.println("[ ! ] No se pudo abrir el PC");
      System.out.println(reset);
      return false;
    }
  }

  public void menu() {
    Scanner sc = new Scanner(System.in);
    System.out.println(amarillo);
    System.out.println("[ ? ] Que quieres hacer ahora");
    System.out.println();
    System.out.println("[ 1 ] Encender");
    System.out.println("[ 2 ] Apagar");
    System.out.println("[ 3 ] Abrir");
    System.out.println("[ 4 ] Salir");
    System.out.print("[ ? ] Opcion: ");
    int opcion = sc.nextInt();
    System.out.println(reset);
    switch (opcion) {
      case 1:
        this.encender();
        this.menu();
        break;
      case 2:
        this.apagar();
        this.menu();
        break;
      case 3:
        this.abrir();
        this.menu();
        break;
      case 4:
        System.out.println(verde);
        System.out.println("[ i ] Saliendo...");
        System.out.println(reset);
        break;
    }
    sc.close();
  }
}
