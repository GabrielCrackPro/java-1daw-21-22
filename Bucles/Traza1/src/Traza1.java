public class Traza1 {
    public static void main(String[] args) {
        // Imprime 0 10 210 y 3210 sucesivamente
        for (int i = 0; i < 4; i++) {
            for (int j = i; j >= 0; j--)
                System.out.print(j);
            System.out.println();
        }
    }
}
