public class Hucha {
    String nombre;
    int cantidad = 0;
    String proposito;

    // Colores
    public static final String verde = "\u001B[32m";
    public static final String reset = "\u001B[0m";

    public Hucha() {
    } // constructor vacio

    public Hucha(String nombre, int cantidad, String proposito) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.proposito = proposito;
    } // Constructor con parametros

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setProposito(String proposito) {
        this.proposito = proposito;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getProposito() {
        return proposito;
    }

    public String mostrarDatos() {
        return verde + "[ i ] La hucha de " + this.getNombre() + " tiene " + this.getCantidad()
                + " € y su proposito es " + this.getProposito() + reset;
    }
}
