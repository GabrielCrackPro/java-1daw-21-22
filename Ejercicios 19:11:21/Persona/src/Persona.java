public class Persona {
    private String nombre, apellido;
    private int edad;

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        if (edad < 0 || edad > 100) {
            this.edad = 0;
        } else {
            this.edad = edad;
        }
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    // Otros métodos
    public boolean esAdolescente() {
        return edad >= 12 && edad < 20;
    }

    public String getFullName() {
        if (nombre.isEmpty() && apellido.isEmpty()) {
            return "";
        } else if (apellido.isEmpty()) {
            return nombre;
        } else if (nombre.isEmpty()) {
            return apellido;
        } else {
            return nombre + " " + apellido;
        }
    }
}
