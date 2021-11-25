import java.util.Scanner;

public class Main {

  public static final String reset = "\033[0m";
  public static final String amarillo = "\033[33m";

  // Colores

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    PC pc = new PC();
    System.out.println(amarillo);
    System.out.print("[ ? ] Introduce el tipo de CPU: ");
    String tipoCPU = sc.nextLine();
    pc.setTipoCpu(tipoCPU);
    System.out.print("[ ? ] Introduce el tipo de RAM: ");
    String tipoRAM = sc.nextLine();
    pc.setTipoRam(tipoRAM);
    System.out.print("[ ? ] Introduce el tipo de disco: ");
    String tipoDisco = sc.nextLine();
    pc.setTipoDisco(tipoDisco);
    System.out.print("[ ? ] Introduce el tipo de monitor: ");
    String tipoMonitor = sc.nextLine();
    pc.setTipoMonitor(tipoMonitor);
    System.out.print("[ ? ] Introduce el tipo de teclado: ");
    String tipoTeclado = sc.nextLine();
    pc.setTipoTeclado(tipoTeclado);
    System.out.print("[ ? ] Introduce el tipo de mouse: ");
    String tipoMouse = sc.nextLine();
    pc.setTipoMouse(tipoMouse);
    pc.setEstado("Apagado");
    System.out.println(reset);
    System.out.println();

    pc.montar();
    pc.menu();

    sc.close();
  }
}
