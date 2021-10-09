/*
Enunciado:

Escribe una clase Cuenta para representar una cuenta bancaria.
Los datos de la cuenta son: 
 - Nombre del cliente (String),
 - Número de cuenta (String), 
 - Tipo de interés (double)
 - Saldo (double).		
La clase contendrá los siguientes métodos:
 - Constructor por defecto
 - Constructor con todos los parámetros
 - Métodos setters/getters
 - Métodos ingreso y reintegro.
 - Método transferencia que permita pasar dinero de una cuenta a otra
En el main ejecutar las siguientes operaciones:
 - Crear una cuenta con el constructor vacio y meter los datos por teclado.
 - Crear una cuenta con el constructor con los parámetros ("Juan Ferrández Rubio", "12345678901234567890", 1.75, 300)
 - Se crea cuenta3 como copia de cuenta1
 - Mostrar los datos de cuenta1
 - Se realiza un ingreso en cuenta1
 - Mostrar el saldo de cuenta1 después del ingreso
 - Mostrar los datos de cuenta2
 - Mostrar los datos de cuenta3
 - Realizar una transferencia de 10€ desde cuenta3 a cuenta2
 - Mostrar el saldo de cuenta2
 - Mostrar el saldo de cuenta3
*/

import java.util.Scanner;

public class cuenta {
    /*
     * === USO DE COLORES === Para utilizar un color se debe concatenar el con el
     * texto al inicio de la cadena y al final para resetrarlo Por ejemplo:
     * System.out.println("\033[31m" + "Texto en rojo" + "\033[0m");
     */
    // Colores
    public static final String red = "\u001B[31m";
    public static final String green = "\u001B[32m";
    public static final String yellow = "\u001B[33m";
    public static final String blue = "\u001B[34m";
    public static final String reset = "\u001B[0m"; // volver al color inicial

    private String nombre;
    private String numero;
    private double interes;
    private double saldo;

    public cuenta() {
    }

    // Setters de la clase cuenta
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Metodo para mostrar los datos de la cuenta
    public String ver() {
        return green + "[ i ] El nombre de la cuenta es " + nombre + " el numero es " + numero + " el interes es "
                + interes + " el saldo es " + saldo + " € \n" + reset;
    }

    // Metodo para ingresar dinero a la cuenta
    public void ingreso(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad; // suma la cantidad a la cuenta
            System.out.println(
                    green + "[ i ] Se han ingresado " + cantidad + " € a la cuenta " + "#" + this.numero + reset);
        } else {
            System.out.println(red + "[ x ] No se puede ingresar una cantidad negativa" + reset);
        }
    }

    // Metodo para retirar dinero de la cuenta
    public void reintegro(double cantidad) {
        saldo -= cantidad; // resta la cantidad a la cuenta
    }

    // Metodo para transferir dinero de una cuenta a otra
    public void transferir(cuenta origen, cuenta destino, double cantidad) {
        if (cantidad > 0) {
            System.out.println(green + "[ i ] Transfiriendo " + cantidad + "€ de " + "#" + origen.numero + " a " + "#"
                    + destino.numero + "..." + reset);
            saldo -= cantidad;
            destino.saldo += cantidad;
            System.out.println(green + "[ i ] Transferencia realizada" + reset);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(blue + "[ ? ] Introduce el nombre de la cuenta: " + reset);
        String nombre = sc.nextLine();
        System.out.print(blue + "[ ? ] Introduce el numero de la cuenta: " + reset);
        String numero = sc.nextLine();
        System.out.print(blue + "[ ? ] Introduce el interes de la cuenta: " + reset);
        double interes = sc.nextDouble();
        System.out.print(blue + "[ ? ] Introduce el saldo de la cuenta: " + reset);
        double saldo = sc.nextDouble();
        cuenta cuenta1 = new cuenta();

        cuenta1.setNombre(nombre);
        cuenta1.setNumero(numero);
        cuenta1.setInteres(interes);
        cuenta1.setSaldo(saldo);
        cuenta1.ver();

        cuenta cuenta2 = new cuenta();
        cuenta2.setNombre("Juan Ferrández Rubio");
        cuenta2.setNumero("12345678901234567890");
        cuenta2.setInteres(1.75);
        cuenta2.setSaldo(300);

        cuenta cuenta3 = cuenta2;

        System.out.print(blue + "[ ? ] Introduce la cantidad a ingresar en " + "#" + cuenta1.numero + ": " + reset);
        double cantidad = sc.nextDouble();
        cuenta1.ingreso(cantidad);
        cuenta1.ver();
        cuenta2.ver();
        cuenta3.ver();
        cuenta3.transferir(cuenta3, cuenta2, 10.0);

        sc.close();
    }

}