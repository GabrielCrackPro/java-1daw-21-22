public class Main {
    public static void main(String[] args) {
        Coche coche1 = new Coche();
        coche1.setModelo("Rolls Royce");
        coche1.setColor("Dorado");

        System.out.println(coche1.imprimeCoche());
        // Segun el enunciado solo hay que imprimir hasta aqui
        coche1.setEsMetalizado(true);
        coche1.setAñoFabricacion(2017);
        coche1.setTipoCoche(TIPO_COCHE.UTILITARIO);
        coche1.setSeguro(SEGURO.TODO_RIESGO);
    }
}
