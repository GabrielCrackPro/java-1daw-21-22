public class asignatura {
    private String codigo;
    private String nombre;
    private String curso;

    asignatura() {
    } // Constructor vacio

    asignatura(String codigo, String nombre, String curso) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.curso = curso;
    } // Constructor con parametros

    // Setters
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    // Getters
    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCurso() {
        return curso;
    }

    public static void main(String[] args) {
        asignatura asignatura1 = new asignatura("Matemáticas", "1017", "1");

        System.out.println("Codigo: " + asignatura1.getCodigo());
        System.out.println("Nombre: " + asignatura1.getNombre());
        System.out.println("Curso: " + asignatura1.getCurso());
    }
}