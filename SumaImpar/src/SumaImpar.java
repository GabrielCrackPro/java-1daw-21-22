public class SumaImpar {
    public static final String green = "\u001B[32m";
    public static final String reset = "\u001B[0m";

    public static void main(String[] args) {
        int n = 0, suma = 0;
        while (n <= 20) {
            if (n % 2 != 0) {
                suma += n;
            }
            n++;
        }
        System.out.println(green + "La suma de los primeros " + (n - 1) + " números impares es: " + suma + reset);
    }
}
