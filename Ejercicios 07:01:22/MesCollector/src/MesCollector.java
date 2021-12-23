public class MesCollector {

  private int mes, diaMes, anyo;
  private int[] temperatura;

  MesCollector() {} // Constructor por defecto

  MesCollector(int mes, int anyo) {
    this.mes = mes;
    this.anyo = anyo;
    this.temperatura = new int[32];

    switch (mes) {
      case 1:
      case 3:
      case 5:
      case 7:
      case 8:
      case 10:
      case 12:
        this.diaMes = 31;
        break;
      case 4:
      case 6:
      case 9:
      case 11:
        this.diaMes = 30;
        break;
      case 2:
        this.diaMes = 28;
        break;
      default:
        this.diaMes = 0;
        break;
    }
  } // Constructor con parámetros

  public int getTemperatura(int dia) {
    if (dia > 0 && dia <= this.diaMes) {
      return temperatura[dia - 1];
    } else {
      return -1;
    }
  }

  public void setTemperatura(int dia, int temperatura) {
    if (dia > 0 && dia <= this.diaMes) {
      this.temperatura[dia - 1] = temperatura;
    }
  }

  public int getDiaMes() {
    return this.diaMes;
  }

  @Override
  public String toString() {
    /*
      Lo he hecho asi porque queria probar StringBuilder 
      pero se podia haber hecho de la otra forma
    */

    StringBuilder sb = new StringBuilder();
    sb.append("Mes: " + this.mes + "\n");
    sb.append("Año: " + this.anyo + "\n");
    sb.append("Días: " + this.diaMes + "\n");
    sb.append("Temperaturas: ");
    sb.append("\n");
    for (int i = 0; i < this.diaMes; i++) {
      sb.append("Dia " + (i + 1) + ": " + this.temperatura[i] + "ºC\n");
    }
    return sb.toString();
  }
}
