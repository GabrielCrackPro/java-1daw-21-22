public class Tabla10 {
    // Colores
    public static final String green = "\u001B[32m";
    public static final String reset = "\u001B[0m";

    public static void main(String[] args) {
        int n = 10, i = 1;
        while (i <= 10) {
            System.out.println(green + n + " x " + i + " = " + n * i + reset);
            i++;
        }
    }
}
