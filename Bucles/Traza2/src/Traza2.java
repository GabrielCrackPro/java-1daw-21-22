public class Traza2 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            // Primero el contador (i) vale 1
            // Entra en el bucle
            // Como i es distinto de 4 imprime el valor de j (1)
            // Asi hasta que i sea igual a 4
            for (int j = 1; j < i; j++) {
                if (i == 4)
                    break;
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
