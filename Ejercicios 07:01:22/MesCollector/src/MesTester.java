import java.util.Scanner;

public class MesTester {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    MesCollector enero = new MesCollector(1, 2021);

    for (int i = 0; i < enero.getDiaMes(); i++) {
      System.out.print(
        "Introduce la temperatura del día " + (i + 1) + " (ºC): "
      );
      int temp = sc.nextInt();
      enero.setTemperatura(i + 1, temp);
    }
    System.out.println(enero.toString());

    sc.close();
  }
}
