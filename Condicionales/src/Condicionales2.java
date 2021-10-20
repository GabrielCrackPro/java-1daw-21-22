import java.util.Scanner;

public class Condicionales2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una nota: ");
        double nota = sc.nextDouble();
        if (nota < 0 || nota > 10) {
            System.out.println("Nota no válida");
        } else if (nota < 5) {
            System.out.println("Suspenso");
        } else if (nota >= 5 && nota < 6) {
            System.out.println("Bien");
        } else if (nota >= 6 && nota < 7) {
            System.out.println("Notable");
        } else if (nota >= 7 && nota < 9) {
            System.out.println("Sobresaliente");
        } else if (nota >= 9) {
            System.out.println("Matrícula de honor");
        }
        sc.close();
    }
}