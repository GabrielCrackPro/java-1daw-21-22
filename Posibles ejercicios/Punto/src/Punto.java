import java.util.Scanner;

public class Punto {
    private double x;
    private double y;
    private static int contadorPuntos;

    public Punto() {
    } // Constructor vacio

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
        contadorPuntos++;
    } // Constructor con dos parametros

    public Punto(Punto p) {
        this.x = p.x;
        this.y = p.y;
        contadorPuntos++;
    } // Constructor copia

    public double getX() {
        return x;
    } // Getter de x

    public double getY() {
        return y;
    } // Getter de y

    public void setX(double x) {
        this.x = x;
    } // Setter de x

    public void setY(double y) {
        this.y = y;
    } // Setter de y

    public static double Distancia(Punto p1, Punto p2) {
        return Math.sqrt(Math.pow(p2.x - p1.x, 2) + Math.pow(p2.y - p1.y, 2));
    } // Distancia entre dos puntos

    public double Distancia(Punto p) {
        return Math.sqrt(Math.pow(p.x - this.x, 2) + Math.pow(p.y - this.y, 2));
    } // Distancia entre un punto y otro

    public static int AreaTriangulo(Punto p1, Punto p2, Punto p3) {
        double a = Distancia(p1, p2);
        double b = Distancia(p2, p3);
        double c = Distancia(p3, p1);
        double s = (a + b + c) / 2;
        return (int) Math.sqrt(s * (s - a) * (s - b) * (s - c));
    } // Area del triangulo formado por los tres puntos

    public static void ImprimePunto(Punto p) {
        System.out.println("(" + p.x + "," + p.y + ")");
    } // Imprime un punto

    public String toString() {
        return "(" + x + "," + y + ")";
    }

    public static String ImprimeArea(Punto p1, Punto p2, Punto p3) {
        double a = Distancia(p1, p2);
        double b = Distancia(p2, p3);
        double c = Distancia(p3, p1);
        double s = (a + b + c) / 2;
        return "El resultado es: " + Math.sqrt(s * (s - a) * (s - b) * (s - c));
    } // Imprime el area del triangulo formado por los tres puntos

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Punto p1, p2, p3, p4, p5, p6;

        p1 = new Punto(3, 4);
        ImprimePunto(p1);

        p2 = new Punto();
        p2.setX(7);
        p2.setY(4);
        ImprimePunto(p2);

        p3 = new Punto(p1);
        p3.setX(3);
        p3.setY(7);
        p3.toString();

        // Distancia p1-p2
        System.out.println("Distancia entre p1 y p2: " + Distancia(p1, p2));

        // Crear p4
        p4 = new Punto();
        System.out.print("Introduce la x del punto 4: ");
        p4.setX(sc.nextDouble());
        System.out.print("Introduce la y del punto 4: ");
        p4.setY(sc.nextDouble());

        // Crear p5
        p5 = new Punto();
        System.out.print("Introduce la x del punto 5: ");
        p5.setX(sc.nextDouble());
        System.out.print("Introduce la y del punto 5: ");
        p5.setY(sc.nextDouble());

        // Crear p6
        p6 = new Punto();
        System.out.print("Introduce la x del punto 6: ");
        p6.setX(sc.nextDouble());
        System.out.print("Introduce la y del punto 6: ");

        // Area del triangulo formado por los tres puntos
        System.out.println("El area del triangulo formado por los tres puntos es: " + AreaTriangulo(p4, p5, p6));

        // Total de puntos creados
        System.out.println("Total de puntos creados: " + contadorPuntos);

        sc.close();
    }
}
