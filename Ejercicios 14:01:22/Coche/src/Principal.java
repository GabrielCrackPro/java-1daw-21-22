import java.util.Scanner;

public class Principal {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Coche primerCoche = new Coche();

    primerCoche.setNumBastidor(100);
    primerCoche.setModelo("Renault");
    primerCoche.setColor("Azul");
    primerCoche.setMetalizado(true);
    primerCoche.setTipoCoche(Coche.tipoCoche.FAMILIAR);

    System.out.println("El coche original es:\n");
    primerCoche.mostrar();

    System.out.print("Introduce el numero de copias a realizar: ");
    int numCopias = sc.nextInt();
    primerCoche.copiar(numCopias);

    sc.close();
  }
}
