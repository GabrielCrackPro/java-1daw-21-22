
enum TIPO_COCHE {
    MINI, UTILITARIO, FAMILIAR, DEPORTIVO
}

enum SEGURO {
    TERCEROS, TODO_RIESGO
}

public class Coche {
    private String modelo;
    private String color;
    private String matricula;
    private boolean esMetalizado;
    private int añoFabricacion;
    private TIPO_COCHE tipoCoche;
    private SEGURO seguro;

    Coche() {
    } // Constructor vacío

    Coche(String modelo, String color, String matricula, boolean esMetalizado, int añoFabricacion) {
        this.modelo = modelo;
        this.color = color;
        this.matricula = matricula;
        this.esMetalizado = esMetalizado;
        this.añoFabricacion = añoFabricacion;
    } // Constructor con parámetros

    // Setters
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setEsMetalizado(boolean esMetalizado) {
        this.esMetalizado = esMetalizado;
    }

    public void setAñoFabricacion(int añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }

    public void setTipoCoche(TIPO_COCHE tipoCoche) {
        this.tipoCoche = tipoCoche;
    }

    public void setSeguro(SEGURO seguro) {
        this.seguro = seguro;
    }

    // Getters
    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public String getMatricula() {
        return matricula;
    }

    public boolean getEsMetalizado() {
        return esMetalizado;
    }

    public int getAñoFabricacion() {
        return añoFabricacion;
    }

    public TIPO_COCHE getTipoCoche() {
        return tipoCoche;
    }

    public SEGURO getSeguro() {
        return seguro;
    }

    // Metodos
    public String imprimeCoche() {
        return "El modelo del coche es " + this.modelo + " y su color es " + this.color;
    }
}
