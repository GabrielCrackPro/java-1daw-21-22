import java.util.Scanner;

public class Condicionales1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Eres propietario de la máquina? (true/false) ");
        boolean isOwner = sc.nextBoolean();
        if (isOwner) {
            System.out.println("Bienvenido al sistema");
        }
        sc.close();
    }
}
