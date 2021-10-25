import java.util.Scanner;

public class TablaSimbolos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el ancho de la tabla: ");
        int ancho = sc.nextInt();
        System.out.print("Introduce el alto de la tabla: ");
        int alto = sc.nextInt();
        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < ancho; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
        sc.close();
    }
}
